/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Randomizer {
    int tebak;
    char lagi;
    Scanner input = new Scanner(System.in);
        void tebakan(){
            do{
                Random r = new Random();
                int random = r.nextInt((100-0)+1)+0;
                    do{
                        System.out.print("Masukkan Tebakan Anda : ");
                        tebak = input.nextInt();
                        input.nextLine();
                        if(tebak > random){
                            System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                        } else if(tebak < random){
                            System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
                        } else{
                            System.out.println("LAH KOK ISOO!! Anda Benar!!");
                            System.out.print("Mau bermain lagi ? (y/n) : ");
                            lagi = input.nextLine().charAt(0);
                            System.out.println("--------------------------------------------");
                        }
                    }while (tebak != random);
            }while (lagi != 'n'); 
    }   
}