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
public class Ruang {
    //panjang ruangan
    int panjang;
    //lebar ruangan
    int lebar;
    
    int hitungLuas(){
        //menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang p = new PersegiPanjang();
        
        //hitung luas
        return p.perkalian(this.panjang, this.lebar);
    }
}
