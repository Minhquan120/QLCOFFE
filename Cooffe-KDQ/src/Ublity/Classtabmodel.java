/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ublity;


import Model.KhoHang;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Classtabmodel {
    public DefaultTableModel setTableKhoHang(List<KhoHang> listItem,String[] listColumn){
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
           @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 3 ? boolean.class: String.class;
                
            }         
        };
          dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        KhoHang k= null;
        for (int i = 0; i < num; i++) {
            k=listItem.get(i);
            obj =new Object[columns];
            obj [0]=k.getMaSP();
            obj [1]=k.getTenSP();
            obj [2]=k.getTongSL();
            dtm.addRow(obj);
        }
        return dtm;
    }
}
