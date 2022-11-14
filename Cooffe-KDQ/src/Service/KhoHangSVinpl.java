/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.KhoHang;
import dao.KhoHangDAO;
import dao.KhoHangDAOImpl;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class KhoHangSVinpl implements KhoHangSV{

    private KhoHangDAO khohangDAO = null;
    
    public KhoHangSVinpl(){
        khohangDAO = new KhoHangDAOImpl(){};
        
    }
    @Override
    public List<KhoHang> getList() {
        return khohangDAO.getList();
    }
    
  
    
}
