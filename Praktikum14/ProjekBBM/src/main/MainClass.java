/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import mobil.Sedan;
import mobil.SUV;
import mobil.MPV;
/**
 *
 * @author asus
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Mobil A (Sedan) |  Solo - Kudus (159 KM)   | 60 KM/H");
        Sedan A = new Sedan();
        A.range = 159;
        A.speed = 60;
        A.tampilHasil();
        
        System.out.println("Mobil B (Sedan) | Solo – Jakarta (537 KM)  | 65 KM/H");
        Sedan B = new Sedan();
        B.range = 537;
        B.speed = 65;
        B.tampilHasil();
        
        
        System.out.println("Mobil C (SUV) | Solo – Banten (662 KM)     | 57 KM/H");
        SUV C = new SUV();
        C.range = 662;
        C.speed = 57;
        C.tampilHasil();
        
        System.out.println("Mobil D (SUV) | Solo – Bandung (533 KM)    | 62 KM/H");
        SUV D = new SUV();
        D.range = 533;
        D.speed = 62;
        D.tampilHasil();
        
        System.out.println("Mobil E (MPV) | Solo – Banyuwangi (540 KM) | 64 KM/H");
        MPV E = new MPV();
        E.range = 540;
        E.speed = 64;
        E.tampilHasil();
        
        System.out.println("Mobil F (MPV) | Solo – Jember (432 KM)     | 53 KM/H");
        MPV F = new MPV();
        F.range = 432;
        F.speed = 53;
        F.tampilHasil();
    }
}
