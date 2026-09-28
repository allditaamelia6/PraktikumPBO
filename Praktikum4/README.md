Mini Library System

Deskripsi Program

Mini Library System merupakan program perpustakaan sederhana berbasis Java yang dibuat untuk menerapkan konsep Object-Oriented Programming (OOP). Program ini digunakan untuk mengelola data buku dan anggota serta melakukan proses peminjaman dan pengembalian buku.

Program tidak hanya menyediakan fitur tambah dan tampil data, tetapi juga memiliki fitur pencarian buku, pembatasan jumlah peminjaman, penanganan kesalahan menggunakan custom exception, assertion, serta laporan aktivitas perpustakaan.

Fitur Program

Program memiliki beberapa menu utama:

1. Tambah Buku
   Digunakan untuk menambahkan data buku baru berupa judul, penulis, tahun terbit, dan kategori.

2. Daftar Buku
   Menampilkan seluruh buku yang telah tersimpan beserta status ketersediaannya.

3. Cari Buku
   Digunakan untuk mencari buku berdasarkan judul atau kategori. Pencarian menggunakan `toLowerCase()` dan `contains()` sehingga pencarian tidak terlalu bergantung pada huruf besar atau kecil.

4. Pinjam Buku
   Digunakan untuk melakukan peminjaman buku oleh anggota. Sistem akan melakukan pengecekan terhadap keberadaan buku, status ketersediaan buku, dan batas maksimal peminjaman anggota.

5. Kembalikan Buku
   Digunakan untuk mengembalikan buku yang sedang dipinjam oleh anggota dan mengubah status buku menjadi tersedia kembali.

6. Laporan Perpustakaan
   Menampilkan informasi aktivitas perpustakaan, seperti total pinjaman aktif, anggota dengan jumlah pinjaman terbanyak, buku yang paling sering dipinjam, dan jumlah buku berdasarkan kategori.

7. Keluar
   Digunakan untuk mengakhiri program.

Konsep Java yang Digunakan

Program ini menerapkan beberapa konsep dasar Java, yaitu:

1. Class dan Object
2. Constructor
3. Method
4. Package
5. Encapsulation
6. ArrayList
7. String
8. Character
9. Percabangan (`if`, `switch-case`)
10. Perulangan (`for`, `do-while`)
11. Exception Handling
12. Custom Exception
13. Assertion
14. Scanner untuk input pengguna

Struktur Program

library
├── exception
│   ├── BookAlreadyBorrowedException.java
│   ├── BookNotFoundException.java
│   └── BorrowLimitExceededException.java
│
├── main
│   └── MainApp.java
│
├── model
│   ├── Book.java
│   └── Member.java
│
└── service
    └── LibraryService.java


Penjelasan Class

Book.java
  Menyimpan data buku seperti judul, penulis, tahun terbit, kategori, status ketersediaan, dan jumlah peminjaman.

Member.java
  Menyimpan data anggota dan daftar buku yang sedang dipinjam.

LibraryService.java
  Mengatur proses utama perpustakaan seperti menambah data, mencari buku, meminjam, mengembalikan, dan membuat laporan.

MainApp.java
  Merupakan class utama yang menjalankan program dan menyediakan menu interaksi dengan pengguna.

BookNotFoundException.java
  Menangani kondisi ketika buku yang dicari tidak ditemukan.

BookAlreadyBorrowedException.java
  Menangani kondisi ketika buku yang ingin dipinjam sedang dipinjam.

BorrowLimitExceededException.java
  Menangani kondisi ketika anggota telah mencapai batas maksimal peminjaman.

Alur Program

Program dimulai dengan menampilkan menu utama. Pengguna dapat memilih menu sesuai kebutuhan. Jika pengguna menambahkan buku, data akan dibuat sebagai objek `Book` dan disimpan ke dalam `ArrayList`. Pada proses pencarian, program akan membandingkan keyword dengan judul dan kategori buku.

Ketika melakukan peminjaman, sistem akan mengecek data anggota dan buku terlebih dahulu. Jika buku tidak ditemukan, sedang dipinjam, atau jumlah pinjaman anggota sudah mencapai batas maksimal, program akan memberikan pesan kesalahan melalui custom exception. Jika proses berhasil, buku dimasukkan ke dalam daftar pinjaman anggota dan status buku diubah menjadi tidak tersedia.

Pada proses pengembalian, sistem akan mengecek apakah buku tersebut benar-benar sedang dipinjam oleh anggota. Jika berhasil, buku dihapus dari daftar pinjaman dan statusnya kembali menjadi tersedia.

Menu laporan digunakan untuk mengolah data yang telah tersimpan dan menampilkan informasi aktivitas perpustakaan. Setelah selesai menggunakan program, pengguna dapat memilih menu Keluar untuk mengakhiri program.

Cara Menjalankan Program

1. Buka project menggunakan NetBeans.
2. Pastikan seluruh package dan class sudah berada pada struktur yang sesuai.
3. Jalankan file:

MainApp.java

4. Pilih menu berdasarkan nomor yang tersedia.
5. Masukkan data sesuai instruksi yang muncul pada terminal.

Contoh Output

==============================
       MINI LIBRARY SYSTEM
==============================
1. Tambah Buku
2. Daftar Buku
3. Cari Buku
4. Pinjam Buku
5. Kembalikan Buku
6. Laporan Perpustakaan
7. Keluar
==============================
Pilih menu:

Program kemudian akan menjalankan proses sesuai menu yang dipilih oleh pengguna.
