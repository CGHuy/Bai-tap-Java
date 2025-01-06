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
public class KySu extends CanBo{
    private String nganh;
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        do {
            System.out.print("Nhap nganh cua ky su: "); nganh = sc.nextLine();
            if (checkNganh()) {
                System.out.println("Nganh khong hop le");
            }
        } while (checkNganh());
    }
    public void output() {
        System.out.println("KY SU");
        super.output();
        System.out.println("Nganh: " + nganh);
    }
    
    public boolean checkNganh() {
        return nganh == null && nganh.trim().isEmpty();
    }
}
