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
public class Phytagoras {
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    int c;
    public Phytagoras(){
        System.out.println("Masukkan bilangan A : ");
        a = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan bilangan B : ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan bilangan C : ");
        c = input.nextInt();
        input.nextLine();
        
        if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
            System.out.println("Bilangan diatas merupakan Triple Phytagoras\n");
        } else{
            System.out.println("Bilangan diatas bukan merupakan Triple Phytagoras\n");
        }
    }
}
