import java.util.Scanner;

public class UG1A_Tabungan {
    public static void main(String [] args){
        TabunganKonvensional K_71180366 = new TabunganKonvensional();
        TabunganBerjangka I_71180366 = new TabunganBerjangka();

        System.out.println("Pilihan :");
        System.out.println("1. Penyetoran");
        System.out.println("2. Penarikan");
        System.out.println("3. Lihat Saldo");
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan Pilihan: ");
        int pilihan = inp.nextInt();
        if(pilihan == 1){
            System.out.println("---------Tabungan Konvensional------");
            K_71180366.penyetoran(200000);
            System.out.println("---------Tabungan Berjangka------");
            I_71180366.penyetoran(1000000);
        } else if (pilihan == 2) {
            System.out.println("-------Tabungan Konvensional--------");
            K_71180366.penarikan(50000);
            System.out.println("-------Tabungan Konvensional--------");
            I_71180366.penarikan(50000);
        } else if (pilihan == 3) {
            K_71180366.getSaldo();
            I_71180366.getSaldo();
        } else {
            System.out.println("Inputan tidak valid");
        }


    }
}
