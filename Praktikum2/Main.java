/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Alldita Putri Amelia
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        input.nextLine();
        
        // Membuat array object Student
        Student[] students = new Student[jumlahSiswa];
        
        // Input data siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nData siswa ke-" + (i + 1) + ":");
            
            System.out.print("Masuk nama: ");
            String name = input.nextLine();
            
            System.out.print("Masukkan nilai: ");
            double score = input.nextDouble();
            input.nextLine();
            
            students[i] = new Student(name, score);
        }
        
        // Mengecek kelulusan semua siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            students[i].checkPassed();
        }
        
        // Variabel untuk menghitung rata-rata dan jumlah siswa
        double totalNilai =0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        
        // Menampilkan data siswa
        System.out.println("\n===== HASIL NILAI SISWA =====");
        
        for (int i = 0; i < jumlahSiswa; i++) {
            String status;
            
            if (students[i].passed) {
                status = "Lulus";
                jumlahLulus++;
            } else {
                status = "Tidak Lulus";
                jumlahTidakLulus++;
            }
            
            System.out.println(
            "Siswa: " + students[i].name +
                    " - Nilai: " + students[i].score +
                    " - " + status
            );
            
            totalNilai += students[i].score;
        }
        
        // Menghitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;
        
        // Menampilkan hasil akhir
        System.out.printf("\nRata-rata nilai kelas: %.2f\n", rataRata);
        System.out.println("Jumlah siswa lulus: " + jumlahLulus);
        System.out.println("Jumlah siswa tidak lulus: " + jumlahTidakLulus);
        
        input.close();
    }
}
