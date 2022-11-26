/**
 *
 * @author Amdzak
 */

package com.main.ganjilgenap;

public class GanjilGenap {
    public static void main(String[] args) {
        //TIPE DATA
        int hasil;
        
        for(int i=1;i<=10;i++){
            hasil = i % 2;
            if(hasil == 0){
                System.out.println(i + " => Genap");
            } else{
                System.out.println(i + " => Ganjil");
            }
        }
    }
}
