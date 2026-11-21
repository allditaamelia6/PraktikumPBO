# Kasir Kantin UNS

Praktikum Pemrograman Berorientasi Objek (PBO) Kelas 3B, Pertemuan 11 (Multithreading) dan Pertemuan 12 (GUI Programming).

**Nama:** Alldita Putri Amelia<br>
**NIM:** L0325037<br>
**Kelas:** PBO 3B<br>

---

## Deskripsi Program

Kasir Kantin UNS adalah aplikasi kasir sederhana berbasis jendela (Java Swing). Kasir memasukkan nama menu, harga, dan jumlah, lalu aplikasi menghitung total bayar. Jika subtotal lebih dari Rp 50.000, pelanggan mendapat diskon 10 persen.

Selain itu, program memuat simulasi dua kasir yang melayani pelanggan secara bersamaan (multithreading) dan fitur cetak struk yang berjalan di thread terpisah sehingga jendela tidak macet.

## Struktur Project

Semua class berada dalam satu package `lab.kasir`.

| File | Fungsi |
|---|---|
| `Pesanan.java` | Class logika: menyimpan subtotal, menambah item, menghitung total beserta diskon, dan reset |
| `Kasir.java` | Class turunan `Thread` yang mewakili seorang kasir |
| `MainKasir.java` | Class utama untuk menguji `Pesanan` (Tahap 1) dan menjalankan dua kasir (Tahap 2) |
| `KasirFrame.java` | Tampilan GUI Swing (Tahap 3) beserta tombol Cetak Struk berbasis thread (Tahap 4) |

## Konsep yang Digunakan

- **Enkapsulasi:** atribut `subtotal` pada `Pesanan` dan `nama` pada `Kasir` bersifat `private`, diakses lewat method.
- **Inheritance:** `Kasir` mewarisi `Thread` dan menimpa method `run()`.
- **Multithreading:** `start()` menjalankan thread, `join()` membuat `main` menunggu thread selesai.
- **GUI Swing:** `JFrame`, `JLabel`, `JTextField`, `JTextArea`, `JButton`, dan `JOptionPane`, dengan tata letak manual memakai `setBounds()`.
- **Event handling:** `ActionListener` dengan lambda pada tombol.
- **Penanganan error:** `try-catch` untuk `NumberFormatException` pada validasi input.

---

## Tahap 1: Class Logika

Class `Pesanan` memiliki atribut private `subtotal` (double) dan method berikut:

| Method | Fungsi |
|---|---|
| `tambahItem(double harga, int jumlah)` | Menambahkan `harga x jumlah` ke subtotal |
| `getSubtotal()` | Mengembalikan nilai subtotal |
| `hitungTotal()` | Jika subtotal > 50.000, kembalikan subtotal dikurangi diskon 10 persen. Jika tidak, kembalikan subtotal apa adanya |
| `reset()` | Mengembalikan subtotal ke 0 |

Pengujian dilakukan di `MainKasir` dengan data berikut:

| Menu | Harga | Jumlah |
|---|---|---|
| Nasi Goreng | 15.000 | 2 |
| Es Teh | 5.000 | 3 |
| Ayam Bakar | 25.000 | 1 |

**Hasil:**
- Setelah dua menu pertama: subtotal 45.000 dan total 45.000 (tanpa diskon).
- Setelah menu ketiga: subtotal 70.000 dan total 63.000 (diskon 10 persen).
- Setelah `reset()`: subtotal kembali 0.

**Screenshot:**

<img width="298" height="244" alt="Screenshot 2026-11-20 205033" src="https://github.com/user-attachments/assets/ec23dfcf-1e2d-4d2c-9560-a303e0064110" />


---

## Tahap 2: Dua Kasir sebagai Thread

Class `Kasir` meng-extend `Thread`. Pada method `run()`, setiap kasir mencetak kalimat "Kasir [nama] melayani pelanggan ke-[i]" sebanyak 5 kali dengan jeda 500 ms (`Thread.sleep(500)`) di antara pelanggan.

Pada `MainKasir`, dibuat dua kasir (Dina dan Eko) lalu keduanya dijalankan dengan `start()`. Setelah itu `join()` dipanggil untuk keduanya sehingga kalimat "Semua pelanggan selesai dilayani" hanya dicetak setelah kedua kasir selesai.

