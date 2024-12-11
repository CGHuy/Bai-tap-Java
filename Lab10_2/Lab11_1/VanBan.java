/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11_1;

import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class VanBan {
    private 
            String XauKyTu;
    public VanBan() {
        XauKyTu = "";
    }
    public VanBan(String a) {
        XauKyTu = a;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap xau ky tu: "); XauKyTu = sc.nextLine();
    }
    public int DemTu() {
        if (XauKyTu.isBlank()) {
            return 0;
        } else {
            String[] word = XauKyTu.trim().split("\\s+");
            return word.length;
        }
    }
    public int DemH() {
        int count = 0;
        for (int i = 0; i < XauKyTu.length(); i++) {
            if (XauKyTu.charAt(i) == 'H' || XauKyTu.charAt(i) == 'h') {
                count++;
            }
        }
        return count;
    }
    public String ChuanHoa() {
        String a = "";
        String[] word = XauKyTu.trim().split("\\s+");
        for (int i = 0; i < word.length; i++) {
            a = a + word[i] + " ";
        }
        a = a.trim(); //Xoa bo khoang trang o cuoi xau
        return a;
    }
    public static void main(String[] args) {
        VanBan a = new VanBan();
        a.input();
        System.out.println("So tu: " + a.DemTu());
        System.out.println("Sau khi chuan hoa: " + a.ChuanHoa());
        System.out.println("So ky tu H/h: " + a.DemH());
    }
}
