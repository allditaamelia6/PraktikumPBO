/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Alldita Putri Amelia
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class NilaiSiswa {

    public static void main(String[] args) {

        // Membuat Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jumlahSiswa;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        double totalNilai = 0;
        double rataRata;

        // Tampilan awal program
        System.out.println("======================================");
        System.out.println("         PROGRAM DATA NILAI SISWA");
        System.out.println("======================================");

        // Meminta pengguna memasukkan jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        jumlahSiswa = input.nextInt();
        input.nextLine();

        // Memeriksa jumlah siswa
        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0.");
            input.close();
            return;
        }

        // LANGKAH 1: INPUT DATA DAN MENULIS KE FILE
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("laporan_nilai.txt"))) {

            // Menulis judul laporan ke file
            writer.write("======================================");
            writer.newLine();
            writer.write("             LAPORAN NILAI SISWA");
            writer.newLine();
            writer.write("======================================");
            writer.newLine();

            // Perulangan untuk memasukkan data setiap siswa
            for (int i = 1; i <= jumlahSiswa; i++) {

                System.out.println("\nData Siswa ke-" + i);
                System.out.println("--------------------------------------");

                // Input nama siswa
                System.out.print("Nama siswa  : ");
                String nama = input.nextLine();

                // Input nilai siswa
                System.out.print("Nilai siswa : ");
                double nilai = input.nextDouble();
                input.nextLine();

                // Menentukan status kelulusan
                String status;

                if (nilai >= 70) {
                    status = "Lulus";
                    jumlahLulus++;
                } else {
                    status = "Tidak Lulus";
                    jumlahTidakLulus++;
                }

                // Menghitung total nilai siswa
                totalNilai += nilai;

                // Menampilkan status kelulusan ke konsol
                System.out.println("Status      : " + status);

                // Menulis data siswa ke dalam file
                writer.write("Nama   : " + nama);
                writer.newLine();

                writer.write("Nilai  : " + nilai);
                writer.newLine();

                writer.write("Status : " + status);
                writer.newLine();

                writer.write("--------------------------------------");
                writer.newLine();
            }

            // Menghitung rata-rata nilai kelas
            rataRata = totalNilai / jumlahSiswa;

            // Menulis ringkasan ke dalam file
            writer.newLine();
            writer.write("============== RINGKASAN ==============");
            writer.newLine();

            writer.write("Rata-rata nilai kelas : " + rataRata);
            writer.newLine();

            writer.write("Jumlah siswa lulus : " + jumlahLulus);
            writer.newLine();

            writer.write("Jumlah siswa tidak lulus : " + jumlahTidakLulus);
            writer.newLine();

            writer.write("======================================");

            System.out.println("\nData berhasil disimpan ke file laporan_nilai.txt");

        } catch (IOException e) {

            // Menangani kesalahan saat menulis file
            System.out.println("Terjadi kesalahan saat menulis file: "
                    + e.getMessage());

        }

        // LANGKAH 2: MEMBACA KEMBALI ISI FILE
        System.out.println("\n======================================");
        System.out.println("          HASIL LAPORAN NILAI");
        System.out.println("======================================");

        try (BufferedReader reader = new BufferedReader(
                new FileReader("laporan_nilai.txt"))) {

            String baris;

            // Membaca file baris demi baris sampai akhir file
            while ((baris = reader.readLine()) != null) {

                // Menampilkan isi file ke konsol
                System.out.println(baris);

            }

        } catch (IOException e) {

            // Menangani kesalahan saat membaca file
            System.out.println("Terjadi kesalahan saat membaca file: "
                    + e.getMessage());

        }

        // LANGKAH 3: RESOURCE MANAGEMENT
        // Scanner ditutup setelah seluruh proses selesai
        input.close();

        // Tampilan akhir program
        System.out.println("\n======================================");
        System.out.println("           PROGRAM SELESAI");
        System.out.println("======================================");

    }
}
