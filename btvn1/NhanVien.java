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
public class NhanVien extends CanBo {
    private String congviec;
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        do {
            System.out.print("Nhap cong viec cua nhan vien: "); congviec = sc.nextLine();
            if (checkCongviec()) {
                System.out.println("Cong viec khong hop le");
            }
        } while (checkCongviec());
    }
    public void output() {
        System.out.println("NHAN VIEN");
        super.output();
        System.out.println("Cong viec: " + congviec);
    }
    public boolean checkCongviec() {
        return congviec == null && congviec.trim().isEmpty();
    }
}
