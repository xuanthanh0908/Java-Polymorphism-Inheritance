
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
            int n, luachon = 0;
            System.out.print("NHAP N = ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            DocGia[] a = new DocGia[n];
            System.out.println("LUA CHON (1.TRE EM : 2.NGUOI  LON) ");
            for(int i = 0; i <n ; i ++)
            {
                System.out.print("NHAP LUA CHON = ");
                luachon = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhap ho ten : ");
                String hoten = sc.nextLine();
                System.out.print("Nhap ngay lap : ");
                String NgayLap = sc.nextLine();
                System.out.print("Nhap so thang con hieu luc : ");
                int SoNgayHL = Integer.parseInt(sc.nextLine());
                if(luachon == 1)
                {
                    System.out.print("Nhap ho ten NDD : ");
                    String HotenNDD = sc.nextLine();
                    a[i] = new TreEm(HotenNDD, hoten, NgayLap, SoNgayHL);
               
                }
                else {
                    System.out.print("Nhap CMND : ");
                    String CMND = sc.nextLine();
                    a[i] = new NguoiLon(CMND, hoten, NgayLap, SoNgayHL);
                }
           
        }
        
            for (DocGia Dg : a) {
            Dg.xuatThongTin();
            System.out.println("Tinh tien the : " + Dg.TinhTienThe());
        }
    }
}
