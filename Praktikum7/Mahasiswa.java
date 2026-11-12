/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Alldita Putri Amelia
 */
public class Mahasiswa {

    // Konstanta standar kelulusan
    public static final double FINAL_PASSING_GRADE = 70.0;

    // Atribut mahasiswa
    private String nama;
    private String nim;
    private double nilai;

    // Constructor
    public Mahasiswa(String nama, String nim, double nilai)
            throws NilaiInvalidException {

        // Merapikan input menggunakan String
        this.nama = nama.trim().toUpperCase();
        this.nim = nim.trim();

        // Assertion untuk memastikan NIM tidak kosong
        assert !this.nim.isEmpty() : "NIM tidak boleh kosong!";

        // Validasi tambahan agar tetap berjalan meskipun assertion mati
        if (this.nim.isEmpty()) {
            throw new IllegalArgumentException("NIM tidak boleh kosong!");
        }

        // Validasi nama
        if (this.nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong!");
        }

        // Validasi NIM menggunakan Character
        for (int i = 0; i < this.nim.length(); i++) {

            if (!Character.isDigit(this.nim.charAt(i))) {
                throw new IllegalArgumentException(
                        "NIM hanya boleh berisi angka!"
                );
            }
        }

        // Validasi nilai menggunakan Custom Exception
        if (nilai < 0 || nilai > 100) {
            throw new NilaiInvalidException(
                    "Nilai harus berada di antara 0 sampai 100!"
            );
        }

        this.nilai = nilai;
    }

    // Method untuk mendapatkan nama
    public String getNama() {
        return nama;
    }

    // Method untuk mendapatkan NIM
    public String getNim() {
        return nim;
    }

    // Method untuk mendapatkan nilai
    public double getNilai() {
        return nilai;
    }

    // Method menentukan grade mahasiswa
    public String getGrade() {

        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else {
            return "D";
        }
    }

    // Method menentukan status kelulusan
    public String getStatus() {

        if (nilai >= FINAL_PASSING_GRADE) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    // Method menampilkan data mahasiswa
    public String toString() {

        return "Nama: " + nama
                + " | NIM: " + nim
                + " | Nilai: " + nilai
                + " | Grade: " + getGrade()
                + " | Status: " + getStatus();
    }
}
