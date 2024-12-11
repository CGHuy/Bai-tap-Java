/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class QLPTGT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PTGT> list = new ArrayList<>();
        boolean nhap = true;
        while (nhap) {
            System.out.println("1. Nhap cac phuong tien");
            System.out.println("2. Tim kiem phuong tien theo mau");
            System.out.println("3. Thoat");
            System.out.print("Nhap lua chon cua ban: "); int n = sc.nextInt(); sc.nextLine();
            switch (n) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("NHAP THONG TIN PHUONG TIEN GIAO THONG");
                    System.out.println("1. O to");
                    System.out.println("2. Xe may");
                    System.out.println("3. Xe tai");
                    System.out.print("Nhap loai xe muon chon: "); int loaixe = sc.nextInt();
                    switch (loaixe) {
                        case 1:
                            OTo a = new OTo();
                            a.input();
                            list.add(a);
                            break;
                        case 2:
                            XeMay b = new XeMay();
                            b.input();
                            list.add(b);
                            break;
                        case 3:
                            XeTai c = new XeTai();
                            c.input();
                            list.add(c);
                            break;
                    }
                    break;
                case 2:
                    String nhapmau;
                    System.out.println("---------------------");
                    System.out.print("NHAP MAU CAN TIM KIEM: "); nhapmau = sc.nextLine();
                    for (PTGT i : list) {
                        if (i.getMau().equalsIgnoreCase(nhapmau) == true) {
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
