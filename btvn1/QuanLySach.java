/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class QuanLySach {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        int n;
        System.out.print("Nhap do dai danh sach: "); n = a.nextInt(); a.nextLine();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nhap thong tin");
        TaiLieu[] list = new TaiLieu[10];
        for (int i = 0; i < n; i++) {
            list[i] = new TaiLieu();
            System.out.println("-------------------------------------------------------------");
            list[i].input();
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("In thong tin");
        for (int i = 0; i < n; i++) {
            System.out.println("-------------------------------------------------------------");
            list[i].output();
        }
    }
}
