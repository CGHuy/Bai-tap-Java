/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn3;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class ThiSinh {
    private
            String id, ten, diachi, ut;
    public void input() {
        Scanner a = new Scanner(System.in);
        System.out.print("Nhap so bao danh: "); id = a.nextLine();
        System.out.print("Nhap ho ten: "); ten = a.nextLine();
        System.out.print("Nhap dia chi: "); diachi = a.nextLine();
        System.out.print("Nhap muc do uu tien: "); ut = a.nextLine();
    }
    public void output() {
        System.out.println("So bao danh: " + id);
        System.out.println("Ho ten: " + ten);
        System.out.println("Dia chi: " + diachi);
        System.out.println("Muc do uu tien: " + ut);
    }    
}
