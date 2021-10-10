/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author asus
 */
public class Lingkaran {
    //tentukan phi
    static double phi = 3.14;
    
    //overloading luas
    double hitungLuas(int r){
        double luas = phi*(r*r);
        return luas;
    }
    double hitungLuas(double r){
        double luas = phi*(r*r);
        return luas;
    }
    
    //overloading keliling
    double hitungKel(int r){
        return(2. * phi*r);
    }
    double hitungKel(double r){
        return(2. * phi*r);
    }
}