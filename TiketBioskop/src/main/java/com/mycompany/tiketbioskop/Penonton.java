/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiketbioskop;
/**
 *
 * @author raydh
 */
// Class Penonton
class Penonton {
    private String idPenonton;
    private String nama;
    private Booking booking; // Composition with Booking

    public Penonton(String idPenonton, String nama) {
        this.idPenonton = idPenonton;
        this.nama = nama;
    }

    public void buatBooking(String idBooking, String jadwal, Tiket tiket, Film film) {
        this.booking = new Booking(idBooking, jadwal, tiket, this, film);
        film.tambahPenonton(this); // Menambahkan penonton ke film
    }

    public Booking getBooking() {
        return booking;
    }

    public String getIdPenonton() {
        return idPenonton;
    }

    public String getNama() {
        return nama;
    }
}
