package com.ug9.etransactionproject;

import com.ug9.eTransactionProject.DigitalPayment;

public abstract class MobileWallet extends com.ug9.eTransactionProject.DigitalPayment {
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp){
        this.getNama() = nama;
        this.getSaldo() = saldo;
        this.noHp = noHp;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp() {
        return noHp;
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
}
