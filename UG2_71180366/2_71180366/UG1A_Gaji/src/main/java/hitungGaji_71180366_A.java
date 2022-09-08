import java.util.Scanner;

public class hitungGaji_71180366_A {
    public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Berapa Karyawan: ");
        int jmlLoop = inp.nextInt(); //jumlah karyawan yang ingin dicek gajinya

        System.out.println("Masukkan jumlah jam Kerja: ");
        int totJamKerja = inp.nextInt(); //total jam karyawan

        int gajiIdeal;
        int potongan;
        int tambahan;
        gajiIdeal = 300000;
        if (totJamKerja == 8){
            System.out.println("Total: Rp." + gajiIdeal);
        } else if (totJamKerja < 8) {
            potongan = 8 - totJamKerja;
            System.out.println("Less hours: "+ potongan);
            System.out.println("Potongan: " + (potongan * 15000));
            System.out.println("Total: Rp." + (gajiIdeal - potongan * 15000));
        } else if (totJamKerja > 8) {
            tambahan = totJamKerja - 8;
            System.out.println("Extra hours: "+ tambahan);
            System.out.println("Tambahan: " + (tambahan * 15000));
            System.out.println("Total: Rp." + (gajiIdeal + tambahan * 15000));
        } else {
            System.out.println("tidak ada pilihan");
        }
    }
}
