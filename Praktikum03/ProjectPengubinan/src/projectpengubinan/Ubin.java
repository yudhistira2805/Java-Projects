/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author asus
 */
public class Ubin {
    //panjang ubin
    int panjang;
    
    //lebar ubin
    int lebar;
    
    //hitung luas sebuah ubin
    int hitungLuas(){
        //menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang p = new PersegiPanjang();

        //hitung luas
        return p.hitungLuas(this.panjang, this.lebar);
    }
}
