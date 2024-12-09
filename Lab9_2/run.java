/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nguoi> list = new ArrayList<>();
        System.out.print("NHAP SO LUONG CAN BO NHAN VIEN: "); int n = sc.nextInt(); sc.nextLine();
        
        System.out.println("-----------------------------------");
        System.out.println("NHAP THONG TIN CUA CAN BO NHAN VIEN");
        for (int i = 0; i < n; i++) {
            System.out.println("------------");
            System.out.println("Can bo thu " + (i+1));
            Nguoi temp = new Nguoi();
            temp.input();
            list.add(temp);
        }
        
        System.out.println("---------------------------------");
        System.out.println("IN THONG TIN CUA CAN BO NHAN VIEN");
        for (int i = 0; i < n; i++) {
            System.out.println("------------");
            System.out.println("Can bo thu " + (i+1));
            list.get(i).output();
        }
    }
}
