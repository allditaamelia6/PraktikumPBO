/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Alldita Putri Amelia
 */

// Import library Java
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
   
    public static void main(String[] args) {

        // Membuat Scanner untuk input keyboard
        Scanner input = new Scanner(System.in);

        // Membuat ArrayList untuk menyimpan objek mahasiswa
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.println("========================================");
        System.out.println("     SISTEM PENGELOLAAN NILAI MAHASISWA");
        System.out.println("========================================");

        // Input jumlah mahasiswa
        int jumlahMahasiswa = 0;

        while (jumlahMahasiswa <= 0) {

            try {

                System.out.print("Masukkan jumlah mahasiswa: ");
                jumlahMahasiswa = Integer.parseInt(input.nextLine());

                if (jumlahMahasiswa <= 0) {
                    System.out.println(
                            "Jumlah mahasiswa harus lebih dari 0!"
                    );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Input harus berupa angka!"
                );
            }
        }

        // Looping untuk memasukkan data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {

            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            boolean dataValid = false;

            while (!dataValid) {

                try {

                    // Input nama
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();

                    // Input NIM
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();

                    // Input nilai
                    System.out.print("Masukkan Nilai: ");
                    double nilai = Double.parseDouble(input.nextLine());

                    // Membuat objek mahasiswa
                    Mahasiswa mhs = new Mahasiswa(
                            nama, nim, nilai
                    );

                    // Menambahkan objek ke ArrayList
                    daftarMahasiswa.add(mhs);

                    System.out.println(
                            "Data mahasiswa berhasil ditambahkan!"
                    );

                    dataValid = true;

                } catch (NilaiInvalidException e) {

                    System.out.println(
                            "Kesalahan Nilai: " + e.getMessage()
                    );

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Kesalahan: Nilai harus berupa angka!"
                    );

                } catch (IllegalArgumentException e) {

                    System.out.println(
                            "Kesalahan Data: " + e.getMessage()
                    );
                }
            }
        }

        // Menghitung statistik mahasiswa
        double totalNilai = 0;

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        // Menelusuri ArrayList menggunakan for-each
        for (Mahasiswa mhs : daftarMahasiswa) {

            totalNilai += mhs.getNilai();

            if (mhs.getStatus().equals("LULUS")) {

                jumlahLulus++;

            } else {

                jumlahTidakLulus++;
            }
        }

        // Menghitung rata-rata nilai
        double rataRata = totalNilai / daftarMahasiswa.size();

        // Menampilkan rekapitulasi ke console
        System.out.println("\n========================================");
        System.out.println("          REKAPITULASI NILAI");
        System.out.println("========================================");

        for (Mahasiswa mhs : daftarMahasiswa) {

            System.out.println(mhs);
        }

        System.out.println("----------------------------------------");

        System.out.println(
                "Jumlah Mahasiswa : " + daftarMahasiswa.size()
        );

        System.out.println(
                "Rata-rata Nilai  : " + rataRata
        );

        System.out.println(
                "Jumlah Lulus     : " + jumlahLulus
        );

        System.out.println(
                "Jumlah Tidak Lulus: " + jumlahTidakLulus
        );

        // Menyimpan rekapitulasi ke file teks
        String namaFile = "laporan_nilai.txt";

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(namaFile))) {

            writer.write("========================================");
            writer.newLine();

            writer.write("       LAPORAN NILAI MAHASISWA");
            writer.newLine();

            writer.write("========================================");
            writer.newLine();

            writer.newLine();

            writer.write("DAFTAR MAHASISWA");
            writer.newLine();

            writer.write("----------------------------------------");
            writer.newLine();

            // Menulis data setiap mahasiswa
            for (Mahasiswa mhs : daftarMahasiswa) {

                writer.write(mhs.toString());
                writer.newLine();
            }

            writer.newLine();

            writer.write("STATISTIK KELAS");
            writer.newLine();

            writer.write("----------------------------------------");
            writer.newLine();

            writer.write(
                    "Jumlah Mahasiswa : "
                    + daftarMahasiswa.size()
            );

            writer.newLine();

            writer.write(
                    "Rata-rata Nilai  : "
                    + rataRata
            );

            writer.newLine();

            writer.write(
                    "Jumlah Lulus     : "
                    + jumlahLulus
            );

            writer.newLine();

            writer.write(
                    "Jumlah Tidak Lulus: "
                    + jumlahTidakLulus
            );

            writer.newLine();

            writer.write("----------------------------------------");

            System.out.println(
                    "\nLaporan berhasil disimpan ke file "
                    + namaFile
            );

        } catch (IOException e) {

            System.out.println(
                    "Terjadi kesalahan saat menulis file: "
                    + e.getMessage()
            );
        }

        // Membaca kembali isi file
        System.out.println("\n========================================");
        System.out.println("       MEMBACA FILE LAPORAN");
        System.out.println("========================================");

        try (BufferedReader reader = new BufferedReader(
                new FileReader(namaFile))) {

            String baris;

            // Membaca file baris demi baris
            while ((baris = reader.readLine()) != null) {

                System.out.println(baris);
            }

        } catch (IOException e) {

            System.out.println(
                    "Terjadi kesalahan saat membaca file: "
                    + e.getMessage()
            );
        }

        // Menutup Scanner
        input.close();

        System.out.println("\nProgram selesai dijalankan.");
    }
}
