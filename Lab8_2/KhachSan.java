/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8_2;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class KhachSan extends Nguoi {
    private 
        int snt, gp;
        String lp;
        
    public void input1() {
        Scanner sc = new Scanner(System.in);
        input();
        System.out.print("Nhap so ngay thue: "); snt = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap loai phong: "); lp = sc.nextLine();
        System.out.print("Nhap gia phong: "); gp = sc.nextInt(); sc.nextLine();
    }
    
    public void output1() {
        output();
        System.out.println("So ngay thue: " + snt);
        System.out.println("Loai phong: " + snt);
        System.out.println("Gia phong: " + snt);
    }
}
