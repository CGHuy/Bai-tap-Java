/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class QLCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CanBo> list = new ArrayList<>();
        boolean nhap = true;
        while (nhap) {
            System.out.println("1. Nhap thong tin moi cho can bo");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Thoat");
            System.out.print("Nhap lua chon cua ban: "); int n = sc.nextInt(); sc.nextLine();
            switch (n) {
                case 1:
                    System.out.println("---------------------");
                    System.out.println("NHAP THONG TIN CAN BO");
                    System.out.println("1. Cong nhan");
                    System.out.println("2. Ky su");
                    System.out.println("3. Nhan vien phuc vu");
                    System.out.print("Nhap loai can bo can chon: "); int loaicb = sc.nextInt();
                    switch (loaicb) {
                        case 1:
                            CongNhan a = new CongNhan();
                            a.input();
                            list.add(a);
                            break;
                        case 2:
                            KySu b = new KySu();
                            b.input();
                            list.add(b);
                            break;
                        case 3:
                            NhanVien c = new NhanVien();
                            c.input();
                            list.add(c);
                            break;
                    }
                    break;
                case 2:
                    String name;
                    System.out.println("---------------------------");
                    System.out.print("NHAP HO TEN MUON TIM KIEM: "); name = sc.nextLine();
                    for (CanBo i : list) {
                        if (i.getTen().equalsIgnoreCase(name) == true) {
                            i.output();
                        }
                    }
                    break;
                case 3:
                    nhap = false;
                    break;
            }
        }
        
    }
}
