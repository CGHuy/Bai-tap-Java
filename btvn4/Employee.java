/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class Employee extends Person {
    private 
           String pb;
           int lcb;
           float hsl, tn, ltl;
    public Employee() {}
    public Employee(String ht, String ns, String dc, String gt, String pb, float hsl, float tn, int lcb) {
        super(ht,ns,dc,gt);
        this.pb = pb;
        this.hsl = hsl;
        this.lcb = lcb;
        this.tn = tn;
    }
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phong ban: "); pb = sc.nextLine();
        System.out.print("Nhap he so luong: "); hsl = sc.nextFloat(); sc.nextLine();
        System.out.print("Nhap tham nien: "); tn = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap luong co ban: "); lcb = sc.nextInt(); sc.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.println("Phong ban: " + pb);
        System.out.println("He so luong: " + hsl);
        System.out.println("Tham nien: " + tn);
        System.out.println("Luong co ban: " + lcb);
        System.out.println("Luong thuc linh: " + tinhLuongThuc());
    }
    public float tinhLuongThuc() {
        ltl = lcb * hsl * (1 + tn/100);
        return ltl;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(new File("D:\\FileText\\Java\\Employee.txt"));
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Employee> list = new ArrayList<>();
        String line; // khai báo chuỗi
        while ((line = br.readLine()) != null){ // nếu readLine đọc thấy giá trị thì thực hiện lệnh trong vòng while
            String[] a = line.split("\\$"); // khai báo mảng String[] a, cắt từng biến trong chuỗi khi thấy ký tự /
            Employee e = new Employee(a[0], a[1], a[2], a[3], a[4], Float.parseFloat(a[5]), Float.parseFloat(a[6]), Integer.parseInt(a[7]));
            list.add(e);
        }
        br.close();
        fr.close();
        for (Employee i : list) {
            i.output();
            System.out.println("-----------------------------");
        }
    }
}
