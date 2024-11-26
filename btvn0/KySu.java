/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn0;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class KySu extends CanBo {
    private String nganh;
    
    public boolean checknganh() {
        return nganh == null || nganh.isEmpty();
    }
    
    @Override
    public void input() {
        super.input();
        Scanner c = new Scanner(System.in);
        System.out.print("Nhap nganh dao tao: "); nganh = c.nextLine();
        while (checknganh()) {
            System.out.print("Nhap lai nganh dao tao: "); nganh = c.nextLine();
        }
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("Nganh dao tao la: " + nganh);
    }
}
