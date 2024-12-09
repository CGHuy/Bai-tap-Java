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
public class BienLai extends KhachHang {
    private 
            int csc, csm, tien;
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien cu: "); csc = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap so dien moi: "); csm = sc.nextInt(); sc.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("So dien cu: " + csc);
        System.out.println("So dien moi: " + csm);
        tien = (csm - csc)*750;
        System.out.println("So tien phai tra: " + tien);
    }
}
