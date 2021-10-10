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
public class Segitiga {
        //overloading luas
    int hitungLuas(int a, int t){
        return(a*t/2);
    }
    double hitungLuas(double a, int t){
        return(a*t/2);
    }
    double hitungLuas(int a, double t){
        return(a*t/2);
    }
    double hitungLuas(double a, double t){
        return(a*t/2);
    }   
    
    //overloading keliling
    int hitungKel(int a, int t){
        return(a*3);
    }
    double hitungKel(double a, int t){
        return(a*3);
    }
    double hitungKel(int a, double t){
        return(a*3);
    }
    double hitungKel(double a, double t){
        return(a*3);
    }
}