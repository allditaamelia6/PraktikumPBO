/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.model;

/**
 *
 * @author Alldita Putri Amelia
 */
public class Book {
    
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String kategori;
    private boolean statusKetersediaan;
    private int jumlahDipinjam;

    public Book(String judul, String penulis, int tahunTerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
        this.statusKetersediaan = true;
        this.jumlahDipinjam = 0;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public boolean isTersedia() {
        return statusKetersediaan;
    }

    public int getJumlahDipinjam() {
        return jumlahDipinjam;
    }

    public void setStatusKetersediaan(boolean statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }

    public void tambahJumlahDipinjam() {
        jumlahDipinjam++;
    }

    @Override
    public String toString() {
        return "Judul: " + judul
                + " | Penulis: " + penulis
                + " | Tahun: " + tahunTerbit
                + " | Kategori: " + kategori
                + " | Status: "
                + (statusKetersediaan ? "Tersedia" : "Dipinjam");
    }
}
