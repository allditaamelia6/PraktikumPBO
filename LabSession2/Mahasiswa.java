/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession2;

/**
 *
 * @author Alldita Putri Amelia
 */

// Subclass Mahasiswa mewarisi Anggota
public class Mahasiswa extends Anggota {

    // Constructor
    public Mahasiswa(String nama, String idAnggota) {

        // Memanggil constructor superclass
        super(nama, idAnggota);
    }

    // Implementasi abstract method
    @Override
    public int getBatasPinjam() {
        return 3;
    }

    // Implementasi method dari interface
    @Override
    public void pinjamBuku(Buku buku) {

        System.out.println("Jenis Anggota: Mahasiswa");

        if (buku.isTersedia()) {

            buku.setTersedia(false);

            System.out.println("Buku berhasil dipinjam!");
            System.out.println("Judul Buku: "
                    + buku.getJudul());

            System.out.println("Batas Peminjaman: "
                    + getBatasPinjam() + " buku");

        } else {

            System.out.println("Maaf, buku sedang dipinjam.");
        }
    }
}

