# PROGRAM PENGELOLAAN DATA NILAI SISWA

## 1. Deskripsi Sistem

Program Pengelolaan Data Nilai Siswa merupakan program sederhana berbasis Java yang dibuat untuk mengelola data nilai siswa menggunakan konsep procedural/fungsional. Program ini memungkinkan pengguna untuk memasukkan data siswa melalui keyboard, kemudian menentukan status kelulusan berdasarkan nilai yang diperoleh.

Program menggunakan ketentuan bahwa siswa dinyatakan **Lulus** jika mendapatkan nilai lebih dari atau sama dengan 70, sedangkan siswa yang mendapatkan nilai di bawah 70 dinyatakan **Tidak Lulus**.

Data yang sudah dimasukkan akan disimpan ke dalam file teks bernama `laporan_nilai.txt`. Selain menyimpan nama, nilai, dan status kelulusan setiap siswa, program juga menghitung rata-rata nilai kelas serta jumlah siswa yang lulus dan tidak lulus.

Program ini menggunakan beberapa library Java, yaitu Scanner untuk input data, FileWriter dan BufferedWriter untuk menulis data ke file, serta FileReader dan BufferedReader untuk membaca kembali isi file.

## 2. Alur Program

Berikut merupakan alur kerja dari Program Pengelolaan Data Nilai Siswa:

1. Program dimulai dengan menampilkan judul program pada layar konsol.
2. Pengguna diminta memasukkan jumlah siswa yang akan didata.
3. Program melakukan perulangan sesuai jumlah siswa yang telah dimasukkan.
4. Pada setiap perulangan, pengguna diminta memasukkan nama dan nilai siswa.
5. Program menentukan status kelulusan menggunakan percabangan `if-else`.
   - Jika nilai >= 70, status siswa adalah Lulus.
   - Jika nilai < 70, status siswa adalah Tidak Lulus.
6. Program menghitung total nilai serta jumlah siswa yang lulus dan tidak lulus.
7. Setiap data siswa yang telah dimasukkan ditulis ke dalam file `laporan_nilai.txt` menggunakan FileWriter dan BufferedWriter.
8. Setelah seluruh data selesai dimasukkan, program menghitung rata-rata nilai kelas.
9. Program menambahkan ringkasan berupa rata-rata nilai, jumlah siswa lulus, dan jumlah siswa tidak lulus ke bagian akhir file.
10. Setelah proses penulisan selesai, program membuka kembali file menggunakan FileReader dan BufferedReader.
11. Isi file dibaca baris demi baris menggunakan `readLine()` sampai mencapai akhir file (`null`).
12. Seluruh isi laporan ditampilkan kembali pada layar konsol.
13. Program selesai dan resource yang digunakan ditutup secara otomatis menggunakan try-with-resources.

## 3. Output Program

Program menghasilkan dua bentuk output, yaitu:

### A. Output pada Konsol

Output konsol menampilkan proses input data siswa dan hasil pembacaan kembali file laporan.

Informasi yang ditampilkan meliputi:
- Nama siswa.
- Nilai masing-masing siswa.
- Status kelulusan.
- Rata-rata nilai kelas.
- Jumlah siswa yang lulus.
- Jumlah siswa yang tidak lulus.

**Contoh Output:**
======================================
         PROGRAM DATA NILAI SISWA
======================================
Masukkan jumlah siswa: 3

Data Siswa ke-1
--------------------------------------
Nama siswa  : Faisal
Nilai siswa : 88
Status      : Lulus

Data Siswa ke-2
--------------------------------------
Nama siswa  : Bima
Nilai siswa : 53
Status      : Tidak Lulus

Data Siswa ke-3
--------------------------------------
Nama siswa  : Gibran
Nilai siswa : 70
Status      : Lulus

Data berhasil disimpan ke file laporan_nilai.txt

======================================
          HASIL LAPORAN NILAI
======================================
======================================
             LAPORAN NILAI SISWA
======================================
Nama   : Faisal
Nilai  : 88.0
Status : Lulus
--------------------------------------
Nama   : Bima
Nilai  : 53.0
Status : Tidak Lulus
--------------------------------------
Nama   : Gibran
Nilai  : 70.0
Status : Lulus
--------------------------------------

============== RINGKASAN ==============
Rata-rata nilai kelas : 70.33333333333333
Jumlah siswa lulus : 2
Jumlah siswa tidak lulus : 1
======================================
======================================
           PROGRAM SELESAI
======================================

### B. Output File Teks

Selain menampilkan hasil pada konsol, program juga menghasilkan file bernama `laporan_nilai.txt`.

File tersebut berisi seluruh data siswa yang telah dimasukkan beserta ringkasan hasil perhitungan nilai kelas. File dibuat secara otomatis ketika program dijalankan dan disimpan pada working directory program.

Dengan adanya file ini, data nilai siswa dapat disimpan dan dibuka kembali tanpa harus memasukkan data dari awal selama file tersebut tidak ditimpa atau dihapus.

## Kesimpulan

Melalui program ini, pengguna dapat mengelola data nilai siswa dengan lebih mudah, mulai dari memasukkan data, menentukan status kelulusan, menghitung rata-rata nilai, hingga menyimpan dan membaca kembali laporan menggunakan file teks.

Program ini juga menerapkan penggunaan Scanner, perulangan, percabangan, File I/O, exception handling, dan try-with-resources dalam Java.