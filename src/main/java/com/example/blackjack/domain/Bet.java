package com.example.blackjack.domain;

public class Bet {
    private double amount;
    private double rate;

    public Bet(double amount) {
        this.amount = amount;
        rate = 1;
    }

    public void doubleRate() {
        rate *= 2;
    }

    public double getTotal() { return amount*rate; }
}
