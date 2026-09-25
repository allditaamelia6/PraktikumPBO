/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession1;

/**
 *
 * @author Alldita Putri Amelia
 */
import java.util.ArrayList; 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Konstanta
        final double DISKON = 0.10;

        // Collection (ArrayList)
        ArrayList<Produk> daftarProduk = new ArrayList<>();

        //  Membuat object dari class Produk
        daftarProduk.add(new Produk("Nasi Goreng", 15000, 'M'));
        daftarProduk.add(new Produk("Es Teh", 5000, 'M'));
        daftarProduk.add(new Produk("Kopi", 8000, 'M'));

        System.out.println("===== SISTEM KASIR SEDERHANA =====");

        // Looping
        for (int i = 0; i < daftarProduk.size(); i++) {
            System.out.println("\nProduk ke-" + (i + 1));
            daftarProduk.get(i).tampilkanProduk();
        }

        try {
            // Input pilihan produk
            System.out.print("\nPilih nomor produk (1-3): ");
            int pilihan = input.nextInt();

            // Kondisional
            if (pilihan < 1 || pilihan > daftarProduk.size()) {
                System.out.println("Pilihan produk tidak tersedia.");
                return;
            }

            System.out.print("Jumlah beli: ");
            int jumlah = input.nextInt();

            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0.");
                return;
            }

            // Mengambil object produk yang dipilih
            Produk produkDipilih = daftarProduk.get(pilihan - 1);

            // Menghitung total harga
            double total = produkDipilih.hitungHarga(jumlah);

            // Kondisional untuk diskon
            if (total >= 50000) {
                total = total - (total * DISKON);
                System.out.println("Anda mendapatkan diskon 10%.");
            } else {
                System.out.println("Anda belum mendapatkan diskon.");
            }

            // Character & String
            String namaProduk = produkDipilih.nama;

            // Method String 1
            String namaBesar = namaProduk.toUpperCase();

            // Method String 2
            int panjangNama = namaProduk.length();

            // Method String 3
            String awalNama = namaProduk.substring(0, 2);

            char kodeKategori = produkDipilih.kategori;

            // Menampilkan hasil
            System.out.println("\n===== STRUK PEMBELIAN =====");
            System.out.println("Produk        : " + namaBesar);
            System.out.println("Jumlah        : " + jumlah);
            System.out.println("Kode kategori : " + kodeKategori);
            System.out.println("Awal nama     : " + awalNama);
            System.out.println("Panjang nama  : " + panjangNama);
            System.out.println("Total bayar   : Rp" + total);

        } catch (Exception e) {
            // Exception Handling
            System.out.println("Terjadi kesalahan!");
            System.out.println("Input yang dimasukkan tidak valid.");
        }

        input.close();
    }
}
