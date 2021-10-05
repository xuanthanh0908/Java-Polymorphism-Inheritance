/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TreEm extends DocGia{
    String HoTenNDD;
    public TreEm() {
        super();
    }

    public TreEm(String HoTenNDD, String Hoten, String NgayLap, int SoThangHL) {
        super(Hoten, NgayLap, SoThangHL);
        this.HoTenNDD = HoTenNDD;
    }

    
    
    public String getHoTenNDD() {
        return HoTenNDD;
    }

    public void setHoTenNDD(String HoTenNDD) {
        this.HoTenNDD = HoTenNDD;
    }
    
    @Override
    public float TinhTienThe() {
        return getSoThangHL() * 5000;
    }
}
