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
public class KhoHang {
   public int MaSP;
    public String TenSP;
    public int TongSL;
    public String NgayNhap;

    public KhoHang(int MaSP, String TenSP, int TongSL, String NgayNhap) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.TongSL = TongSL;
        this.NgayNhap = NgayNhap;
    }

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

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    @Override
    public String toString() {
        return "KhoHang{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", TongSL=" + TongSL + ", NgayNhap=" + NgayNhap + '}';
    }
    
 
    
    
}
