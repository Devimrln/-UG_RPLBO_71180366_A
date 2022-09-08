public class TabunganKonvensional {
    private String pemilik;
    private double saldo=100000;

    public void getSaldo() {
        System.out.println("Saldo K_71180366: "+ saldo);
    }

    public void penarikan(double jumlahPenarikan){
        saldo = saldo - jumlahPenarikan;
        System.out.println("Penarikan Rp." + saldo);
    }
    public void penyetoran(double jumlahPenyetoran){
        saldo = saldo + jumlahPenyetoran;
        System.out.println("Penyetoran Rp." + saldo);
    }
}
