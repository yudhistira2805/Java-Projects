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
public class Balok extends BangunRuang{
    public double panjang;
    public double tinggi;
    public double lebar;
    
    public double hitungVolume(){
        double vol = this.panjang * this.lebar * this.tinggi;
        return vol;
    }   
    public double hitungLuas(){
        double luas = 2*((this.panjang*this.tinggi)+(this.panjang*this.lebar)+(this.tinggi*this.lebar));
        return luas;
    }
}