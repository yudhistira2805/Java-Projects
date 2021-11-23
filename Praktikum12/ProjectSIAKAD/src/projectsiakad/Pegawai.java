/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsiakad;
import java.time.*;

/**
 *
 * @author asus
 */
public class Pegawai {
    
    //atribut
    String idPegawai;
    String nama;
    int gol;
    LocalDate tglLahir;
    
    //constructor
    Pegawai(String id, String nama, int gol, LocalDate tgllhr) {
        this.idPegawai = id;
        this.nama = nama;
        this.gol = gol;
        this.tglLahir = tgllhr;
    }
    
    //method untuk menghitung usia pegawai
    int hitungUsia(){
        //hari ini
        LocalDate today = LocalDate.now();
        //selisih lahir dengan hari ini
        Period selisih = Period.between(this.tglLahir, today);
        return selisih.getYears();
    }
    
    //hitung gaji
    long hitungGapok(){
        long gapok = 0;
        if(this.gol == 1){
            if(this.hitungUsia() < 40 ){
                gapok = 3500000;
            } else {
                gapok = 4500000;
            }
        } else if(this.gol == 2){ 
            if(this.hitungUsia() < 40){
                gapok = 5000000;
            } else {
                gapok = 6000000;
            }
        }
        return gapok;
    }
    
    //cetak data pegawai dan gaji
    void printPegawai(){
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.tglLahir);
        System.out.println("Gaji Pokok   : Rp." + this.hitungGapok() + ",-\n");
    }
    
}
