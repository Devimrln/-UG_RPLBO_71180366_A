package com.ug9.etransactionproject;

import com.ug9.eTransactionProject.DigitalPayment;

public class BRImo extends MobileBanking{
    public BRImo(String nama, long saldo, String noRekening){
        this.getNama() = nama;
        this.getSaldo() = saldo;
        this.getNoRekening() = noRekening;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.transfer(dp, nominal);
    }
}
