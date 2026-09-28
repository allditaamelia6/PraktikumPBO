/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.service;

import library.model.Book;
import library.model.Member;
import library.exception.BookNotFoundException;
import library.exception.BorrowLimitExceededException;
import library.exception.BookAlreadyBorrowedException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibraryService {
    
      private ArrayList<Book> daftarBuku;
    private ArrayList<Member> daftarMember;

    // Constructor
    public LibraryService() {
        daftarBuku = new ArrayList<>();
        daftarMember = new ArrayList<>();
    }

    // =====================================
    // TAMBAH DATA
    // =====================================

    public void tambahBuku(Book book) {
        daftarBuku.add(book);
    }

    public void tambahMember(Member member) {
        daftarMember.add(member);
    }

    // =====================================
    // MENAMPILKAN SEMUA BUKU
    // =====================================

    public void tampilkanSemuaBuku() {

        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku.");
            return;
        }

        System.out.println("\n===== DAFTAR BUKU =====");

        for (Book book : daftarBuku) {
            System.out.println(book);
        }
    }

    // =====================================
    // MENCARI BUKU
    // =====================================

    public ArrayList<Book> cariBuku(String keyword) {

        ArrayList<Book> hasil = new ArrayList<>();

        String kataKunci = keyword.toLowerCase();

        for (Book book : daftarBuku) {

            String judul = book.getJudul().toLowerCase();
            String kategori = book.getKategori().toLowerCase();

            if (judul.contains(kataKunci)
                    || kategori.contains(kataKunci)) {

                hasil.add(book);
            }
        }

        return hasil;
    }

    // =====================================
    // MENCARI BUKU SECARA SPESIFIK
    // =====================================

    private Book cariBukuExact(String judul)
            throws BookNotFoundException {

        for (Book book : daftarBuku) {

            if (book.getJudul().equalsIgnoreCase(judul)) {
                return book;
            }
        }

        throw new BookNotFoundException(
                "Buku \"" + judul + "\" tidak ditemukan."
        );
    }

    // =====================================
    // MENCARI MEMBER
    // =====================================

    private Member cariMember(String id) {

        for (Member member : daftarMember) {

            if (member.getId().equalsIgnoreCase(id)) {
                return member;
            }
        }

        return null;
    }

    // =====================================
    // PEMINJAMAN BUKU
    // =====================================

    public void pinjamBuku(String idMember, String judul)
            throws BookNotFoundException,
            BorrowLimitExceededException,
            BookAlreadyBorrowedException {

        Member member = cariMember(idMember);

        // Assertion untuk memastikan member valid
        assert member != null :
                "Data anggota tidak valid!";

        Book book = cariBukuExact(judul);

        // Mengecek apakah buku sedang dipinjam
        if (!book.isTersedia()) {

            throw new BookAlreadyBorrowedException(
                    "Buku sedang dipinjam."
            );
        }

        // Maksimal 3 buku
        if (member.jumlahPinjaman() >= 3) {

            throw new BorrowLimitExceededException(
                    "Anggota sudah mencapai batas 3 buku."
            );
        }

        // Proses peminjaman
        member.tambahPinjaman(book);

        book.setStatusKetersediaan(false);

        book.tambahJumlahDipinjam();

        System.out.println(
                "Buku berhasil dipinjam."
        );
    }

    // =====================================
    // PENGEMBALIAN BUKU
    // =====================================

    public void kembalikanBuku(
            String idMember,
            String judul)
            throws BookNotFoundException {

        Member member = cariMember(idMember);

        // Assertion
        assert member != null :
                "Data anggota tidak valid!";

        Book book = cariBukuExact(judul);

        // Mengecek apakah buku benar-benar dipinjam
        if (!member.getDaftarPinjaman().contains(book)) {

            System.out.println(
                    "Buku tersebut tidak sedang "
                    + "dipinjam oleh anggota."
            );

            return;
        }

        // Menghapus buku dari daftar pinjaman
        member.hapusPinjaman(book);

        // Mengubah status menjadi tersedia
        book.setStatusKetersediaan(true);

        System.out.println(
                "Buku berhasil dikembalikan."
        );
    }

    // =====================================
    // LAPORAN PERPUSTAKAAN
    // =====================================

    public void tampilkanLaporan() {

        System.out.println(
                "\n===== LAPORAN PERPUSTAKAAN ====="
        );

        // ---------------------------------
        // Total pinjaman
        // ---------------------------------

        int totalPinjaman = 0;

        for (Member member : daftarMember) {

            totalPinjaman += member.jumlahPinjaman();
        }

        System.out.println(
                "Jumlah total pinjaman aktif: "
                + totalPinjaman
        );

        // ---------------------------------
        // Anggota paling aktif
        // ---------------------------------

        Member anggotaAktif = null;

        for (Member member : daftarMember) {

            if (anggotaAktif == null
                    || member.jumlahPinjaman()
                    > anggotaAktif.jumlahPinjaman()) {

                anggotaAktif = member;
            }
        }

        if (anggotaAktif != null) {

            System.out.println(
                    "Anggota paling aktif: "
                    + anggotaAktif.getNama()
                    + " ("
                    + anggotaAktif.jumlahPinjaman()
                    + " buku)"
            );
        }

        // ---------------------------------
        // Buku paling sering dipinjam
        // ---------------------------------

        Book bukuTerpopuler = null;

        for (Book book : daftarBuku) {

            if (bukuTerpopuler == null
                    || book.getJumlahDipinjam()
                    > bukuTerpopuler.getJumlahDipinjam()) {

                bukuTerpopuler = book;
            }
        }

        if (bukuTerpopuler != null) {

            System.out.println(
                    "Buku paling sering dipinjam: "
                    + bukuTerpopuler.getJudul()
                    + " ("
                    + bukuTerpopuler.getJumlahDipinjam()
                    + " kali)"
            );
        }

        // ---------------------------------
        // Kategori paling populer
        // ---------------------------------

        HashMap<String, Integer> jumlahKategori
                = new HashMap<>();

        for (Book book : daftarBuku) {

            String kategori = book.getKategori();

            jumlahKategori.put(
                    kategori,
                    jumlahKategori.getOrDefault(
                            kategori, 0
                    ) + 1
            );
        }

        String kategoriPopuler = null;
        int jumlahTerbanyak = 0;

        for (Map.Entry<String, Integer> entry
                : jumlahKategori.entrySet()) {

            if (entry.getValue() > jumlahTerbanyak) {

                jumlahTerbanyak = entry.getValue();
                kategoriPopuler = entry.getKey();
            }
        }

        System.out.println(
                "Kategori paling populer: "
                + kategoriPopuler
                + " ("
                + jumlahTerbanyak
                + " buku)"
        );
    }
}
