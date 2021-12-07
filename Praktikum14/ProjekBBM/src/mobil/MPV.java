/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author asus
 */
public class MPV extends Mobil{
    public double range;
    public double speed;
    
    public double hitungBBM() {
        return this.range * 1 / 14;
    }
    public double hitungWaktu() {
        return this.range / this.speed;
    }
}
