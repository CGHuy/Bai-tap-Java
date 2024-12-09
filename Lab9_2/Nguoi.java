/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_2;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class Nguoi extends CBNV {
    private 
            int lc, t, p;
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong cung: "); lc = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap tien thuong: "); t = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap tien phat: "); p = sc.nextInt(); sc.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("Luong cung: " + lc);
        System.out.println("Tien thuong: " + t);
        System.out.println("Tien phat: "  + p);
        System.out.println("Luong thuc linh: " + (lc+t-p));
    }
}
