/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class NguoiLon extends DocGia {
    String CMND ;

    public NguoiLon() {
        super();
    }

    public NguoiLon(String CMND, String Hoten, String NgayLap, int SoThangHL) {
        super(Hoten, NgayLap, SoThangHL);
        this.CMND = CMND;
    }
    
    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }
    
    @Override
    public float TinhTienThe() {
        return getSoThangHL() * 10000;
    }
    
}
