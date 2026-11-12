# Sistem Pengelolaan Nilai Mahasiswa (Java OOP)

## 1. Deskripsi Sistem

Program Sistem Pengelolaan Nilai Mahasiswa merupakan program berbasis Java yang dibuat untuk mengelola data nilai mahasiswa secara sederhana. Program ini menggunakan konsep Object-Oriented Programming (OOP) dengan tujuan untuk mempermudah proses memasukkan, mengolah, memvalidasi, dan menyimpan data nilai mahasiswa.

Pengguna dapat memasukkan data berupa nama, NIM, dan nilai mahasiswa melalui keyboard. Setelah data dimasukkan, program akan melakukan validasi untuk memastikan bahwa data yang dimasukkan sudah sesuai dengan ketentuan. Program juga menentukan grade dan status kelulusan mahasiswa berdasarkan nilai yang diperoleh, dengan standar kelulusan minimal 70.

Dalam pembuatannya, program ini menerapkan beberapa materi Java, yaitu Package, Class, Constructor, Encapsulation, Conditional Statement, Looping, Custom Exception, Assertion, String Manipulation, Character, ArrayList, Scanner, dan File I/O.

Data mahasiswa yang sudah diinput akan disimpan menggunakan ArrayList, kemudian hasil pengolahan data akan dibuat menjadi laporan dalam file teks bernama `laporan_nilai.txt`.

## 2. Alur Program

Berikut merupakan tahapan proses yang dilakukan oleh program:

1. **Memulai Program**  
   Program dijalankan melalui class Main dan menampilkan judul Sistem Pengelolaan Nilai Mahasiswa.

2. **Memasukkan Jumlah Mahasiswa**  
   Pengguna diminta memasukkan jumlah mahasiswa yang datanya akan dikelola.

3. **Input Data Mahasiswa**  
   Pengguna memasukkan nama, NIM, dan nilai setiap mahasiswa melalui keyboard menggunakan Scanner.

4. **Validasi Data**  
   Program melakukan pemeriksaan terhadap data yang dimasukkan, seperti:
   - Nama tidak boleh kosong.
   - NIM tidak boleh kosong dan hanya boleh berisi angka.
   - Nilai harus berada dalam rentang 0 sampai 100.
   - Jika nilai tidak sesuai, program akan menampilkan pesan kesalahan menggunakan Custom Exception.

5. **Menyimpan Data ke ArrayList**  
   Jika data sudah valid, program membuat objek Mahasiswa dan menyimpannya ke dalam ArrayList agar seluruh data mahasiswa dapat dikelola secara dinamis.

6. **Menentukan Grade dan Status Kelulusan**  
   Program menentukan grade berdasarkan nilai mahasiswa, yaitu A, B, C, atau D. Status kelulusan ditentukan berdasarkan standar nilai minimal 70.

7. **Menghitung Statistik Nilai**  
   Setelah seluruh data berhasil dimasukkan, program menghitung jumlah mahasiswa, total nilai, rata-rata kelas, jumlah mahasiswa yang lulus, dan jumlah mahasiswa yang tidak lulus.

8. **Menampilkan Rekapitulasi**  
   Hasil pengolahan data ditampilkan pada layar console, sehingga pengguna dapat melihat seluruh data mahasiswa beserta grade dan status kelulusannya.

9. **Menyimpan Laporan ke File**  
   Program menyimpan daftar mahasiswa dan statistik kelas ke dalam file `laporan_nilai.txt` menggunakan BufferedWriter dan FileWriter.

10. **Membaca File Laporan**  
    Setelah laporan berhasil disimpan, program membaca kembali isi file menggunakan BufferedReader dan FileReader, kemudian menampilkannya pada console.

11. **Program Selesai**  
    Setelah seluruh proses selesai, program menampilkan pesan bahwa program telah selesai dijalankan.

## 3. Output Program

Output yang dihasilkan dari program ini berupa informasi data mahasiswa dan laporan rekapitulasi nilai.

Adapun hasil yang ditampilkan meliputi:

- Data nama mahasiswa.
- NIM mahasiswa.
- Nilai masing-masing mahasiswa.
- Grade atau nilai huruf (A, B, C, D).
- Status kelulusan (LULUS atau TIDAK LULUS).
- Jumlah seluruh mahasiswa.
- Rata-rata nilai kelas.
- Jumlah mahasiswa yang lulus.
- Jumlah mahasiswa yang tidak lulus.

