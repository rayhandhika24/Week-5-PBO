/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiketbioskop;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author raydh
 */
// Class Bioskop
class Bioskop {
    private String nama;
    private String lokasi;
    private List<Film> filmList; // Aggregation with Film

    public Bioskop(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.filmList = new ArrayList<>();
    }

    public void tambahFilm(Film film) {
        filmList.add(film);
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public List<Film> getFilmList() {
        return filmList;
    }
}
