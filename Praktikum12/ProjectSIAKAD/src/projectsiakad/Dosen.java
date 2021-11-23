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
public class Dosen extends Pegawai {
    
    //atribut tambahan Dosen
    String nidn;
    
    //constructor
    Dosen(String id, String nama, int gol, LocalDate tgllhr, String nidn){
        super(id, nama, gol, tgllhr);
        this.nidn = nidn;
    }
    
    //hitung tunjangan pegawai dosen
    long hitungTunjPegawai(){
        long tunjPegawai = 1500000;
        return tunjPegawai;
    }
    
    //hitung tunjagan fungsional dosen
    long hitungTunjFungsional(){
        long tunjFungsional;
        if(this.hitungUsia() < 40){
            tunjFungsional = 1700000;
        } else {
            tunjFungsional = 2000000;
        }
        return tunjFungsional;
    }
    
    //hitung total gaji
    long hitungTotalGaji(){
        long total = this.hitungGapok() + this.hitungTunjPegawai() + this.hitungTunjFungsional();
        return total;
    }
    
    //cetak data pegawai, rincian gaji, total gaji
    void printPegawai(){
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.tglLahir);
        System.out.println("NIDN         : " + this.nidn);
        System.out.println("Usia         : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok   : Rp." + this.hitungGapok() + ",-");
        System.out.println("Tunj Pegawai : Rp." + this.hitungTunjPegawai() + ",-");
        System.out.println("Tunj Fungsi  : Rp." + this.hitungTunjFungsional() + ",-");
        System.out.println("Total Gaji   : Rp." + this.hitungTotalGaji() + ",-\n");
    }
}
    
