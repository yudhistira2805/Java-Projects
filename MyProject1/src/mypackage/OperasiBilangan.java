/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author asus
 */
public class OperasiBilangan {

    
    //atribut
    public double bilPertama;
    public double bilKedua;
    
    //methods
    public void hitungPenjumlahan(){
        double hasil = bilPertama + bilKedua;
        System.out.println("Hasil penjumlahannya: " + hasil);
    }
    
    public void hitungPengurangan(){
        double hasil = bilPertama - bilKedua;
        System.out.println("Hasil pengurangannya: " + hasil);
    }
    
    public void hitungPerkalian() {
        double hasil = bilPertama * bilKedua;
        System.out.println("Hasil perkaliannya: " + hasil);
    }
    
    public void hitungPembagian() {
        double hasil = bilPertama / bilKedua;
        System.out.println("Hasil pembagiannya: " + hasil);
    }
}
