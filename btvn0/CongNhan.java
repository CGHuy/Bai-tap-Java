/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn0;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class CongNhan extends CanBo {
    private int bac;
    
    public boolean checkbac() {
        return bac < 0 || bac > 7;
    }
    
    @Override
    public void input() {
        super.input();
        Scanner cb = new Scanner(System.in);
        System.out.print("Nhap bac luong: "); bac = cb.nextInt();
        while (checkbac()) {
            System.out.print("Nhap lai bac luong: "); bac = cb.nextInt();
        }
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("Bac luong la: " + bac);
    }
}
