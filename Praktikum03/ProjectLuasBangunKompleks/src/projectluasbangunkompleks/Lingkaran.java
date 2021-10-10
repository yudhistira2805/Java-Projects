/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author asus
 */
public class Lingkaran {
    // deklarasi nilai phi
    static double phi = 22. / 7.;

    //mencari luas lingkaran
    double hitungLuas(double r){
        double luas = phi * (r*r);
        return luas;
    }
    
     //mencari luas lingkaran besar
    double hitungLuasB(double r2){
        double luas2 = phi * (r2*r2);
        return luas2;
    }
    
    //mencari luas lingkaran kecil
    double hitungLuasK(double r3){
        double luas3 = phi * (r3*r3);
        return luas3;
    }
}
