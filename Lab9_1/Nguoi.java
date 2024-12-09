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
public class Nguoi {
    protected 
            String ht, que;
            int tuoi, ns;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: "); ht = sc.nextLine();
        System.out.print("Nhap tuoi: "); tuoi = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap nam sinh: "); ns = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap que quan: "); que = sc.nextLine();
    }
    
    public void output() {
        System.out.println("Ho ten: " + ht);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Nam sinh: " + ns);
        System.out.println("Que quan: " + que);
    }

}
