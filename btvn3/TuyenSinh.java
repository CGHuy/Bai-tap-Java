/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class TuyenSinh {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> list = new ArrayList();

        while (true) {
            System.out.println("\nCHON KHOI THI");
            System.out.println("1. Khoi A");
            System.out.println("2. Khoi B");
            System.out.println("3. Khoi C");
            System.out.println("4. In thong tin thi sinh");
            System.out.println("5. Thoat");
            System.out.print("Khoi thi cua thi sinh la: ");
            int chon = sc.nextInt(); sc.nextLine();
            switch (chon) {
                case 1:
                    ThiSinh a = new KhoiA();
                    a.input();
                    list.add(a);
                    break;
                case 2:
                    ThiSinh b = new KhoiB();
                    b.input();
                    list.add(b);
                    break;
                case 3:
                    ThiSinh c = new KhoiC();
                    c.input();
                    list.add(c);
                    break;
                case 4:
                    for (ThiSinh i : list) {
                        System.out.println("---------------------------");
                        i.output();
                    }
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai!");
            }
        }

        /*
        System.out.println("-------------------------------");
        System.out.println("NHAP THONG TIN");
        for (int i = 0; i < n; i++) {
            System.out.println("-------------------------------");
            listA[i] = new KhoiA();
            listA[i].input();
        }
        
        System.out.println("-------------------------------");
        System.out.println("IN THONG TIN");
        for (int i = 0; i < n; i++) {
            System.out.println("-------------------------------");
            listA[i].output();
           
        }
        */   
    }
}
