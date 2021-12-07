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
public class Tabung extends BangunRuang{
    public double jari;
    public double tinggi;
    
    public double hitungVolume(){
        double vol = Math.PI*this.jari*this.jari*tinggi;
        return vol;
    }
    public double hitungLuas(){
        double luas = 2*Math.PI*this.jari*(this.jari+this.tinggi);
        return luas;
    }
}
