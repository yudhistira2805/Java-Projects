/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author asus
 */
public class Bola extends BangunRuang {
    public double jari;
    
    public double hitungVolume(){
        double vol = 4/3*Math.PI*this.jari*this.jari*this.jari;
        return vol;
    }
    public double hitungLuas(){
        double luas = 4*Math.PI*this.jari*this.jari;
        return luas;
    }
}