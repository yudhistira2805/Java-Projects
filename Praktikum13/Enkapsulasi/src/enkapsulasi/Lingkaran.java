/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author asus
 */
public class Lingkaran {
    private int r;
    private double luas;
    
    public void setJari(int r){
        if(r > 0){
            this.r = r;
        } else {
            this.r = 0;
        }
    }
    
    public  int getJari(){
        return this.r;
    }
    
    void hitungLuas(){
        this.luas = Math.PI * this.r * this.r;
    }
    
    public double getLuas(){
        return this.luas;
    }
}
