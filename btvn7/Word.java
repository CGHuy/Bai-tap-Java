/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn7;

/**
 *
 * @author caogi
 */
public class Word {
    private int id;
    private String en, vn;
    public Word() {};
    public Word(int id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }
    public int getId() {
        return id;
    }
    public String getEn() {
        return en;
    }
    public String getVn() {
        return vn;
    }
    public void setId() {
        this.id = id;
    }
    public void setEn() {
        this.en = en;
    }
    public void setVn() {
        this.vn = vn;
    }
    public void output() {
        System.out.println("ID: " + id + ", Tieng Anh: " + en + ", Tieng Viet: " + vn);
    }
}
