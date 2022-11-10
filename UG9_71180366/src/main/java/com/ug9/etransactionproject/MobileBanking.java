package com.ug9.etransactionproject;

import com.ug9.eTransactionProject.DigitalPayment;

public abstract class MobileBanking extends DigitalPayment{
    private boolean checkfee;
    private long feeAntarBank;
    private String noRekening;

    public MobileWallet(String nama, long saldo, String noRekening){
        this.getNama() = nama;
        this.getSaldo() = saldo;
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (getSaldo() < 0){
            System.out.printf("Input tidak valid");
        }else if (nominal > getSaldo()){
            System.out.printf("Gagal Melakukan Trnsfer, Saldo anda tidak cukup");
        } else if (getSaldo() > nominal){
            getSaldo() =- nominal;
            printBuktiTransfer(dp,nominal);
        }
    }

    public boolean isCheckFee(){

    }

    public void setCheckfee(boolean checkfee) {
        this.checkfee = checkfee;
    }

}
