/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn5;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class SinhvienHTTT extends Sinhvien {
    private 
            int hp;
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap hoc phi: "); hp = sc.nextInt(); sc.nextLine();
    }
    public void output() {
        super.output();
        System.out.println("Hoc phi: " + hp);
    }
}
