/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10_1;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class TheMuon extends SinhVien {
    private 
            String spm, nm, ht, shs;
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phieu muon: "); spm = sc.nextLine();
        System.out.print("Nhap ngay muon: "); nm = sc.nextLine();
        System.out.print("Nhap han tra: "); ht = sc.nextLine();
        System.out.print("Nhap so hieu sach: "); shs = sc.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("So phieu muon: " + spm);
        System.out.println("Ngay muon: " + nm);
        System.out.println("Han tra: " + ht);
        System.out.println("So hieu sach: " + shs);
    }
}
