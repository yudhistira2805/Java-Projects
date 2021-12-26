/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkaryawan;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class CekData {
    
    Scanner input = new Scanner(System.in);
    
    protected boolean dataCek(String action){
        boolean a = true;
        boolean b = true;
        while(b == true){
            System.out.println("Pilih SubMenu:");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. "+action+" Data Kembali");
            System.out.print("\nMenu pilihan: ");
            String menu = input.nextLine();
            if(menu.equals("1")){
                b = false;
                a = false;
            }else if(menu.equals("2")){
                b = false;
                a = true;
            }else{
                System.out.println("\nInput Menu Salah!\n");
                b = true;
            }
        }
        return a;
    }
    
    protected void stCek(){
        boolean a = true;
        while(a == true){
            System.out.println("\nPilih SubMenu:");
            System.out.println("1. Kembali ke menu utama");
            System.out.print("\nMenu pilihan: ");
            String menu = input.nextLine();
            if(menu.equals("1")){
                a = false;
            }else{
                System.out.println("\nInput Menu Salah!");
                a = true;
            }
        }
    }
    
    protected boolean tglCek(String tl){
        try{
            Period.between(LocalDate.parse(tl), LocalDate.now()).getYears();
            return false;
        }catch(Exception e){
            System.out.println("Input Tanggal Salah!");
            return true;
        }  
    }
    
    protected boolean golCek(String gol){
        if(gol.equals("A")){
            return false;
        }else if(gol.equals("B")){
            return false;
        }else if(gol.equals("C")){
            return false;
        }else{
            System.out.println("Input Data Salah! (Masukkan A/B/C)");
            return true;
        }
    }
    
    protected boolean nikahCek(int nikah){
        if(nikah == 1){
            return false;
        }else if(nikah == 0){
            return false;
        }else{
            System.out.println("Input Data Salah! (Masukkan 0/1)");
            return true;
        }
    }
}