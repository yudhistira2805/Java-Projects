/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author asus
 */
public abstract class Mobil {
    public abstract double hitungBBM();
    public abstract double hitungWaktu();
    
    public void tampilHasil() {
        System.out.println("Konsumsi BBM Minimal    : " + this.hitungBBM() + " liter");
        System.out.println("Waktu Tempuh Perjalanan : " + this.hitungWaktu() + " jam\n");
    }
}
