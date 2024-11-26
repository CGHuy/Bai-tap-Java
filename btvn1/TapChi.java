/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class TapChi extends TaiLieu {
    private
            int sph, tph;
    
    @Override
    public void input() {
        super.input();
        Scanner c = new Scanner(System.in);
        System.out.print("Nhap so phat hanh: "); sph = c.nextInt(); c.nextLine();
        System.out.print("Nhap thang phat hanh: "); tph = c.nextInt(); c.nextLine();
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("So phat hanh la: " + sph);
        System.out.println("Thang phat hanh la: " + tph);
    }
}
