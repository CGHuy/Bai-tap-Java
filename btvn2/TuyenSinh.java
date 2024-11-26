/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class TuyenSinh {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> danhsach = new ArrayList();
        int n;
        
        System.out.print("Nhap so luong thi sinh: "); n = sc.nextInt(); sc.nextLine();
        System.out.println("-------------------------------");
        System.out.println("NHAP THONG TIN");
        for (int i = 0; i < n; i++) {
            System.out.println("-------------------------------");
            ThiSinh nhap = null;
            System.out.println("Chon khoi thi: ");
            System.out.println("1. Khoi A");
            System.out.println("2. Khoi B");
            System.out.println("3. Khoi C");
            System.out.print("Khoi thi cua thi sinh la: ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap = new KhoiA();
                    nhap.input();
                    danhsach.add(nhap);
                    break;
                case 2:
                    nhap = new KhoiB();
                    nhap.input();
                    danhsach.add(nhap);
                    break;
                case 3:
                    nhap = new KhoiC();
                    nhap.input();
                    danhsach.add(nhap);
                    break;
                default:
                    System.out.println("Loi!");
            }
        }
        System.out.println("-------------------------------");
        System.out.println("IN THONG TIN");
        for (int i = 0; i < n; i++) {
            System.out.println("-------------------------------");
            danhsach.get(i).output();
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
