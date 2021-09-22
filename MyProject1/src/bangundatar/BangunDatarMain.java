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
public class BangunDatarMain {
    public static void  main(String[] args) {
        
        //Hitung Persegi Panjang
        PersegiPanjang op1 = new PersegiPanjang();
        op1.panjang = 25;
        op1.lebar = 38;
        op1.hitungLuas();
        op1.hitungKeliling();
        
        //Hitung Persegi
        Persegi op2 = new Persegi();
        op2.sisiA = 10;
        op2.sisiB = 15;
        op2.hitungLuasA();
        op2.hitungKelilingA();
        op2.hitungLuasB();
        op2.hitungKelilingB();
        
        //Hitung Lingkaran
        Lingkaran op3 = new Lingkaran();
        op3.jariX = 25;
        op3.jariZ = 37;
        op3.phi = 3.14;
        op3.hitungLuasX();
        op3.hitungKelilingX();
        op3.hitungLuasZ();
        op3.hitungKelilingZ();
    }
}