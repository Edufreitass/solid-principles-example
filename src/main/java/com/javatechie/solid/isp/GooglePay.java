package com.javatechie.solid.isp;

public class GooglePay implements UPIPayments, CashBackManager {

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        // these features are there in Google Pay
    }
}
