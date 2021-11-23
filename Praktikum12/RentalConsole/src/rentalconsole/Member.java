/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

/**
 *
 * @author asus
 */
public class Member {
    
    String Nama;
    String ID;
    public String Jenis;
    
    public Member(String id, String nama, String jenis) {
        this.ID = id;
        this.Nama = nama;
        this.Jenis = jenis;
    }
    
    void output(){
        System.out.println("ID Member                     : " + this.ID);
        System.out.println("Nama Member                   : " + this.Nama);
        System.out.println("Jenis Member                  : " + this.Jenis + "\n");
    }
}