Selain ditampilkan pada console, seluruh hasil rekapitulasi juga disimpan secara permanen ke dalam file teks `laporan_nilai.txt`. File tersebut dapat dibuka kembali untuk melihat data mahasiswa dan statistik nilai tanpa harus memasukkan data dari awal selama file tidak diubah atau dihapus.

Contoh Output Program<br>

========================================<br>
     SISTEM PENGELOLAAN NILAI MAHASISWA<br>
========================================<br>
Masukkan jumlah mahasiswa: 4<br>

Data Mahasiswa ke-1<br>
Masukkan Nama: Bunga<br>
Masukkan NIM: 032501<br>
Masukkan Nilai: 96<br>
Data mahasiswa berhasil ditambahkan!<br>

Data Mahasiswa ke-2<br>
Masukkan Nama: Lesya<br>
Masukkan NIM: 032502<br>
Masukkan Nilai: 67<br>
Data mahasiswa berhasil ditambahkan!<br>

Data Mahasiswa ke-3<br>
Masukkan Nama: Resti<br>
Masukkan NIM: 032503<br>
Masukkan Nilai: 43<br>
Data mahasiswa berhasil ditambahkan!<br>

Data Mahasiswa ke-4<br>
Masukkan Nama: Fatik<br>
Masukkan NIM: 032504<br>
Masukkan Nilai: 88<br>
Data mahasiswa berhasil ditambahkan!<br>

========================================<br>
          REKAPITULASI NILAI<br>
========================================<br>
Nama: BUNGA | NIM: 032501 | Nilai: 96.0 | Grade: A | Status: LULUS<br>
Nama: LESYA | NIM: 032502 | Nilai: 67.0 | Grade: C | Status: TIDAK LULUS<br>
Nama: RESTI | NIM: 032503 | Nilai: 43.0 | Grade: D | Status: TIDAK LULUS<br>
Nama: FATIK | NIM: 032504 | Nilai: 88.0 | Grade: A | Status: LULUS<br>
----------------------------------------<br>
Jumlah Mahasiswa : 4<br>
Rata-rata Nilai  : 73.5<br>
Jumlah Lulus     : 2<br>
Jumlah Tidak Lulus: 2<br>

Laporan berhasil disimpan ke file laporan_nilai.txt<br>

========================================<br>
       MEMBACA FILE LAPORAN<br>
========================================<br>
========================================<br>
       LAPORAN NILAI MAHASISWA<br>
========================================<br>

DAFTAR MAHASISWA<br>
----------------------------------------<br>
Nama: BUNGA | NIM: 032501 | Nilai: 96.0 | Grade: A | Status: LULUS<br>
Nama: LESYA | NIM: 032502 | Nilai: 67.0 | Grade: C | Status: TIDAK LULUS<br>
Nama: RESTI | NIM: 032503 | Nilai: 43.0 | Grade: D | Status: TIDAK LULUS<br>
Nama: FATIK | NIM: 032504 | Nilai: 88.0 | Grade: A | Status: LULUS<br>

STATISTIK KELAS<br>
----------------------------------------<br>
Jumlah Mahasiswa : 4<br>
Rata-rata Nilai  : 73.5<br>
Jumlah Lulus     : 2<br>
Jumlah Tidak Lulus: 2<br>
----------------------------------------<br>

Program selesai dijalankan.

### File yang Dihasilkan

Program menghasilkan satu file teks, yaitu:

**`laporan_nilai.txt`**

File ini berisi daftar seluruh mahasiswa beserta NIM, nilai, grade, status kelulusan, dan statistik nilai kelas. Dengan adanya file tersebut, hasil pengolahan data dapat disimpan dan dilihat kembali.

---

**Kesimpulan**

Melalui program ini, saya dapat memahami penerapan konsep OOP dalam Java serta penggunaan beberapa materi pendukung seperti Exception Handling, Assertion, Collection Framework, String Manipulation, dan File I/O. Program ini juga membantu memahami bagaimana data mahasiswa dikelola mulai dari proses input, validasi, pengolahan, hingga penyimpanan hasil ke dalam file teks.
