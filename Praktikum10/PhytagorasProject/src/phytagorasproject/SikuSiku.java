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
public class SikuSiku {
    Scanner input = new Scanner(System.in);
    int a;
    int c;
    double b;
    public SikuSiku(){
        System.out.println("Masukkan bilangan A : ");
        a = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan bilangan C : ");
        c = input.nextInt();
        input.nextLine();
        
        b = Math.sqrt(Math.pow(c,2)-Math.pow(a,2));
        System.out.println("Sisi siku-siku dari segitiga adalah : " + b + "\n");
    }
}
