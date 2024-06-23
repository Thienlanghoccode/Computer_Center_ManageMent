package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    //URL, Username , Password
    private static String url = "jdbc:sqlserver://LAPTOP-7FA5MVMC\\SQLEXPRESS:1433;databaseName=QLBanHangCT" 
    + ";encrypt=true;trustServerCertificate=true;";
    private static String username = "sa";
    private static String password = "123456";
    
    public static Connection getConnection() {
        try {
            // Đăng ký Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, username, password);
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Cannot load driver !");
        } 
        catch (SQLException ex) {
            System.out.println("Cannot connect to database !");
        }
        return null;
    }
    
    public static void closeConnection(Connection c) {
        try {
            // Ngắt Kết Nối
            if(c != null) {
                c.close();
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Connection conn = getConnection();
        System.out.println(conn);
    }
}
