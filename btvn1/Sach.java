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
public class Sach extends TaiLieu {
    private
            String tg;
            int sotrang;
            
    @Override
    public void input() {
        super.input();
        Scanner b = new Scanner(System.in);
        System.out.print("Nhap ten tac gia: "); tg = b.nextLine();
        System.out.print("Nhap so trang: "); sotrang = b.nextInt(); b.nextLine();
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("Ten tac gia la: " + tg);
        System.out.println("So trang la: " + sotrang);
    }
}
