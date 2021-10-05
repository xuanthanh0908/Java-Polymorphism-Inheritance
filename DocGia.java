/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public abstract class DocGia {
        private String Hoten;
        private String NgayLap;
        protected int SoThangHL;

        public DocGia() {
        }
        
        public DocGia(String Hoten, String NgayLap, int SoThangHL) {
            this.Hoten = Hoten;
            this.NgayLap = NgayLap;
            this.SoThangHL = SoThangHL;
        }

        public String getHoten() {
            return Hoten;
        }

        public void setHoten(String Hoten) {
            this.Hoten = Hoten;
        }

        public String getNgayLap() {
            return NgayLap;
        }

        public void setNgayLap(String NgayLap) {
            this.NgayLap = NgayLap;
        }

        public int getSoThangHL() {
            return SoThangHL;
        }

        public void setSoThangHL(int SoThangHL) {
            this.SoThangHL = SoThangHL;
        }
        public void xuatThongTin() {
        System.out.println("===== Ho ten: " + this.Hoten + " =====");
        System.out.println("===== Ngay Lap: " + this.NgayLap);
        System.out.println("==== So thang hieu luc: " + this.SoThangHL + " Thang");
    }
        public abstract float TinhTienThe();

}
