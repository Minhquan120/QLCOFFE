/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class KhoHang implements Serializable{
    private int MaSP;
    private String TenSP;
    private int TongSL;

    


    public KhoHang() {
    }

    

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getTongSL() {
        return TongSL;
    }

    public void setTongSL(int TongSL) {
        this.TongSL = TongSL;
    }

    @Override
    public String toString() {
        return "KhoHang{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", TongSL=" + TongSL + '}';
    }
    
}
