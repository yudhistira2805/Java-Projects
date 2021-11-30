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
public class RentalConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Membership member = new Membership();
        member.addMember(new Member("M001", "Halem", "Silver"));
        member.addMember(new Member("M002", "Zai", "Gold"));
        member.addMember(new Member("M003", "Arya", "Platinum"));
        
        Member anggota = member.inputMember();
        switch(anggota.Jenis){
            
            case "Silver":
            Silver s = new Silver(anggota);
            s.hitungHarga();
            s.output();
            break;
            
            case "Gold":
            Gold g = new Gold(anggota);
            g.hitungHarga();
            g.output();
            break;
            
            case "Platinum":
            Platinum p = new Platinum(anggota);
            p.hitungHarga();
            p.output();
            break;
        }
    }
}
