/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_1;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class HSHocSinh extends Nguoi {
    private 
            String lop, khoahoc;
            int kyhoc;
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap lop hoc: "); lop = sc.nextLine();
        System.out.print("Nhap khoa hoc: "); khoahoc = sc.nextLine();
        System.out.print("Nhap ky hoc: "); kyhoc = sc.nextInt(); sc.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("Lop hoc: " + lop);
        System.out.println("Khoa hoc: " + khoahoc);
        System.out.println("Ky hoc: " + kyhoc);
    }
    
    public int getNs() {
        return ns;
    }
    
    public boolean check() {
        return ns == 1985 && que.equalsIgnoreCase("Thai Nguyen");
    }
}
