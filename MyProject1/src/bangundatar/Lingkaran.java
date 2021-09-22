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
public class Lingkaran {
    //methods
    public void hitungLuasX(){
        double hasil = phi * jariX * jariX;
        System.out.println("Luas Lingkaran X adalah: " + hasil);
    }
    
    public void hitungKelilingX(){
        double hasil = phi * 2 * jariX;
        System.out.println("Keliling Lingkaran X adalah: " + hasil);
    }
    
        public void hitungLuasZ(){
        double hasil = phi * jariZ * jariZ;
        System.out.println("Luas Lingkaran Z adalah: " + hasil);
    }
    
    public void hitungKelilingZ(){
        double hasil = phi * 2 * jariZ;
        System.out.println("Keliling Lingkaran Z adalah: " + hasil);
    }    

    //atribut
    public double jariX;
    public double jariZ;
    public double phi;
    

}