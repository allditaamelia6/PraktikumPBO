/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.main;

import library.model.Book;
import library.model.Member;
import library.service.LibraryService;
import library.exception.BookNotFoundException;
import library.exception.BorrowLimitExceededException;
import library.exception.BookAlreadyBorrowedException;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LibraryService library = new LibraryService();

        library.tambahBuku(
                new Book(
                        "Laskar Pelangi",
                        "Andrea Hirata",
                        2005,
                        "Novel"
                )
        );

        library.tambahBuku(
                new Book(
                        "Bumi",
                        "Tere Liye",
                        2014,
                        "Fantasi"
                )
        );

        library.tambahBuku(
                new Book(
                        "Pemrograman Java",
                        "Budi Santoso",
                        2022,
                        "Teknologi"
                )
        );

        library.tambahBuku(
                new Book(
                        "Basis Data",
                        "Andi Wijaya",
                        2023,
                        "Teknologi"
                )
        );

        library.tambahMember(
                new Member(
                        "M001",
                        "Coky"
                )
        );

        library.tambahMember(
                new Member(
                        "M002",
                        "Valery"
                )
        
        );

        int pilihan;

        do {

            System.out.println(
                    "\n=============================="
            );

            System.out.println(
                    "       MINI LIBRARY SYSTEM"
            );

            System.out.println(
                    "=============================="
            );

            System.out.println(
                    "1. Tambah Buku"
            );

            System.out.println(
                    "2. Daftar Buku"
            );

            System.out.println(
                    "3. Cari Buku"
            );

            System.out.println(
                    "4. Pinjam Buku"
            );

            System.out.println(
                    "5. Kembalikan Buku"
            );

            System.out.println(
                    "6. Laporan Perpustakaan"
            );

            System.out.println(
                    "7. Keluar"
            );

            System.out.println(
                    "=============================="
            );

            System.out.print(
                    "Pilih menu: "
            );

            pilihan = input.nextInt();

            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print(
                            "Judul: "
                    );

                    String judul = input.nextLine();

                    // Character
                    if (!judul.isEmpty()) {

                        char karakterPertama =
                                judul.charAt(0);

                        System.out.println(
                                "Karakter pertama judul: "
                                + karakterPertama
                        );

                        if (Character.isLetter(
                                karakterPertama)) {

                            System.out.println(
                                    "Judul diawali huruf."
                            );
                        }
                    }

                    System.out.print(
                            "Penulis: "
                    );

                    String penulis =
                            input.nextLine();

                    System.out.print(
                            "Tahun terbit: "
                    );

                    int tahun =
                            input.nextInt();

                    input.nextLine();

                    System.out.print(
                            "Kategori: "
                    );

                    String kategori =
                            input.nextLine();

                    Book bukuBaru =
                            new Book(
                                    judul,
                                    penulis,
                                    tahun,
                                    kategori
                            );

                    library.tambahBuku(
                            bukuBaru
                    );

                    System.out.println(
                            "Buku berhasil ditambahkan."
                    );

                    break;

                case 2:

                    library.tampilkanSemuaBuku();

                    break;

                case 3:

                    System.out.print(
                            "Masukkan judul/kategori: "
                    );

                    String keyword =
                            input.nextLine();

                    ArrayList<Book> hasil =
                            library.cariBuku(keyword);

                    if (hasil.isEmpty()) {

                        System.out.println(
                                "Buku tidak ditemukan."
                        );

                    } else {

                        System.out.println(
                                "\n===== HASIL PENCARIAN ====="
                        );

                        for (Book book : hasil) {

                            System.out.println(book);
                        }
                    }

                    break;

                case 4:

                    System.out.print(
                            "ID Anggota: "
                    );

                    String idPinjam =
                            input.nextLine();

                    System.out.print(
                            "Judul buku: "
                    );

                    String judulPinjam =
                            input.nextLine();

                    try {

                        library.pinjamBuku(
                                idPinjam,
                                judulPinjam
                        );

                    } catch (
                            BookNotFoundException
                            | BorrowLimitExceededException
                            | BookAlreadyBorrowedException e) {

                        System.out.println(
                                "Gagal: "
                                + e.getMessage()
                        );
                    }

                    break;

                case 5:

                    System.out.print(
                            "ID Anggota: "
                    );

                    String idKembali =
                            input.nextLine();

                    System.out.print(
                            "Judul buku: "
                    );

                    String judulKembali =
                            input.nextLine();

                    try {

                        library.kembalikanBuku(
                                idKembali,
                                judulKembali
                        );

                    } catch (
                            BookNotFoundException e) {

                        System.out.println(
                                "Gagal: "
                                + e.getMessage()
                        );
                    }

                    break;

                case 6:

                    library.tampilkanLaporan();

                    break;

                case 7:

                    System.out.println(
                            "Program selesai. "
                            + "Terima kasih!"
                    );

                    break;

                default:

                    System.out.println(
                            "Pilihan menu tidak tersedia."
                    );
            }

        } while (pilihan != 7);

        input.close();
    }
}
