/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class KhuPho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HoDan> list = new ArrayList<>();
        System.out.print("NHAP SO HO DAN: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("-------------------------");
        System.out.println("NHAP THONG TIN HO DAN");
        for (int i = 0; i < n; i++) {
            System.out.println("-------------------------");
            System.out.println("Ho gia dinh thu " + (i+1));
            HoDan temp = new HoDan();
            temp.input();
            list.add(temp);
        }

        System.out.println("-------------------------");
        System.out.println("IN THONG TIN HO DAN");
        for (int i = 0; i < n; i++) {
            System.out.println("-------------------------");
            System.out.println("Ho gia dinh thu " + (i+1));
            list.get(i).output();
        }
    }
}
