/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TheMuon> list = new ArrayList<>();
        System.out.print("NHAP SO LUONG SINH VIEN: "); int n = sc.nextInt(); sc.nextLine();
        
        System.out.println("----------------------------");
        System.out.println("NHAP THONG TIN CUA SINH VIEN");
        for (int i = 0; i < n; i++) {
            System.out.println("---------------");
            System.out.println("Sinh vien thu " + (i+1));
            TheMuon temp = new TheMuon();
            temp.input();
            list.add(temp);
        }
        
        System.out.println("--------------------------");
        System.out.println("IN THONG TIN CUA SINH VIEN");
        for (int i = 0; i < n; i++) {
            System.out.println("---------------");
            System.out.println("Sinh vien thu " + (i+1));
            list.get(i).output();
        }
    }
}
