/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.KhoHang;
import Service.KhoHangSV;
import Service.KhoHangSVinpl;
import Ublity.Classtabmodel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Administrator
 */
public class CaPheController {
    private JPanel jpnView;
    private JButton btnThem;
    private JTextField jtfSearch;
    
    private Classtabmodel classtabmodel=null;
    
    private final String[] COLUMNS = {"Mã Sản Phẩm","Tên Sản Phẩm","Số Lượng"};
    private TableRowSorter<TableModel> rowSorter = null;

    private KhoHangSV khohangsv = null;
    
    public CaPheController(JPanel jpnView, JButton btnThem, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnThem = btnThem;
        this.jtfSearch = jtfSearch;
        this.classtabmodel = new Classtabmodel();
        this.khohangsv = new KhoHangSVinpl();
    }
    
        public void setDataToTable() {
        List<KhoHang> listItem = khohangsv.getList();
        DefaultTableModel model = classtabmodel.setTableKhoHang(listItem, COLUMNS);
            JTable table = new JTable(model);

        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jpnView.removeAll();
        jpnView.setLayout(new CardLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
        }
        
}
