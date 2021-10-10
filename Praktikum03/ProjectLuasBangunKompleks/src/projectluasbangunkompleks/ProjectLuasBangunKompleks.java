/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author asus
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s = 42;
        int r = s/2;
        int r2 = 14;
        int r3 = 7; 
                
        //persegi1
        Persegi p = new Persegi();
        
        //lingkaran1
        Lingkaran l = new Lingkaran();
        
        //luas bangun kompleks
        double luas1 = p.hitungLuas(s) + (l.hitungLuas(r) * 2);
        double luas2 = (l.hitungLuasB(r2) / 2) - l.hitungLuasK(r3);
        System.out.println("Luas dari bangun project 1 adalah : " + luas1 + " cm persegi");
        System.out.println("Luas dari bangun project 2 adalah : " + luas2 + " cm persegi");
    }
    
}