**Hasil:** Output Dina dan Eko muncul bergantian, dan kalimat "Semua pelanggan selesai dilayani" selalu muncul paling akhir.

**Catatan percobaan:** Program dijalankan 2 kali dan urutan output **tidak selalu sama**. Hal ini terjadi karena kedua thread berjalan bersamaan dan urutan eksekusinya ditentukan oleh penjadwal (scheduler) JVM dan sistem operasi, bukan oleh urutan pemanggilan `start()`.

**Screenshot (Run 1 dan Run 2):**
<img width="298" height="244" alt="Screenshot 2026-11-20 205033" src="https://github.com/user-attachments/assets/ef865e1a-642e-4c78-9bb6-f3f4e4d9a01f" />


---

## Tahap 3: Tampilan GUI Kasir

Class `KasirFrame` meng-extend `JFrame` dengan layout `null` (posisi diatur manual lewat `setBounds()`). Komponennya:

- Field **Nama Menu**, **Harga**, dan **Jumlah** (`JTextField`)
- Tombol **Tambah** dan **Hitung Total**
- Area struk (`JTextArea`, dibungkus `JScrollPane`)
- Label **Total Bayar**

**Cara kerja:**
- **Tombol Tambah:** membaca isi field, memanggil `pesanan.tambahItem(...)`, menulis satu baris ke area struk, lalu mengosongkan field.
- **Tombol Hitung Total:** menampilkan hasil `pesanan.hitungTotal()` pada label Total Bayar.
- **Validasi:** jika ada field kosong, atau harga dan jumlah bukan angka, ditampilkan pesan lewat `JOptionPane.showMessageDialog`. Kesalahan format angka ditangani dengan `try-catch` untuk `NumberFormatException`.

**Hasil:** Dengan data uji Tahap 1, label total menampilkan **Rp 63.000** setelah ketiga menu ditambahkan.

**Screenshot (tampilan dan hasil total):**

<img width="273" height="331" alt="Screenshot 2026-11-20 205828" src="https://github.com/user-attachments/assets/6a8ce16f-251f-4b60-ae18-4bd6dba66c79" />


**Screenshot (validasi field kosong):**

<img width="340" height="334" alt="Screenshot 2026-11-20 210129" src="https://github.com/user-attachments/assets/aace4153-69f7-4987-b623-0111cb15c839" />


**Screenshot (validasi input bukan angka):**

<img width="351" height="329" alt="Screenshot 2026-11-20 210301" src="https://github.com/user-attachments/assets/3c39acb2-6b2c-4b92-b7b2-696c2689afd9" />


---

## Tahap 4: Tombol Cetak Struk dengan Thread

Pada `KasirFrame` ditambahkan tombol **Cetak Struk** dan label **Status** di bagian bawah. Saat tombol ditekan:

1. Status berubah menjadi "Mencetak struk...".
2. Program menunggu 2 detik (`Thread.sleep(2000)`).
3. Status berubah menjadi "Struk selesai".

Penantian 2 detik dilakukan di thread baru (`new Thread(...).start()`) agar thread tampilan (Event Dispatch Thread) tidak terblokir. Perubahan teks label dibungkus `SwingUtilities.invokeLater` karena komponen Swing sebaiknya hanya diubah dari thread GUI.

**Hasil:**
- Thread baru berjalan lewat `start()`.
- Selama 2 detik menunggu, tombol Tambah dan Hitung Total masih bisa ditekan (jendela tidak macet).
- Label status berubah dari "Mencetak struk..." menjadi "Struk selesai".

**Screenshot (saat mencetak):**

<img width="284" height="332" alt="Screenshot 2026-11-20 210014" src="https://github.com/user-attachments/assets/c55a9434-6ef1-46bb-bee3-404966060c67" />


**Screenshot (selesai):**

<img width="285" height="329" alt="Screenshot 2026-11-20 210035" src="https://github.com/user-attachments/assets/53bb281d-ed1b-4414-b3c9-45c1012cf7d5" />


---

## Kesimpulan

- Enkapsulasi membuat data `subtotal` terlindungi dan hanya diakses lewat method.
- Thread memungkinkan beberapa pekerjaan berjalan bersamaan, dan `join()` memastikan program utama menunggu hingga semuanya selesai.
- Pekerjaan yang lama, seperti menunggu 2 detik saat mencetak struk, sebaiknya dijalankan di thread terpisah supaya tampilan GUI tetap responsif.
