/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class Number {
    private 
            int min, max, value;
    public void input() {
        Scanner sc = new Scanner(System.in);
        boolean giaTriHopLe = false;
        while (!giaTriHopLe) {
            try {
            System.out.print("Nhap gia tri nho nhat: "); min = sc.nextInt();
            System.out.print("Nhap gia tri lon nhat: "); max = sc.nextInt();
            if (min >= max) {
                throw new IllegalArgumentException("Gia tri min phai nho hon gia tri max.");
            }
            System.out.print("Nhap gia tri: "); value = sc.nextInt();
            if (value <= min || value >= max) {
                throw new IllegalArgumentException("Gia tri phai nam trong khoang (min, max).");
            }
            giaTriHopLe = true;
            System.out.println("Nhap gia tri thanh cong");
            } catch (InputMismatchException e) {
                System.out.println("Loi: Vui long nhap so nguyen hop le.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Loi: " + e.getMessage());
                sc.nextLine();
            }
        }
    }
    
    public boolean soNguyenTo() {
        if (value < 2) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }
    
    public void ghiFile (String tenFile) {
        if (soNguyenTo()) {
            try {
                FileWriter fw = new FileWriter(tenFile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Min la: " + min + ", Max la: " + max + ", Value la: " + value);
                bw.newLine();
                bw.close();
                fw.close();
                System.out.println("Thong tin da duoc luu vao file");
            } catch (IOException e) {
                System.out.println("Loi khi ghi vao file");
            }
        } else {
            System.out.println("Value khong phai la so nguyen to");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number so = new Number();
        boolean running = true;
        while (true) {
            System.out.println("-------MENU-------");
            System.out.println("1. Khoi tao gia tri");
            System.out.println("2. Luu tru");
            System.out.println("3. Thoat");
            System.out.print("Lua chon cua ban: "); int n = sc.nextInt(); sc.nextLine();
            
            switch (n) {
                case 1:
                    so.input();
                    break;
                case 2:
                    so.ghiFile("D:\\FileText\\Java\\BaiKtra.txt");
                    break;
                case 3:
                    System.out.println("Ban da thoat khoi chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le, yeu cau nhap lai");
            }
        }
    }
}


