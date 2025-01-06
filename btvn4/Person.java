/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn4;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class Person {
    private 
            String ht, ns, dc, gt;
    public Person() {}
    public Person(String ht, String ns, String dc, String gt) {
        this.ht = ht;
        this.ns = ns;
        this.dc = dc;
        this.gt = gt;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: "); ht = sc.nextLine();
        System.out.print("Nhap ngay sinh: "); ns = sc.nextLine();
        System.out.print("Nhap dia chi: "); dc = sc.nextLine();
        System.out.print("Nhap gioi tinh: "); gt = sc.nextLine();
    }        
    public void output() {
        System.out.println("Ho ten: " + ht);
        System.out.println("Ngay sinh: " + ns);
        System.out.println("Dia chi: " + dc);
        System.out.println("Gioi tinh: " + gt);
    }   
}
