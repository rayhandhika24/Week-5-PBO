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
// Class Film
class Film {
    private String judul;
    private int durasi; // durasi dalam menit
    private String rating;
    private List<Penonton> penontonList; // Association with Penonton

    public Film(String judul, int durasi, String rating) {
        this.judul = judul;
        this.durasi = durasi;
        this.rating = rating;
        this.penontonList = new ArrayList<>();
    }

    public void tambahPenonton(Penonton penonton) {
        penontonList.add(penonton);
    }

    public String getJudul() {
        return judul;
    }

    public int getDurasi() {
        return durasi;
    }

    public String getRating() {
        return rating;
    }

    public List<Penonton> getPenontonList() {
        return penontonList;
    }
}
