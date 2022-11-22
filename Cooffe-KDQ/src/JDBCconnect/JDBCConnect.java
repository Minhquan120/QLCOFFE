/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCconnect;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLDataException;

/**
 *
 * @author Administrator
 */
public class JDBCConnect {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CaPhe;user=sa;password=0839294607");
           if (conn != null) {
                System.err.println("Kết Nối Thành Công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }

}
