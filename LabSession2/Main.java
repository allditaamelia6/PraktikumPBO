/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession2;

/**
 *
 * @author Alldita Putri Amelia
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("     SISTEM PEMINJAMAN BUKU");
        System.out.println("           PERPUSTAKAAN");
        System.out.println("======================================");

        // Membuat objek buku
        Buku buku1 = new Buku(
                "Pemrograman Java",
                "Abdul Kadir"
        );

        Buku buku2 = new Buku(
                "Dasar Basis Data",
                "Fathansyah"
        );

        // Membuat objek anggota
        Mahasiswa mahasiswa1 = new Mahasiswa(
                "Alldita Amelia",
                "M001"
        );

        Dosen dosen1 = new Dosen(
                "Bapak Andi",
                "D001"
        );

        // Menampilkan informasi buku
        System.out.println("\n--- DAFTAR BUKU ---");

        buku1.tampilkanInfo();

        System.out.println();

        buku2.tampilkanInfo();

        // Menampilkan informasi mahasiswa
        System.out.println("\n--- DATA ANGGOTA ---");

        mahasiswa1.tampilkanIdentitas();

        System.out.println("Batas Pinjam: "
                + mahasiswa1.getBatasPinjam() + " buku");

        // Menampilkan informasi dosen
        System.out.println();

        dosen1.tampilkanIdentitas();

        System.out.println("Batas Pinjam: "
                + dosen1.getBatasPinjam() + " buku");

        // Runtime Polymorphism
        System.out.println("\n--- PROSES PEMINJAMAN ---");

        // Referensi superclass untuk objek subclass
        Anggota anggota1 = mahasiswa1;
        Anggota anggota2 = dosen1;

        // Memanggil method yang berbeda sesuai objek
        anggota1.pinjamBuku(buku1);

        System.out.println();

        anggota2.pinjamBuku(buku2);

        // Contoh Method Overloading
        System.out.println("\n--- PEMINJAMAN DENGAN DURASI ---");

        mahasiswa1.pinjamBuku(buku1, 7);

        // Menampilkan status akhir buku
        System.out.println("\n--- STATUS AKHIR BUKU ---");

        buku1.tampilkanInfo();

        System.out.println();

        buku2.tampilkanInfo();

        System.out.println("\n======================================");
        System.out.println("       PROGRAM SELESAI");
        System.out.println("======================================");
    }
}
