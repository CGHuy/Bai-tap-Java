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
public class OTo extends PTGT {
    
    private 
            String kieudongco;
            int sochongoi;
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so cho ngoi: "); sochongoi = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap kieu dong co: "); kieudongco = sc.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("So cho ngoi: " + sochongoi);
        System.out.println("Kieu dong co: " + kieudongco);
    }
}
