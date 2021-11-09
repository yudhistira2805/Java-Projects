/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ArrayProcessing {
    
    int[] dataBil = new int[100];
    
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data (n) : ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+" : ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    double cariMin(int[] data){
        int i;
        int min = dataBil[0];
        for(i=1; i<n; i++)
            if(dataBil[i] < min)
                min = dataBil[i];        
        return min;
    }
    
    double cariMax(int[] data){
        int i;
        int max = dataBil[0];
        for(i=1; i<n; i++)
            if(dataBil[i] > max)
                max = dataBil[i];        
        return max;
    }
    
    int[] urutkan(int[] data) { 
         for(int i=0; i < n; i++)  
            for(int j=1; j < (n-i); j++)  
                if(dataBil[j-1] > dataBil[j]){  
                    int temp = dataBil[j-1];  
                    dataBil[j-1] = dataBil[j];  
                    dataBil[j] = temp;  
                }
         return dataBil;
    }
    
    void output(){
        System.out.println("Rerata dari data diatas adalah    : " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai Max dari data diatas adalah : " + this.cariMax(this.dataBil));
        System.out.println("Nilai Min dari data diatas adalah : " + this.cariMin(this.dataBil));
        System.out.print("Array setelah sorting             : ");
        int[] sortBil = this.urutkan(this.dataBil);
        for(int i=0; i<n; i++){
            System.out.print(sortBil[i]+", ");
        }
    }
}
