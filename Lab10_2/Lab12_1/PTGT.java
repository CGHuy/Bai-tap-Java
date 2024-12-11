/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_1;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class PTGT {
    private
            String hsx, nsx, gia, mau;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hang san xuat: "); hsx = sc.nextLine();
        System.out.print("Nhap ngay san xuat: "); nsx = sc.nextLine();
        System.out.print("Nhap gia ban: "); gia = sc.nextLine();
        System.out.print("Nhap mau xe: "); mau = sc.nextLine();  
    }
    public void output() {
        System.out.println("Hang san xuat: " + hsx);
        System.out.println("Ngay san xuat: " + nsx);
        System.out.println("Gia ban: " + gia);
        System.out.println("Mau xe: " + mau);
    }
    public String getMau() {
        return mau;
    }
}
