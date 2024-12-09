/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8_1;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class Nguoi {
    private
            String ht, ns, nghe;
            int tuoi;
            
    public void input1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: "); ht = sc.nextLine();
        System.out.print("Nhap tuoi: "); tuoi = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap nam sinh: "); ns = sc.nextLine();
        System.out.print("Nhap nghe nghiep: "); nghe = sc.nextLine(); 
    }
    
    public void output1() {
        System.out.println("Ho va ten: " + ht);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Nam sinh: " + ns);
        System.out.println("Nghe nghiep: " + nghe);
    }
    
}
