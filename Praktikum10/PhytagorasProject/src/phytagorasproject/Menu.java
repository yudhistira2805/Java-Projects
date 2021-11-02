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
public class Menu {
    int menu;
    char next;
    void Option(){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1. Cek Triple Phytagoras");
            System.out.println("2. Menentukan sisi miring segitiga");
            System.out.println("3. Menentukan sisi siku-siku segitiga");
            System.out.println("4. Exit\n");
            System.out.println("Masuk menu : ");
            menu = input.nextInt();
            input.nextLine();
            switch(menu){
                case 1:
                    System.out.println("\nMengecek Triple Phytagoras");
                    Phytagoras p = new Phytagoras();
                    break;
                case 2:
                    System.out.println("\nMencari sisi miring");
                    Miring m = new Miring();
                    break;
                case 3:
                    System.out.println("\nMencari sisi siku-siku");
                    SikuSiku s = new SikuSiku();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("\nMenu anda salah, coba lagi ? (y/n)");
                    next = input.nextLine().charAt(0);
            }        
        }while(next != 'n');
    }
}
