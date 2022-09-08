public class TabunganBerjangka {
    private String pemilikl;
    private double saldo=200000;

    public void getSaldo(){
        System.out.println("Saldo I_71180366: " +saldo);
    }

    public void penarikan(double jumlahPenarikan){
        System.out.println("Belum jatuh tempo");
    }
    public void penyetoran(double jumlahPenyetoran){
        saldo = saldo + jumlahPenyetoran;
        System.out.println("Penyetoran Rp." + saldo);
    }
}
