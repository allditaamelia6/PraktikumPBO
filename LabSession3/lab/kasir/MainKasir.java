/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.kasir;

/**
 *
 * @author Alldita Putri Amelia
 */
public class MainKasir {
   
    public static void main(String[] args) {

        // ===== TAHAP 1: Uji class Pesanan =====
        System.out.println("=== TAHAP 1: Uji Pesanan ===");
        Pesanan pesanan = new Pesanan();

        pesanan.tambahItem(15000, 2); // Nasi Goreng
        pesanan.tambahItem(5000, 3);  // Es Teh
        System.out.println("Setelah 2 menu -> Subtotal: " + pesanan.getSubtotal()
                + " | Total: " + pesanan.hitungTotal());   // 45000 (tanpa diskon)

        pesanan.tambahItem(25000, 1); // Ayam Bakar
        System.out.println("Setelah 3 menu -> Subtotal: " + pesanan.getSubtotal()
                + " | Total: " + pesanan.hitungTotal());   // 70000 dan 63000

        pesanan.reset();
        System.out.println("Setelah reset  -> Subtotal: " + pesanan.getSubtotal());

        // ===== TAHAP 2: Dua kasir sebagai thread =====
        System.out.println("\n=== TAHAP 2: Dua Kasir (Thread) ===");
        Kasir dina = new Kasir("Dina");
        Kasir eko = new Kasir("Eko");

        dina.start();
        eko.start();

        try {
            dina.join();
            eko.join();
        } catch (InterruptedException e) {
            System.out.println("Main terganggu");
        }

        System.out.println("Semua pelanggan selesai dilayani");
    }
}
