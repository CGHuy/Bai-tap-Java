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
public class CongNhan extends CanBo{
    private int bac;
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        do {
            System.out.print("Nhap cap bac cua cong nhan: "); bac = sc.nextInt(); sc.nextLine();
            if (checkBac()) {
                System.out.println("Cap bac khong hop le");
            }
        } while (checkBac());
        
    }
    public void output() {
        System.out.println("CONG NHAN");
        super.output();
        System.out.println("Cap bac: " + bac);
    }
    
    public boolean checkBac() {
        return bac < 0 || bac > 7;
    }
}
