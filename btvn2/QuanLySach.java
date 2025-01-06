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
public class QuanLySach {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TaiLieu> list = new ArrayList<>();
        
        while (true) {
            System.out.println("\n1. Nhap thong tin sach");
            System.out.println("2. Nhap thon tin tap chi");
            System.out.println("3. nhap thong tin bao");
            System.out.println("4. In thong tin");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban: "); int chose = sc.nextInt(); sc.nextLine();
            
            switch (chose) {
                case 1:
                    TaiLieu s = new Sach();
                    s.input();
                    list.add(s);
                    break;
                case 2:
                    TaiLieu tc = new TapChi();
                    tc.input();
                    list.add(tc);
                    break;
                case 3:
                    TaiLieu b = new Bao();
                    b.input();
                    list.add(b);
                    break;
                case 4:
                    for (TaiLieu i : list) {
                        System.out.println("----------------------------");
                        i.output();
                    }
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai!");
            }
        }
    }
}
