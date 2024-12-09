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
public class HoDan {

    private int soThanhVien, soNha;
    ArrayList<Nguoi> list = new ArrayList<>();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguoi trong gia dinh: ");
        soThanhVien = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap so nha: ");
        soNha = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("");
            System.out.println("Thanh vien thu " + (i + 1));
            Nguoi temp = new Nguoi();
            temp.input1();
            list.add(temp);
        }
    }

    public void output() {
        System.out.println("So nguoi trong gia dinh: " + soThanhVien);
        System.out.println("So nha: " + soNha);
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("");
            System.out.println("Thanh vien thu " + (i + 1));
            list.get(i).output1();
        }
    }
}
