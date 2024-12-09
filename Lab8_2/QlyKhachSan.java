/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class QlyKhachSan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachSan> list = new ArrayList<>();
        System.out.print("NHAP SO KHACH TRO: "); int n = sc.nextInt(); sc.nextLine();
        
        System.out.println("------------------------");
        System.out.println("NHAP THONG TIN KHACH TRO");
        for (int i = 0; i < n; i++) {
            System.out.println("---------------");
            System.out.println("Khach thu " + (i + 1));
            KhachSan temp = new KhachSan();
            temp.input1();
            list.add(temp);
        }
        
        System.out.println("----------------------");
        System.out.println("IN THONG TIN KHACH TRO");
        for (int i = 0; i < n; i++) {
            System.out.println("---------------");
            System.out.println("Khach thu " + (i + 1));
            list.get(i).output1();
        }
    }
}
