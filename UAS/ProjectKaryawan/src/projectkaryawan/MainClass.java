/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkaryawan;

import datakaryawan.DataKaryawan;
import datakaryawan.Gaji;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class MainClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OlahData o = new OlahData();
        TambahData t = new TambahData();
        CekData c = new CekData();
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        
        //Dummy
        //a.tambah(new DataPegawai("K0120053", "Paijo Telo", "Joglo","A", 20, 0, 0));
        //a.tambah(new DataPegawai("K0259011", "Ipan Setiawan", "Gilingan","B", 34, 1, 2));
        //a.tambah(new DataPegawai("K0391558", "Joko Setiono", "Malang","C", 31, 1, 1));
        
        while(loop == true){   
            System.out.println("====================================== Main Menu ======================================");
            System.out.println("1. Tambah Data Karyawan");
            System.out.println("2. Hapus  Data Karyawan");
            System.out.println("3. Cari   Data Karyawan");
            System.out.println("4. Lihat  Data Karyawan");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Menu pilihan : ");
            String m = input.nextLine();
            switch(m){
                case "1" :                   
                    boolean a = true;
                    while(a == true){
                        o.insert(t.action());
                        System.out.println("\nData Berhasil Ditambahkan!\n");
                        a = c.dataCek("Tambah");
                    }
                    loop = true;
                    break;
                    
                case "2":
                    boolean a1 = true;
                    while(a1 == true){
                        System.out.println("\n=================== Hapus Data Karyawan ================");
                        System.out.print("Masukkan ID Karyawan : ");
                        String i = input.nextLine();
                        o.delete(i);
                        System.out.println();
                        a1 = c.dataCek("Hapus");
                    }
                    break;
                    
                case "3":
                    boolean a2 = true;
                    while(a2 == true){
                        System.out.println("\n=================== Cari Data Karyawan ==================");
                        System.out.print("Masukkan ID Karyawan : ");
                        String h = input.nextLine();
                        o.search(h);
                        a2 = c.dataCek("\nCari");
                    }
                    break;
                    
                case "4":
                    o.tampil();
                    c.stCek();
                    break;
                    
                case "5":
                    System.out.print("Comeback Any Time :)\n");
                    System.exit(0);
                    break;
                    
                default :
                    loop = true;
                    break;
            }            
        }        
    }
}