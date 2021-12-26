/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkaryawan;

import datakaryawan.DataKaryawan;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TambahData extends CekData{
    
    Scanner input = new Scanner(System.in);
    
    public DataKaryawan action(){
        OlahData a = new OlahData();
        System.out.println();
        System.out.println("========================= Tambah Data Karyawan ==============================");
        System.out.print("Masukkan ID Karyawan                          : ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama Karyawan                        : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Alamat                               : ");
        String alamat = input.nextLine();
        
        boolean valt = true;
        String tl = "0";
        while(valt == true){
            System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD)           : ");
            tl = input.nextLine();
            valt = super.tglCek(tl);
        }
        int umur = Period.between(LocalDate.parse(tl), LocalDate.now()).getYears();
        
        boolean valg = true;
        String gol = "";
        while(valg == true){
            System.out.print("Masukkan Golongan (A/B/C)                     : ");
            gol = input.nextLine().toUpperCase();
            valg = super.golCek(gol);
        }
        
        boolean valn = true;
        int nikah = 0;
        while(valn == true){
            System.out.print("Masukkan Status Menikah (0:Belum, 1:Sudah)    : ");
            nikah = input.nextInt();
            input.nextLine();
            valn = super.nikahCek(nikah);
        }
        
        int anak;
        if(nikah == 1){
            System.out.print("Masukkan Jummlah Anak                         : ");
            anak = input.nextInt();
            input.nextLine();
        }else{
            anak = 0;
        }
        DataKaryawan x = new DataKaryawan(id, nama, alamat,gol, umur, nikah, anak);
        return x;
    }
}