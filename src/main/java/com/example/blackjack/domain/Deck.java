package com.example.blackjack.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    private int cardCount;

    public Deck() {
        cards = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card("黑桃", i));
            cards.add(new Card("红桃", i));
            cards.add(new Card("方块", i));
            cards.add(new Card("梅花", i));
        }
        cardCount = cards.size();

    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card remove() {
        //get one card from cards
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }
}
