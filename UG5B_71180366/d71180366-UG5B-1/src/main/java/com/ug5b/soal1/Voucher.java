package com.ug5b.soal1;

public class Voucher {
    private String kode;
    private long nominal;

    public String getKode() {
        return kode;
    }

    public void setNominal(long nominal) {
        this.nominal = nominal;
    }

    public void buatVoucher(){
        if(this.nominal <= 0){
            this.kode = "VC";
        }else{
            this.kode = "VC"+nominal;
        }
    }
}
