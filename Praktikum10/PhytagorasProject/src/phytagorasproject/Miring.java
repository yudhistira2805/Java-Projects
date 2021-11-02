/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phytagorasproject;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Miring {
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    double c;
    public Miring(){
        System.out.println("Masukkan bilangan A : ");
        a = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan bilangan B : ");
        b = input.nextInt();
        input.nextLine();
        
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Sisi miring dari segitiga adalah : " + c + "\n");
    }
}
