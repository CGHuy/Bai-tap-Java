/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_2;

import java.util.Scanner;

public class CanBo {
    private String ht, gt, dc;
    private int ns;
    public boolean checkht() {
        return ht == null || ht.isEmpty();
    }
    public boolean checkns() {
        return ns <= 1900 || ns >= 2024;
    }
    public boolean checkgt() {
        return (gt.equalsIgnoreCase("Nam") == false && gt.equalsIgnoreCase("Nu") == false) || gt == null;
    }
    public boolean checkdc() {
        return dc == null || dc.isEmpty();
    }
    public void input() {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Nhap ho ten: "); ht = a.nextLine();
        while (checkht()) {
            System.out.print("Nhap lai ho ten: "); ht = a.nextLine();
        }
        
        System.out.print("Nhap nam sinh: "); ns = a.nextInt(); a.nextLine();
        while (checkns()) {
            System.out.print("Nhap lai nam sinh: "); ns = a.nextInt(); a.nextLine();
        }
        
        System.out.print("Nhap gioi tinh: "); gt = a.nextLine();
        while (checkgt()) {
            System.out.print("Nhap lai gioi tinh: "); gt = a.nextLine();
        }
        
        System.out.print("Nhap dia chi: "); dc = a.nextLine();
        while (checkdc()) {
            System.out.print("Nhap lai dia chi: "); dc = a.nextLine();
        }
    }
    public void output() {
        System.out.println("Ho ten la: " + ht);
        System.out.println("Nam sinh la: " + ns);
        System.out.println("Gioi tinh la: " + gt);
        System.out.println("Dia chi la: " + dc);
    }
    public String getTen() {
        return ht;
    }
}
