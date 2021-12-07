/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;

/**
 *
 * @author asus
 */
public class MainClass {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.sisi = 7;
        p.hitungLuas();
        p.hitungKeliling();
        p.tampilHasil();
        System.out.println("");
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 7;
        pp.lebar = 5;
        pp.hitungLuas();
        pp.hitungKeliling();
        pp.tampilHasil();
        System.out.println("");
        
        Lingkaran l = new Lingkaran();
        l.jari = 7;
        l.hitungLuas();
        l.hitungKeliling();
        l.tampilHasil();
        System.out.println("");
        
        Tabung t = new Tabung();
        t.jari = 7;
        t.tinggi = 14;
        t.hitungLuas();
        t.hitungVolume();
        t.tampilHasil();
        System.out.println("");
        
        Balok b = new Balok();
        b.panjang = 7;
        b.lebar = 8;
        b.tinggi = 6;
        b.hitungLuas();
        b.hitungVolume();
        b.tampilHasil();
        System.out.println("");
        
        Bola bo = new Bola();
        bo.jari = 7;
        bo.hitungLuas();
        bo.hitungVolume();
        bo.tampilHasil();
    }
}