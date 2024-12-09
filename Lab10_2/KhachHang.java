/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10_2;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class KhachHang {
    private 
            String ht, sn, id;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten chu ho: "); ht = sc.nextLine();
        System.out.print("Nhap so nha: "); sn = sc.nextLine();
        System.out.print("Nhap ma so cong to: "); id = sc.nextLine();
    }
    public void output() {
        System.out.println("Ho ten chu ho: " + ht);
        System.out.println("So nha: " + sn);
        System.out.println("Ma so cong to: " + id);
    }
}
