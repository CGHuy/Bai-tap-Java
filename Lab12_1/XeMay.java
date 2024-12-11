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
public class XeMay extends PTGT {
    private 
            String congsuat;
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cong suat cua xe may: "); congsuat = sc.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("Cong xuat cua xe may: " + congsuat);
    }
}
