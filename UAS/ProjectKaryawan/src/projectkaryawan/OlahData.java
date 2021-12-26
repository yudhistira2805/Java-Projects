/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkaryawan;

import datakaryawan.DataKaryawan;
import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class OlahData {
    private ArrayList<DataKaryawan> dataKar = new ArrayList<DataKaryawan>();
    
    protected void insert(DataKaryawan data){
        this.dataKar.add(data);
    }
    
    protected void delete(String id){
        this.dataKar.removeIf(item -> item.id.equals(id));
    }
    
    protected void search(String id){
        boolean found = false;
        int index = 0;
        for(int i=0; i<this.dataKar.size(); i++){
            if (this.dataKar.get(i).id.equals(id)){
                index = i;
                found = true;
            }
        }
        
        if (found == true){
            System.out.println();
            this.dataKar.get(index).infoKaryawan();
        } else {
            System.out.println("\n404 Not Found\n");
            System.exit(0);
        }
    }
    
    protected void tampil(){
        System.out.println("=====================================================================================");
        System.out.println("                                    DATA KARYAWAN                                    ");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(" ID KARY	  NAMA KARY	  GOL	  USIA	   STATUS NIKAH		  JUMLAH ANAK    ");
        System.out.println("-------------------------------------------------------------------------------------");
        for(DataKaryawan item: this.dataKar){
            item.cetakData();
        }
    }
}