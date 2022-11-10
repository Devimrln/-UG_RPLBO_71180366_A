package com.ug9.etransactionproject;

import com.ug9.eTransactionProject.DigitalPayment;

public class Dana extends MobileWallet{
    public Dana(String nama, long saldo, String noHp){
        this.getNama() = nama;
        this.getSaldo() = saldo;
        this.getNoHp() = noHp;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.transfer(dp, nominal);
    }
}
