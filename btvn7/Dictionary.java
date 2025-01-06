/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author caogi
 */
public class Dictionary {
    private ArrayList<Word> list;
    public Dictionary() {
        list = new ArrayList<>();
    }
    public void khoiTaoDanhSach() {
        list.add(new Word(1,"cat","con meo"));
        list.add(new Word(2,"dog","con cho"));
        list.add(new Word(3,"apple","qua tao"));
        list.add(new Word(4,"blue","mau xanh"));
        list.add(new Word(5,"black","mau den"));
    }
    
    public void addWord(String en) {
        Scanner sc = new Scanner(System.in);
        for (Word i : list) {
            if (i.getEn().equalsIgnoreCase(en)) {
                System.out.println("Tu nay da co trong tu dien");
                return;
            } else {
                System.out.print("Nhap nghia tieng viet cua tu " + en + ": "); String vn = sc.nextLine();
                int id = list.size() + 1;
                list.add(new Word(id,en,vn));
                System.out.println("Da them tu moi" + en + " / " + vn + " vao tu dien");
                return;
            }
        }
    }
    
    public void outputAll() {
        for (Word i : list) {
            i.output();
        }
    }
    
    public void search(String en) {
        Collections.sort(list, Comparator.comparing(Word::getEn));
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            Word tuHienTai = list.get(mid);
            if (tuHienTai.getEn().equalsIgnoreCase(en)) {
                System.out.println("Tim thay, nghia tieng viet la: " + tuHienTai.getVn());
                return;
            } else if (tuHienTai.getEn().compareToIgnoreCase(en) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Khong tim thay, them tu " + en + " vao tu dien");
        addWord(en);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary tuDien = new Dictionary();
        tuDien.khoiTaoDanhSach();
        
        while (true) {
            System.out.println("------MENU------");
            System.out.println("1. Them tu moi");
            System.out.println("2. Tim kiem");
            System.out.println("3. In toan bo");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon cua ban: "); int chose = sc.nextInt(); sc.nextLine();
            
            switch (chose) {
                case 1:
                    System.out.print("Nhap tu tieng Anh muon them: "); String enNew = sc.nextLine();
                    tuDien.addWord(enNew);
                    break;
                case 2:
                    System.out.print("Nhap tu muon tim: "); String en = sc.nextLine();
                    tuDien.search(en);
                    break;
                case 3:
                    tuDien.outputAll();
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai");
            }
        }
    }
}
