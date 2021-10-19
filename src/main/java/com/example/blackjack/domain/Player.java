package com.example.blackjack.domain;

public class Player extends Gamer{
    private double money;
    private Bet bet;

    public Player(String name, double money) {
        super();
        this.name = name;
        this.money = money;
    }

    @Override
    public void init(){
        hand = new Hand();
        isPlaying = true;
        isBlackJack = false;
    }

    @Override
    Boolean wantCard() {
        if (hand.full() || hand.boom())
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public Bet getBet() {
        return bet;
    }

    public void setBet(double amount) { this.bet = new Bet(amount); }

    public void setMoney(double money) { this.money = money; }
}
