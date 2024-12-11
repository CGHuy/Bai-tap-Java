/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_2;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class NhanVien extends CanBo {
    private String congviec;
    
    public boolean checkcongviec() {
        return congviec == null || congviec.isEmpty();
    }
    
    @Override
    public void input() {
        super.input();
        Scanner d = new Scanner(System.in);
        System.out.print("Nhap cong viec: "); congviec = d.nextLine();
        while (checkcongviec()) {
        System.out.print("Nhap lai cong viec: "); congviec = d.nextLine();
        }
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("Cong viec la: " + congviec);
    }
}
