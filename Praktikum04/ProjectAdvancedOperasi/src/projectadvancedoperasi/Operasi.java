/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author asus
 */
public class Operasi {
    
    //overloading penjumlahan
    int jumlahkan(int a, int b){
        return (a+b);
    }
    int jumlahkan(int a, int b, int c){
        return (a+b+c);
    }
    double jumlahkan(double a, double b, double c){
        return (a+b+c);
    }
    
    //overloading perkalian
    int kalikan(int a, int b){
        return (a*b);
    }
    double kalikan(double a, int b){
        return (a*b);
    }
    double kalikan(int a, double b){
        return (a*b);
    }
    int kalikan(int a, int b, int c){
        return (a*b*c);
    }
    double kalikan(double a, int b, int c){
        return (a*b*c);
    }
    double kalikan(double a, double b, int c){
        return (a*b*c);
    }
    double kalikan(double a, int b, double c){
        return (a*b*c);
    }
    double kalikan(int a, int b, double c){
        return (a*b*c);
    }
    double kalikan(int a, double b, double c){
        return (a*b*c);
    } 
    double kalikan(double a, double b){
        return (a*b);
    }
    double kalikan(double a, double b, double c){
        return (a*b*c);
    }    
}