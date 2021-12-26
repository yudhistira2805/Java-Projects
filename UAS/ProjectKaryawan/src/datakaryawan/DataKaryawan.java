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
public class DataKaryawan {
    
    public String id;
    private int nikah, anak, usia;
    private String nama, alamat, gol, stnikah;
    
    Gaji g;

    public DataKaryawan(String id, String nama, String alamat, String gol,int usia, int nikah, int anak) {
        this.id = id;
        this.anak = anak;
        this.usia = usia;
        this.nama = nama;
        this.alamat = alamat;
        this.gol = gol;
        this.nikah = nikah;
        
        g = new Gaji(gol);
        if(this.nikah == 1){
            this.stnikah = "Sudah Menikah";
        }else{
            this.stnikah = "Belum Menikah";
        }
    }
    
    public void cetakData(){
        if(this.nikah == 1){
            stnikah = "Sudah Menikah";
        }else{
            stnikah = "Belum Menikah";
        }
        System.out.println(this.id+"         "+this.nama+"       "+this.gol+"     "+this.usia+"     "+this.stnikah+"              "+this.anak);
    }
    
    public void infoKaryawan(){
        g.totalGaji(this.anak, this.usia, this.nikah);
        System.out.println();
        System.out.println("\n===============================================");
        System.out.println("             DATA PROFILE KARYAWAN            ");
        System.out.println("-----------------------------------------------");
        System.out.println("ID Karyawan         : "+this.id);
        System.out.println("Nama Karyawan       : "+this.nama);
        System.out.println("Golongan            : "+this.gol);
        System.out.println("Usia                : "+this.usia);
        System.out.println("Status Menikah      : "+this.stnikah+"\n");
        System.out.println("Jumlah Anak         : "+this.anak);
        System.out.println("-----------------------------------------------");
        System.out.println("Gaji Pokok          : Rp."+this.g.Gapok());
        System.out.println("Tunjangan Nikah     : Rp."+this.g.tNikah());
        System.out.println("Tunjangan Pegawai   : Rp."+this.g.tKar());
        System.out.println("Tunjangan Anak      : Rp."+this.g.tAnak());
        System.out.println("----------------------------------------------- (+)");
        System.out.println("Gaji Kotor          : Rp."+this.g.Gator());
        System.out.println("Potongan            : Rp."+this.g.Potong());
        System.out.println("----------------------------------------------- (-)");
        System.out.println("Gaji Bersih         : Rp."+this.g.Gaber()+"\n");
    }
}