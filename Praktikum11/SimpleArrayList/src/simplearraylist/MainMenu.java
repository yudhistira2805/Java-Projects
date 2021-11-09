/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class MainMenu {
    
    ArrayList<String> dataStr = new ArrayList<String>();
    
    void option(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Menu Data ArrayList : ");
            System.out.println("1. Tambah data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih nomer berapa  : ");
            
            int pilih = input.nextInt();
            switch(pilih){
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    print();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    
    void add(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data string : ");
        this.dataStr.add(input.nextLine());
        System.out.println("Daftar string dalam array list : " + this.dataStr);
        input.nextLine();
    }
    
    void delete(){
        Scanner input = new Scanner(System.in);
        System.out.print("String yang mau dihapus : ");
        String delete = input.nextLine();
        int index = this.dataStr.indexOf(delete);
        if(index>=0){
            this.dataStr.remove(index);
            System.out.println("String '" +delete +"' sudah dihapus di dalam data");
        } else{
            System.out.println("String '"+delete +"' tidak ada dalam data");
        }
        System.out.println("Daftar string dalam array list : "+ this.dataStr);
        input.nextLine();
    }
    
    void search(){
        Scanner input = new Scanner(System.in);
        System.out.print("String yang mau dicari : ");
        String search = input.nextLine();
        int index = this.dataStr.indexOf(search);
        if(index>=0){
            System.out.println("String '"+search +"' ada di index ke-"+ index+" di dalam data");
        }else{
            System.out.println("String '"+search +"' tidak ada dalam data"+this.dataStr);
        }
        input.nextLine();
    }
    
    void print(){
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar string dalam array list : " +this.dataStr);
        input.nextLine();
    }
}
