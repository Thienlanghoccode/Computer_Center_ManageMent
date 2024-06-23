package Dao;

import Connect.JDBCConnection;
import Objects.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HoaDonDao {

    public static void insertHD(HoaDon sp) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "insert into HoaDon values(?,?,?,?,?,?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1, sp.getMaHD());
            pre.setString(2, sp.getMaNV());
            pre.setString(3, sp.getSoDT());
            pre.setString(4, sp.getTenKH());
            pre.setString(5, sp.getNgayLap());
            pre.setString(6, sp.getDiaChi());

            pre.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex);
        } finally {
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException ex) {
                    System.out.println("Lỗi: " + ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("Lỗi: " + ex);
                }
            }
        }
    }

    public static void deleteHD(String maHD) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "delete from HoaDon where maHD = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, maHD);

            pre.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex);
        } finally {
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException ex) {
                    System.out.println("Lỗi: " + ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("Lỗi: " + ex);
                }
            }
        }
    }
}
