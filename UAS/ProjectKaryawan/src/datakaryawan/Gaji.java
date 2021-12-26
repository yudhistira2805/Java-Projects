/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan;

/**
 *
 * @author asus
 */
public class Gaji {
    private int gapok;
    private double tnikah, tanak, tkar, total, potongan, gaber;
    
    public Gaji(String gol) {
        
        switch(gol){
            case "A":
                this.gapok = 5000000;
                break;
            case "B":
                this.gapok = 6000000;
                break;
            case "C" :
                this.gapok = 7000000;
                break;
        }
    }
    
    public void totalGaji(int anak, int umur, int nikah){
        if(nikah == 0){
            this.tnikah = 0;
        }else{
            this.tnikah = gapok*10/1000;
        }
        if(umur < 30){
            this.tkar = 0;
        }else{
            this.tkar = gapok*15/100;
        }
        this.tanak = anak*(gapok*5/100);
        this.total = this.gapok+ this.tnikah + this.tanak + this.tkar;
        this.potongan = total*25/1000;
        this.gaber = this.total-this.potongan;
    }
    
    public double tNikah(){
        return this.tnikah;
    }   
    public double tKar(){
        return this.tkar;
    }    
    public double tAnak(){
        return this.tanak;
    }    
    public int Gapok(){
        return this.gapok;
    }    
    public double Potong(){
        return this.potongan;
    }    
    public double Gator(){
        return this.total;
    }   
    public double Gaber(){
        return this.gaber;
    }
}