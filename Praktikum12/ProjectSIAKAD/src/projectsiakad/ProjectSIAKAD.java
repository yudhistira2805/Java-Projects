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
public class ProjectSIAKAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //contoh objek data pegawai
        Pegawai p1 = new Pegawai("P01", "Arya Yudhistira", 2, LocalDate.of(1979, 9, 1));
        p1.printPegawai();
        
        //contoh objek data pegawai dosen
        Pegawai p2 = new Dosen("P02", "Halim Prasetia", 1, LocalDate.of(1979, 9, 17), "8888");
        p2.printPegawai();
        
        //contoh objek data pegawai nondosen
        Pegawai p3 = new NonDosen("P03", "Zainuri Septian", 1, LocalDate.of(2008, 1, 25));
        p3.printPegawai();
    }
    
}
