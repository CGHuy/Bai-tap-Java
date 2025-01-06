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
public class KhoiC extends ThiSinh {
    private
            int van, su, dia;
    @Override
    public void input() {
        super.input();
        Scanner d = new Scanner(System.in);
        System.out.print("Nhap diem van: "); van = d.nextInt(); d.nextLine();
        System.out.print("Nhap diem su: "); su = d.nextInt(); d.nextLine();
        System.out.print("Nhap diem dia: "); dia = d.nextInt(); d.nextLine();
    }
    @Override
    public void output() {
        System.out.println("THI SINH KHOI C");
        super.output();
        System.out.println("Diem van: " + van);
        System.out.println("Diem su: " + su);
        System.out.println("Diem dia: " + dia);
    }
}
