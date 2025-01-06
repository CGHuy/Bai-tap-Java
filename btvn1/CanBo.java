/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class CanBo {
    private String ht, gt, dc;
    private int ns;
    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap ho ten: "); ht = sc.nextLine();
            if (checkHt()) {
                System.out.println("Ho ten khong hop le");
           }
        } while (checkHt());
        do {
            System.out.print("Nhap nam sinh: "); ns = sc.nextInt(); sc.nextLine();
            if (checkNs()) {
                System.out.println("Nam sinh khong hop le");
           }
        } while (checkNs());
        do {
            System.out.print("Nhap gioi tinh(Nam/Nu): "); gt = sc.nextLine();
            if (checkGt()) {
                System.out.println("Gioi tinh khong hop le");
           }
        } while (checkGt());
        do {
            System.out.print("Nhap dia chi: "); dc = sc.nextLine();
            if (checkDc()) {
                System.out.println("Dia chi khong hop le");
           }
        } while (checkDc());
        
        
    }
    public void output() {
        System.out.println("Ho ten: " + ht);
        System.out.println("Nam sinh: " + ns);
        System.out.println("Gioi tinh: " + gt);
        System.out.println("Dia chi: " + dc);
    }
    
    public boolean checkHt() {
        return ht == null || ht.trim().isEmpty();
    }
    
    public boolean checkNs() {
        return ns > 2025;
    }
    
    public boolean checkGt() {
        return !gt.equalsIgnoreCase("Nam") && !gt.equalsIgnoreCase("Nu");
    }
    
    public boolean checkDc() {
        return dc.trim().isEmpty() || dc == null;
    }
    
    public static void main(String[] args) {
        ArrayList<CanBo> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Nhap thong tin cong nhan");
            System.out.println("2. Nhap thong tin ky su");
            System.out.println("3. Nhap thong tin nhan vien");
            System.out.println("4. In thong tin");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban: "); int chon = sc.nextInt(); sc.nextLine();
            
            switch (chon) {
                case 1:
                    CanBo cn = new CongNhan();
                    cn.input();
                    list.add(cn);
                    break;
                case 2:
                    CanBo ks = new KySu();
                    ks.input();
                    list.add(ks);
                    break;
                case 3:
                    CanBo nv = new NhanVien();
                    nv.input();
                    list.add(nv);
                    break;
                case 4:
                    for (CanBo i : list) {
                        System.out.println("-------------------------------");
                        i.output();
                    }
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai!");
            }
        }
    }
}
