/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author asus
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi o = new Operasi();
        
        System.out.println(o.jumlahkan(3, 4));
        System.out.println(o.jumlahkan(4, 7, -9));
        System.out.println(o.jumlahkan(3.4, -0.0002, 0.12313));
        System.out.println(o.kalikan(4, 5, 6));
        System.out.println(o.kalikan(8.5, 9.9));
        System.out.println(o.kalikan(4.4, 7, 6));
    }    
}