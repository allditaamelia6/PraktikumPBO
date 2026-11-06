/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession2;

/**
 *
 * @author Alldita Putri Amelia
 */
public class Buku {

    // Atribut menggunakan private (Encapsulation)
    private String judul;
    private String penulis;
    private boolean tersedia;

    // Constructor
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tersedia = true;
    }

    // Getter judul
    public String getJudul() {
        return judul;
    }

    // Setter judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter penulis
    public String getPenulis() {
        return penulis;
    }

    // Setter penulis
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Getter ketersediaan buku
    public boolean isTersedia() {
        return tersedia;
    }

    // Setter ketersediaan buku
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul Buku  : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Status      : "
                + (tersedia ? "Tersedia" : "Dipinjam"));
    }
}
