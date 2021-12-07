/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author asus
 */
public class Lingkaran extends BangunDatar {
    public double jari;
    
    public double hitungLuas(){
        double luas = Math.PI*this.jari*this.jari;
        return luas;
    }  
    public double hitungKeliling(){
        double keliling = 2*Math.PI*this.jari;
        return keliling;
    }
}