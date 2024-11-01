/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiketbioskop;
/**
 *
 * @author raydh
 */
// Superclass Tiket
abstract class Tiket {
    protected double harga;
    protected String nomorKursi;

    public Tiket(double harga, String nomorKursi) {
        this.harga = harga;
        this.nomorKursi = nomorKursi;
    }

    public double getHarga() {
        return harga;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }
}