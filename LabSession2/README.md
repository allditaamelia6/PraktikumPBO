# Sistem Peminjaman Buku Perpustakaan

## 1. Deskripsi Sistem
Sistem Peminjaman Buku Perpustakaan merupakan program sederhana berbasis Java yang dibuat untuk mengelola proses peminjaman buku oleh anggota perpustakaan. Program ini memiliki dua jenis anggota, yaitu mahasiswa dan dosen, yang masing-masing memiliki batas maksimal peminjaman berbeda.

Program ini dibuat sebagai penerapan konsep Object-Oriented Programming (OOP), yaitu Encapsulation, Inheritance, Polymorphism, Abstract Class, dan Interface.

## 2. Alur Program
Berikut alur kerja program:

1. Program dijalankan melalui class `Main`.
2. Sistem membuat data buku yang berisi judul, penulis, dan status ketersediaan buku.
3. Sistem membuat data anggota perpustakaan, yaitu mahasiswa dan dosen.
4. Program menampilkan informasi buku dan identitas masing-masing anggota.
5. Anggota melakukan peminjaman buku melalui method `pinjamBuku()`.
6. Sistem memeriksa ketersediaan buku.
7. Jika buku tersedia, status buku akan berubah menjadi dipinjam.
8. Jika buku sudah dipinjam, sistem menampilkan pesan bahwa buku tidak tersedia.
9. Program menampilkan kembali status akhir setiap buku.

## 3. Penerapan Konsep OOP

- **Encapsulation:** Menggunakan atribut `private` serta getter dan setter untuk mengatur akses data.
- **Inheritance:** Class `Mahasiswa` dan `Dosen` mewarisi class `Anggota`.
- **Polymorphism:** Menggunakan method overriding dan overloading serta runtime polymorphism.
- **Abstract Class:** Class `Anggota` dibuat sebagai abstract class dengan abstract method `getBatasPinjam()`.
- **Interface:** Interface `Peminjam` digunakan sebagai kontrak untuk method `pinjamBuku()`.

## 4. Output Program
Ketika program dijalankan, sistem menghasilkan beberapa output, yaitu:

- Menampilkan daftar buku beserta judul, penulis, dan status ketersediaannya.
- Menampilkan identitas anggota perpustakaan, yaitu mahasiswa dan dosen.
- Menampilkan batas maksimal peminjaman masing-masing anggota.
- Menampilkan proses peminjaman buku.
- Menampilkan pesan ketika buku berhasil dipinjam atau ketika buku sudah tidak tersedia.
- Menampilkan status akhir buku setelah proses peminjaman.<br>

======================================<br>
     SISTEM PEMINJAMAN BUKU<br>
           PERPUSTAKAAN<br>
======================================<br>

--- DAFTAR BUKU ---<br>
Judul Buku  : Pemrograman Java<br>
Penulis     : Abdul Kadir<br>
Status      : Tersedia<br>

Judul Buku  : Dasar Basis Data<br>
Penulis     : Fathansyah<br>
Status      : Tersedia<br>

--- DATA ANGGOTA ---<br>
Nama        : Alldita Amelia<br>
ID Anggota  : M001<br>
Batas Pinjam: 3 buku<br>

Nama        : Bapak Andi<br>
ID Anggota  : D001<br>
Batas Pinjam: 5 buku<br>

--- PROSES PEMINJAMAN ---<br>
Jenis Anggota: Mahasiswa<br>
Buku berhasil dipinjam!<br>
Judul Buku: Pemrograman Java<br>
Batas Peminjaman: 3 buku<br>

Jenis Anggota: Dosen<br>
Buku berhasil dipinjam!<br>
Judul Buku: Dasar Basis Data<br>
Batas Peminjaman: 5 buku<br>

--- PEMINJAMAN DENGAN DURASI ---<br>
Lama Peminjaman: 7 hari<br>
Jenis Anggota: Mahasiswa<br>
Maaf, buku sedang dipinjam.<br>

--- STATUS AKHIR BUKU ---<br>
Judul Buku  : Pemrograman Java<br>
Penulis     : Abdul Kadir<br>
Status      : Dipinjam<br>

Judul Buku  : Dasar Basis Data<br>
Penulis     : Fathansyah<br>
Status      : Dipinjam<br>

======================================<br>
       PROGRAM SELESAI<br>
======================================<br>

Keterangan Output:

Daftar Buku: Menampilkan informasi judul, penulis, dan status ketersediaan buku.

Data Anggota: Menampilkan identitas mahasiswa dan dosen beserta batas peminjaman masing-masing.

Proses Peminjaman: Menampilkan proses peminjaman buku oleh mahasiswa dan dosen.

Peminjaman dengan Durasi: Menampilkan contoh penggunaan method overloading dengan menambahkan parameter lama peminjaman.

Status Akhir Buku: Menampilkan perubahan status buku setelah berhasil dipinjam.

## 5. Teknologi yang Digunakan
- Bahasa Pemrograman: Java
- IDE: NetBeans
- Konsep: Object-Oriented Programming (OOP)

## 6. Tujuan Program
Program ini dibuat untuk memahami dan menerapkan konsep dasar OOP dalam Java melalui studi kasus sederhana yang berkaitan dengan sistem peminjaman buku perpustakaan.

