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
public class TaiLieu {
    private
            String mtl, nxb;
            int sbph;
    public void input() {
        Scanner a = new Scanner(System.in);
        System.out.print("Nhap ma tai lieu: "); mtl = a.nextLine();
        System.out.print("Nhap ten nha xuat ban: "); nxb = a.nextLine();
        System.out.print("Nhap so ban phat hanh: "); sbph = a.nextInt(); a.nextLine();
    }
    public void output() {
        System.out.println("Ma tai lieu la: " + mtl);
        System.out.println("Ten nha xuat ban la: " + nxb);
        System.out.println("So ban phat hanh la: " + sbph);
    }     
}
