/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author asus
 */
public class Membership {
    
    public Member membership;
    protected int poin;
    protected int hargaSewa;
    protected int totalSewa;
    protected LocalDate tglSewa;
    protected LocalDate tglKembali;
    protected int totalHari;
    
    ArrayList<Member> data = new ArrayList<Member>();
    
    public void addMember(Member data){
        this.data.add(data);
    }
    
    void searchMember(String ID){
        boolean finded = false;
        int index = -1;
        for(int i=0; i<this.data.size(); i++){
            if(this.data.get(i).ID.equals(ID)){
                index = i;
                finded = true;
            }
        }
        
        if(finded == true){
            this.membership = this.data.get(index);
        } else{
            System.out.println("Member Not Found 404 :(");
            System.exit(0);
        }
    }
    
    public Member inputMember(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member            : ");
        this.searchMember(input.nextLine());
        return this.membership;
    }
    
    void inputSewa(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Pinjam       : ");
        int tglSewa = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam         : ");
        int blnSewa = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam         : ");
        int thnSewa = input.nextInt();
        this.tglSewa = LocalDate.of(thnSewa, blnSewa, tglSewa);
        
        System.out.print("Masukkan Tanggal Kembali      : ");
        int tglKembali = input.nextInt();
        System.out.print("Masukkan Bulan Kembali        : ");
        int blnKembali = input.nextInt();
        System.out.print("Masukkan Tahun Kembali        : ");
        int thnKembali= input.nextInt();
        this.tglKembali = LocalDate.of(thnKembali, blnKembali, tglKembali);
        
        this.totalHari = (int) ChronoUnit.DAYS.between(this.tglSewa, this.tglKembali);
        System.out.println();
    }
    
    protected void output(){
        this.membership.output();
        System.out.println("Tanggal Sewa                  : " + this.tglSewa);
        System.out.println("Tanggal Sewa                  : " + this.tglKembali);
        System.out.println("Tanggal Sewa                  : " + this.totalHari + " hari\n");
    }
}
