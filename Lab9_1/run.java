/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HSHocSinh> list = new ArrayList<>();
        System.out.print("NHAP SO HOC SINH: "); int n = sc.nextInt(); sc.nextLine();
        
        System.out.println("-----------------------");
        System.out.println("NHAP THONG TIN HOC SINH");
        for (int i = 0; i < n; i++) {
            System.out.println("---------------");
            System.out.println("Hoc sinh thu " + (i+1));
            HSHocSinh temp = new HSHocSinh();
            temp.input();
            list.add(temp);
        }
        
        System.out.println("---------------------");
        System.out.println("IN THONG TIN HOC SINH");
        for (int i = 0; i < n; i++) {
            System.out.println("---------------");
            System.out.println("Hoc sinh thu " + (i+1));
            list.get(i).output();
        }
        
        System.out.println("----------------------------");
        System.out.println("NHUNG HOC SINH SINH NAM 1985");
        for (int i = 0; i < n; i++) {
            if (list.get(i).getNs() == 1985) {
                System.out.println("---------------");
                System.out.println("Hoc sinh thu " + (i+1));
                list.get(i).output();
            }
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("NHUNG HOC SINH SINH NAM 1985 VA CO QUE THAI NGUYEN");
        for (int i = 0; i < n; i++) {
            if (list.get(i).check()) {
                System.out.println("---------------");
                System.out.println("Hoc sinh thu " + (i+1));
                list.get(i).output();
            }
        }
    }
}
