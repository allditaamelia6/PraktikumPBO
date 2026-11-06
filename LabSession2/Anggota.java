/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession2;

/**
 *
 * @author Alldita Putri Amelia
 */

// Abstract class dan implementasi interface
public abstract class Anggota implements Peminjam {

    // Atribut private (Encapsulation)
    private String nama;
    private String idAnggota;

    // Constructor
    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter ID anggota
    public String getIdAnggota() {
        return idAnggota;
    }

    // Setter ID anggota
    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    // Abstract method
    public abstract int getBatasPinjam();

    // Method overloading pertama
    public void pinjamBuku(Buku buku, int lamaHari) {

        System.out.println("Lama Peminjaman: "
                + lamaHari + " hari");

        // Memanggil method pinjamBuku yang ada di subclass
        pinjamBuku(buku);
    }

    // Method untuk menampilkan identitas anggota
    public void tampilkanIdentitas() {
        System.out.println("Nama        : " + nama);
        System.out.println("ID Anggota  : " + idAnggota);
    }
}
