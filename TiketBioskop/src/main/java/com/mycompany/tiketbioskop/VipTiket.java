/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiketbioskop;
/**
 *
 * @author raydh
 */
// Subclass VipTicket
class VipTicket extends Tiket {
    private String layananVip;

    public VipTicket(double harga, String nomorKursi, String layananVip) {
        super(harga, nomorKursi);
        this.layananVip = layananVip;
    }

    public String getLayananVip() {
        return layananVip;
    }
}
