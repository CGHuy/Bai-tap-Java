/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_1;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class XeTai extends PTGT {
    private 
            String trongtai;
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap trong tai cua xe tai: "); trongtai = sc.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("Trong tai cua xe tai: " + trongtai);
    }
}
