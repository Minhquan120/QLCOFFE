/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Model.KhoHang;
import cooffe.kdq.JDBCConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class KhoHangDAOImpl implements KhoHangDAO{
    @Override
    public List<KhoHang> getList(){
        try {
            Connection cons = JDBCConnect.getConnection();
            String sql = "select * from KhoHang";
            List<KhoHang> list = new ArrayList<>();
            //PreparedStatement ps = cons.prepareCall(sql);
            //ResultSet rs = ps.executeQuery();
            Statement st = cons.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                KhoHang khohang = new KhoHang();
                khohang.setMaSP(rs.getInt("MaSP"));
                khohang.setTenSP(rs.getString("TenSP"));
                khohang.setTongSL(rs.getInt("TongSL"));
               
                list.add(khohang);
            }
            //ps.close();
            st.close();
            rs.close();
            cons.close();
            return list;
            } catch (SQLException ex) {
                  ex.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        KhoHangDAO khohangDAO = new KhoHangDAOImpl();
        System.out.println(khohangDAO.getList());
    }
}
