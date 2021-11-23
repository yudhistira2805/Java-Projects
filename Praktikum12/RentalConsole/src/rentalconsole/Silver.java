/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

/**
 *
 * @author asus
 */
public class Silver extends Membership {
    
    int disc = 1;
    
    public Silver(Member isi){
        super.membership = isi;
        super.hargaSewa = 25000;
        super.inputSewa();
    }
    
    public void hitungHarga(){
        this.poin = 1 * totalHari;
        this.totalSewa = this.hargaSewa * this.totalHari;
        int discon = this.totalSewa * this.disc/100;
        this.totalSewa -= discon;
    }
    
    public void output(){
        super.output();
        System.out.println("Total Sewa                    : " + this.totalSewa);
        System.out.println("Jumlah Poin                   : " + this.poin);
    }
}