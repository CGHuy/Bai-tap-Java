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
public class Bao extends TaiLieu {
    private
            String nph;
    
    @Override
    public void input() {
        super.input();
        Scanner d = new Scanner(System.in);
        System.out.println("Nhap ngay phat hanh: "); nph = d.nextLine();
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("Ngay phat hanh la: " + nph);
    }       
}
