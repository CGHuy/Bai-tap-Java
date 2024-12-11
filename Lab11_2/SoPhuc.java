/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11_2;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class SoPhuc {
    private
            float pt, pa;
    SoPhuc() {
        pt = 0;
        pa = 0;
    }
    SoPhuc(float a, float b) {
        pt = a;
        pa = b;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan thuc: "); pt = sc.nextFloat(); sc.nextLine();
        System.out.print("Nhap phan ao: "); pa = sc.nextFloat(); sc.nextLine();
    }
    public void output() {
        if (pa >= 0) {
            System.out.println(pt + "+" + pa + "i");
        } else {
            System.out.println(pt + pa + "i");
        }
    }
    public SoPhuc cong(SoPhuc a) {
        SoPhuc tong = new SoPhuc();
        tong.pt = pt + a.pt;
        tong.pa = pa + a.pa;
        return tong;
    }
    public SoPhuc nhan(SoPhuc a) {
        SoPhuc tich = new SoPhuc();
        tich.pt = pt*a.pt - pa*a.pa;
        tich.pa = pt*a.pa + pa*a.pt;
        return tich;
    }
    public static void main (String[] args) {
        SoPhuc a = new SoPhuc();
        SoPhuc b = new SoPhuc();
        System.out.println("Nhap so phuc A"); a.input();
        System.out.println("Nhap so phuc B") ;b.input();
        System.out.print("So phuc A: "); a.output();
        System.out.print("So phuc B: "); b.output();
        System.out.print("So phuc A + B: "); a.cong(b).output();
        SoPhuc c = a.nhan(b);
        System.out.print("Tich C = A x B: "); c.output();
    }
}
