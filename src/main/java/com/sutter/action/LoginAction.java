package com.sutter.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private String name;

    public String execute() {
        String ret = ERROR;
        Connection conn = null;

        try {
            String URL = "jdbc:mysql://flightpub.cjx5ms2fnggm.us-west-2.rds.amazonaws.com/struts2?serverTimezone=UTC";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "seng3150", "seng3150_2018");
            String sql = "SELECT name FROM users WHERE";
            sql+=" username = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                name = rs.getString(1);
                ret = SUCCESS;
            }
        } catch (Exception e) {
            ret = ERROR;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }
        return ret;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
