/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn5;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class SinhvienUTT extends Sinhvien {
    private 
            String dv;
            int luong;
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap don vi: "); dv = sc.nextLine();
        System.out.print("Nhap luong: "); luong = sc.nextInt(); sc.nextLine();
    }
    public void output() {
        super.output();
        System.out.println("Don vi: " + dv);
        System.out.println("Nhap luong: " + luong);
    }
}
