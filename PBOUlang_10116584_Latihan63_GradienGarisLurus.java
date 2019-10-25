/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan63_gradiengarislurus;

/**
 *
 * @author 
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan63_GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat x = new Koordinat(2, 10, 5, 7);
        Koordinat y = new Koordinat(5, 1, 3, 12);
        
        
        
        System.out.println("Garis yang Melalui titik ("+x.getX1()+","+x.getY1()
        +") dan ("+x.getX2()+","+x.getY2()+")");
        System.out.println("Memiliki gradien sebesar "+x.hitungGradien());
        System.out.println("Garis yang Melalui titik ("+y.getX1()+","+y.getY1()
        +") dan ("+y.getX2()+","+y.getY2()+")");
        System.out.println("Memiliki gradien sebesar "+y.hitungGradien());
    }
    
}
