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
public class Persegi {
    //atribut
    public int sisiA;
    public int sisiB;
    
    //methods
    public void hitungLuasA(){
        int hasil = sisiA * sisiA;
        System.out.println("Luas Persegi A adalah: " + hasil);
    }
    
    public void hitungKelilingA(){
        int hasil = sisiA + sisiA + sisiA + sisiA;
        System.out.println("Keliling Persegi A adalah: " + hasil);
    }
    
        public void hitungLuasB(){
        int hasil = sisiB * sisiB;
        System.out.println("Luas Persegi B adalah: " + hasil);
    }
    
    public void hitungKelilingB(){
        int hasil = sisiB + sisiB + sisiB + sisiB;
        System.out.println("Keliling Persegi B adalah: " + hasil);
    }
}
