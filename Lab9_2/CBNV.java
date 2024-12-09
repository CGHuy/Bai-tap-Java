/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_2;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class CBNV {
     private 
             String ht, ns, qq;
     public void input() {
         Scanner sc = new Scanner(System.in);
         System.out.print("Nhap ho ten: "); ht = sc.nextLine();
         System.out.print("Nhap nam sinh: "); ns = sc.nextLine();
         System.out.print("Nhap que quan: "); qq = sc.nextLine();
     }
     public void output() {
         System.out.println("Ho ten: " + ht);
         System.out.println("Nam sinh: " + ns);
         System.out.println("Que quan: " + qq);
     }
}
