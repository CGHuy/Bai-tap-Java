/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BienLai> list = new ArrayList<>();
        System.out.print("NHAP SO LUONG HO GIA DINH: "); int n = sc.nextInt(); sc.nextLine();
        
        System.out.println("----------------------------------");
        System.out.println("NHAP THONG TIN CUA MOI HO GIA DINH");
        for (int i = 0; i < n; i++) {
            System.out.println("-----------------");
            System.out.println("Ho gia dinh thu " + (i+1));
            BienLai temp = new BienLai();
            temp.input();
            list.add(temp);
        }
        
        System.out.println("--------------------------------");
        System.out.println("IN THONG TIN CUA CAC HO GIA DINH");
        for (int i = 0; i < n; i++) {
            System.out.println("-----------------");
            System.out.println("Ho gia dinh thu " + (i+1));
            list.get(i).output();
        }
    }
}
