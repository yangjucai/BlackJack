package com.example.blackjack.domain;

public class Dealer extends Gamer {
    public Dealer() {
        super();
    }

    @Override
    public void init(){
        hand = new Hand();
        isPlaying = true;
        isBlackJack = false;
        name = "庄家";
    }

    @Override
    Boolean wantCard() {
        if (hand.full() || hand.boom())
            return false;
        if (hand.over17())
            return false;
        return true;
    }
}
