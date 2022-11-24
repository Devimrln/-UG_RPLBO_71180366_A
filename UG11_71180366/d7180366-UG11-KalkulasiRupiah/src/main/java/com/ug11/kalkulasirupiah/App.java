package com.ug11.kalkulasirupiah;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
//        String kalimat = "Ibu membeli minyak goreng seharga Rp22.500,00 dan margarin seharga Rp12.500,00 di supermarket");
        String kalimat;
        String harga;
        int total = 0;

        Scanner teks = new Scanner(System.in);
        System.out.println("Masukkan teks: ");
        kalimat = teks.nextLine();

        String[] kata = kalimat.split("\\s+");

        for (int i = 0; i < kata.length;i++){
            if (kata[i].contains("Rp")){
                harga = kata[i];
                total += harga;
            }
            System.out.println("total: "+total);
        }
//        for (String result : kata){
//            System.out.println("Text = "+result);
//        }






    }
}
