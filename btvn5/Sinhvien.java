/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class Sinhvien implements Serializable {
    private 
            String msv, ht, ns, gt;
            float dtb;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: "); msv = sc.nextLine();
        System.out.print("Nhap ho ten: "); ht = sc.nextLine();
        System.out.print("Nhap ngay sinh: "); ns = sc.nextLine();
        System.out.print("Nhap gioi tinh: "); gt = sc.nextLine();
        System.out.print("Nhap diem trung binh: "); dtb = sc.nextFloat(); sc.nextLine();
    }
    public void output() {
        System.out.println("Ma sinh vien: " + msv);
        System.out.println("Ho ten: " + ht);
        System.out.println("Ngay sinh: " + ns);
        System.out.println("Gioi tinh: " + gt);
        System.out.println("Diem trung binh: " + dtb);
    }
    
}
