package com.example.blackjack.domain;

abstract class Gamer {
    protected Hand hand;
    protected Boolean isPlaying;
    protected String name;
    protected Boolean isBlackJack = false;

    public Gamer() {
        super();
    }

    abstract void init();

    void addCard(Card card){
        hand.getCard(card);
        if (hand.isBlackJack())
            isBlackJack = true;
    }

    public void pass(){
        isPlaying = false;
    }

    abstract Boolean wantCard();

    public Boolean getIsPlaying(){
        return isPlaying;
    }

    public void setIsPlaying(Boolean playing) {
        isPlaying = playing;
    }

    public Boolean getIsBlackJack() { return isBlackJack; }
}
