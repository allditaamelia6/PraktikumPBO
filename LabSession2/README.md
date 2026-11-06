Sistem Peminjaman Buku Perpustakaan

1. Deskripsi Sistem
   Sistem Peminjaman Buku Perpustakaan merupakan program sederhana berbasis Java yang dibuat untuk mengelola   proses peminjaman buku oleh anggota perpustakaan. Program ini memiliki dua jenis anggota, yaitu mahasiswa dan dosen, yang masing-masing memiliki batas maksimal peminjaman berbeda.

   Program ini dibuat sebagai penerapan konsep Object-Oriented Programming (OOP), yaitu Encapsulation,  Inheritance, Polymorphism, Abstract Class, dan Interface.

2. Alur Program
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

3. Penerapan Konsep OOP

- Encapsulation: Menggunakan atribut `private` serta getter dan setter untuk mengatur akses data.
- Inheritance: Class `Mahasiswa` dan `Dosen` mewarisi class `Anggota`.
- Polymorphism: Menggunakan method overriding dan overloading serta runtime polymorphism.
- Abstract Class: Class `Anggota` dibuat sebagai abstract class dengan abstract method `getBatasPinjam()`.
- Interface: Interface `Peminjam` digunakan sebagai kontrak untuk method `pinjamBuku()`.

4. Output Program
Ketika program dijalankan, sistem menghasilkan beberapa output, yaitu:

- Menampilkan daftar buku beserta judul, penulis, dan status ketersediaannya.
- Menampilkan identitas anggota perpustakaan, yaitu mahasiswa dan dosen.
- Menampilkan batas maksimal peminjaman masing-masing anggota.
- Menampilkan proses peminjaman buku.
- Menampilkan pesan ketika buku berhasil dipinjam atau ketika buku sudah tidak tersedia.
- Menampilkan status akhir buku setelah proses peminjaman.
======================================
     SISTEM PEMINJAMAN BUKU
           PERPUSTAKAAN
======================================

--- DAFTAR BUKU ---
Judul Buku  : Pemrograman Java
Penulis     : Abdul Kadir
Status      : Tersedia

Judul Buku  : Dasar Basis Data
Penulis     : Fathansyah
Status      : Tersedia

--- DATA ANGGOTA ---
Nama        : Alldita Amelia
ID Anggota  : M001
Batas Pinjam: 3 buku

Nama        : Bapak Andi
ID Anggota  : D001
Batas Pinjam: 5 buku

--- PROSES PEMINJAMAN ---
Jenis Anggota: Mahasiswa
Buku berhasil dipinjam!
Judul Buku: Pemrograman Java
Batas Peminjaman: 3 buku

Jenis Anggota: Dosen
Buku berhasil dipinjam!
Judul Buku: Dasar Basis Data
Batas Peminjaman: 5 buku

--- PEMINJAMAN DENGAN DURASI ---
Lama Peminjaman: 7 hari
Jenis Anggota: Mahasiswa
Maaf, buku sedang dipinjam.

--- STATUS AKHIR BUKU ---
Judul Buku  : Pemrograman Java
Penulis     : Abdul Kadir
Status      : Dipinjam

Judul Buku  : Dasar Basis Data
Penulis     : Fathansyah
Status      : Dipinjam

======================================
       PROGRAM SELESAI
======================================

Keterangan Output:

Daftar Buku: Menampilkan informasi judul, penulis, dan status ketersediaan buku.

Data Anggota: Menampilkan identitas mahasiswa dan dosen beserta batas peminjaman masing-masing.

Proses Peminjaman: Menampilkan proses peminjaman buku oleh mahasiswa dan dosen.

Peminjaman dengan Durasi: Menampilkan contoh penggunaan method overloading dengan menambahkan parameter lama   peminjaman.

Status Akhir Buku: Menampilkan perubahan status buku setelah berhasil dipinjam.

5. Teknologi yang Digunakan
- Bahasa Pemrograman: Java
- IDE: NetBeans
- Konsep: Object-Oriented Programming (OOP)

6. Tujuan Program
Program ini dibuat untuk memahami dan menerapkan konsep dasar OOP dalam Java melalui studi kasus sederhana yang berkaitan dengan sistem peminjaman buku perpustakaan.