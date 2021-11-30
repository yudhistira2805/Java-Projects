/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author asus
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran l1 = new Lingkaran ();
        l1.setJari(-10);
        l1.hitungLuas();
        System.out.println("Luas lingkarang dengan jari-jari " + l1.getJari() + "adalah " + l1.getLuas());
    }
    
}
