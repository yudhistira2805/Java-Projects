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
public class PersegiPanjang {
    //overloading luas
    int hitungLuas(int p, int l){
        return(p*l);
    }
    double hitungLuas(double p, int l){
        return(p*l);
    }
    double hitungLuas(int p, double l){
        return(p*l);
    }
    double hitungLuas(double p, double l){
        return(p*l);
    }   
    
    //overloading keliling
    int hitungKel(int p, int l){
        return(p+p+l+l);
    }
    double hitungKel(double p, int l){
        return(p+p+l+l);
    }
    double hitungKel(int p, double l){
        return(p+p+l+l);
    }
    double hitungKel(double p, double l){
        return(p+p+l+l);
    }  
}
