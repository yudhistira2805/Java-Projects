/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author asus
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Luas dan Keliling Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Persegi Panjang 1");
        System.out.println("Luasnya : "+pp.hitungLuas(10,5));
        System.out.println("Kelilingnya :"+pp.hitungKel(10,5)+"\n");
        
        System.out.println("Persegi Panjang 2");
        System.out.println("Luasnya : "+pp.hitungLuas(3.6,8));
        System.out.println("Kelilingnya :"+pp.hitungKel(3.6,8)+"\n");
        
        System.out.println("Persegi Panjang 3");
        System.out.println("Luasnya : "+pp.hitungLuas(6,8.3));
        System.out.println("Kelilingnya :"+pp.hitungKel(6,8.3)+"\n");
    
        System.out.println("Persegi Panjang 4");
        System.out.println("Luasnya : "+pp.hitungLuas(5.6,8.8));
        System.out.println("Kelilingnya :"+pp.hitungKel(5.6,8.8)+"\n");
        
        //Luas dan Keliling Persegi
        Persegi p = new Persegi();
        System.out.println("Persegi 1");
        System.out.println("Luasnya : "+p.hitungLuas(4.5));
        System.out.println("Kelilingnya : "+p.hitungKel(4.5)+"\n");
        
        System.out.println("Persegi 2");
        System.out.println("Luasnya : "+p.hitungLuas(7));
        System.out.println("Kelilingnya : "+p.hitungKel(7)+"\n");
        
        //Luas dan Keliling Segitiga
        Segitiga sg = new Segitiga();
        System.out.println("Segitiga 1");
        System.out.println("Luasnya : "+sg.hitungLuas(8, 10));
        System.out.println("Kelilingnya "+sg.hitungKel(8, 10)+"\n");
        
        System.out.println("Segitiga 2");
        System.out.println("Luasnya : "+sg.hitungLuas(8, 11.5));
        System.out.println("Kelilingnya "+sg.hitungKel(8, 11.5)+"\n");
        
        System.out.println("Segitiga 3");
        System.out.println("Luasnya : "+sg.hitungLuas(12.2, 9));
        System.out.println("Kelilingnya "+sg.hitungKel(12.2, 9)+"\n");
        
        System.out.println("Segitiga 4");
        System.out.println("Luasnya : "+sg.hitungLuas(13.9, 20.7));
        System.out.println("Kelilingnya "+sg.hitungKel(13.9, 20.7)+"\n");
        
        //Luas dan Keliling Lingkaran
        Lingkaran L = new Lingkaran();
        System.out.println("Lingkaran 1");
        System.out.println("Luasnya : "+L.hitungLuas(5));
        System.out.println("Kelilingnya : "+L.hitungKel(5)+"\n");
        
        System.out.println("Lingkaran 2");
        System.out.println("Luasnya : "+L.hitungLuas(7.4));
        System.out.println("Kelilingnya : "+L.hitungKel(7.4)+"\n");              
    }    
}
