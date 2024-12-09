/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10_1;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class SinhVien {
    private 
            String ht, ns, tuoi, lop;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: "); ht = sc.nextLine();
        System.out.print("Nhap nam sinh: "); ns = sc.nextLine();
        System.out.print("Nhap tuoi: "); tuoi = sc.nextLine();
        System.out.print("Nhap lop: "); lop = sc.nextLine();
    }
    public void output() {
        System.out.println("Ho ten: " + ht);
        System.out.println("Nam sinh: " + ns);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Lop: " + lop);
    }
}
