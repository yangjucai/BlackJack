package com.example.blackjack.domain;

public class Beauty {
    private Deck deck;

    public void setDeck() {
        deck = new Deck();
        deck.shuffle();
    }

    public void send(Gamer gamer) {

        Card card = deck.remove();
        gamer.addCard(card);
        if (gamer.name == "庄家" && card.getVisibility() == false)
            System.out.println("庄家获得第一张牌");
        else
            System.out.println(gamer.name + "获得了" + card);
    }
}
