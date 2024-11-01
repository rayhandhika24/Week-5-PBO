/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiketbioskop;

/**
 *
 * @author raydh
 */
public class TiketBioskop {

    public static void main(String[] args) {
    // Membuat objek bioskop dan film
        Bioskop bioskop = new Bioskop("Cinema XXI", "Mall Central Park");
        Film film1 = new Film("Avatar", 162, "PG-13");
        Film film2 = new Film("Interstellar", 169, "PG-13");

        bioskop.tambahFilm(film1);
        bioskop.tambahFilm(film2);

        // Membuat penonton dan tiket
        Penonton penonton1 = new Penonton("P001", "Alice");
        Penonton penonton2 = new Penonton("P002", "Bob");

        Tiket regularTicket = new RegularTicket(50000, "A10");
        VipTicket vipTicket = new VipTicket(100000, "VIP01", "Snack Gratis");

        // Membuat booking untuk penonton
        penonton1.buatBooking("B001", "18:00", regularTicket, film1);
        penonton2.buatBooking("B002", "20:00", vipTicket, film2);

        // Menampilkan hasil
        System.out.println("Bioskop: " + bioskop.getNama() + ", Lokasi: " + bioskop.getLokasi());
        System.out.println("Film yang tersedia:");
        for (Film film : bioskop.getFilmList()) {
            System.out.println("- " + film.getJudul() + " (" + film.getDurasi() + " menit, Rating: " + film.getRating() + ")");
        }

        System.out.println("\nBooking Penonton:");
        System.out.println(penonton1.getNama() + " memesan kursi " + penonton1.getBooking().getTiket().getNomorKursi() + 
                           " untuk film " + penonton1.getBooking().getFilm().getJudul() + " pada jadwal " + penonton1.getBooking().getJadwal());
        System.out.println(penonton2.getNama() + " memesan kursi " + penonton2.getBooking().getTiket().getNomorKursi() + 
                           " untuk film " + penonton2.getBooking().getFilm().getJudul() + " pada jadwal " + penonton2.getBooking().getJadwal() + 
                           " dengan layanan VIP: " + ((VipTicket) penonton2.getBooking().getTiket()).getLayananVip());
    }
}
