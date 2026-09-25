/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession1;

/**
 *
 * @author Alldita Putri Amelia
 */
public class Produk {
    
    String nama;
    double harga;
    char kategori;
    
    public Produk(String nama,double harga, char kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }
    
    public void tampilkanProduk() {
       System.out.println("Nama Produk : " + nama);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Kategori    : " + kategori);
    }

    // Method 2
    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}
