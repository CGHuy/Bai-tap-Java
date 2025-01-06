/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class run {
    private static void luuSinhvien (Sinhvien sv, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sv);
            System.out.println("Ghi thanh cong");
        } catch (Exception e) {
            System.out.println("Loi xay ra: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------MENU------");
            System.out.println("1. Sinh vien HTTT");
            System.out.println("2. Sinh vien UTT");
            System.out.println("3. Thoat");
            System.out.print("Nhap lua chon cua ban: "); int chose = sc.nextInt(); sc.nextLine();
            
            switch (chose) {
                case 1:
                    SinhvienHTTT svHTTT = new SinhvienHTTT();
                    svHTTT.input();
                    luuSinhvien(svHTTT,"D:\\FileText\\Java\\svhttt.txt");
                    break;
                case 2:
                    SinhvienUTT svUTT = new SinhvienUTT();
                    svUTT.input();
                    luuSinhvien(svUTT,"D:\\FileText\\Java\\svutt.txt");
                    break;
                case 3:
                    System.out.println("Ban da thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai!");
            }
        }
    }
}
