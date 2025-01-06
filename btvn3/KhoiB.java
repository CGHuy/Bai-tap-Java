/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn3;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class KhoiB extends ThiSinh {
    private
            int toan, hoa, sinh;
    @Override
    public void input() {
        super.input();
        Scanner c = new Scanner(System.in);
        System.out.print("Nhap diem toan: "); toan = c.nextInt(); c.nextLine();
        System.out.print("Nhap diem hoa: "); hoa = c.nextInt(); c.nextLine();
        System.out.print("Nhap diem sinh: "); sinh = c.nextInt(); c.nextLine();
    }
    @Override
    public void output() {
        System.out.println("THI SINH KHOI B");
        super.output();
        System.out.println("Diem toan: " + toan);
        System.out.println("Diem hoa: " + hoa);
        System.out.println("Diem sinh: " + sinh);
    }
}
