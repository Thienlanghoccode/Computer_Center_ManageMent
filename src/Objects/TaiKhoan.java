/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;

public class TaiKhoan implements Serializable{
    private String maNV;
    private String user;
    private String password;
    private boolean isAdmin;

    public TaiKhoan() {
    }

    public TaiKhoan(String maNV, String user, String password, boolean isAdmin) {
        this.maNV = maNV;
        this.user = user;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
}
