/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiketbioskop;

/**
 *
 * @author raydh
 */
// Class Booking
class Booking {
    private String idBooking;
    private String jadwal;
    private Tiket tiket;
    private Penonton penonton;
    private Film film;

    public Booking(String idBooking, String jadwal, Tiket tiket, Penonton penonton, Film film) {
        this.idBooking = idBooking;
        this.jadwal = jadwal;
        this.tiket = tiket;
        this.penonton = penonton;
        this.film = film;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public String getJadwal() {
        return jadwal;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public Penonton getPenonton() {
        return penonton;
    }

    public Film getFilm() {
        return film;
    }
}
