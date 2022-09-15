package com.ug3.soal1;

import java.util.*;

public class UG3soal1 {
    public static void main(String[] args){
        String namaMakanan;
        String  tanggal;
        int jumlah;
        int berat;
        Scanner scan = new Scanner(System.in);
        System.out.println("===========DATA PRODUCT============");
        System.out.println("Masukkan Data Product Makanan Anda");
        System.out.println("Nama Makanan: ");
        namaMakanan = scan.nextLine();
        System.out.println("Tanggal Kadaluarsa: ");
        tanggal = scan.nextLine();
        System.out.println("Jumlah (quantity) : ");
        jumlah = scan.nextInt();
        System.out.println("Berat (gram): ");
        berat = scan.nextInt();

        System.out.println("============Data Product===========");
        System.out.println("Nama makanan = "+ namaMakanan);
        System.out.println("Tanggal kadaluarsa = " + tanggal);
        System.out.println("Jumlah(quantity) = " + jumlah);
        System.out.println("Berat = " + berat + " gram");
        System.out.println("===================================");


    }
}
