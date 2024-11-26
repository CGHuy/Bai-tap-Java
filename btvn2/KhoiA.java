/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class KhoiA extends ThiSinh {
    private
            int toan, ly, hoa;
    @Override
    public void input() {
        super.input();
        Scanner b = new Scanner(System.in);
        System.out.print("Nhap diem toan: "); toan = b.nextInt(); b.nextLine();
        System.out.print("Nhap diem ly: "); ly = b.nextInt(); b.nextLine();
        System.out.print("Nhap diem hoa: "); hoa = b.nextInt(); b.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("Diem toan: " + toan);
        System.out.println("Diem ly: " + ly);
        System.out.println("Diem hoa: " + hoa);   
    }
}
