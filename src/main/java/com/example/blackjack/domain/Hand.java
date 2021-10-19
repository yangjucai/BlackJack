package com.example.blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;
    private int totalValue;

    public Boolean full(){
        return cards.size()>5;
    }
    public Hand() {
        cards = new ArrayList<>();
        totalValue = 0;
    }

    public void getCard(Card card) {
        if (cards.size() == 0) card.setVisibility(false);
        cards.add(card);
    }


    public int Calculate() {
        int aceCount = 0;
        totalValue = 0;
        for (Card card : cards) {
            if (card.isAce())
                aceCount++;
            totalValue += card.getValue();
        }
        while (totalValue > 21 && aceCount > 0) {
            totalValue -= 10;
            aceCount--;
        }
        if (totalValue > 21) totalValue = -1;
        return totalValue;
    }

    public Boolean isBlackJack() {
        if (cards.size() == 2 && Calculate() == 21) return true;
        return false;
    }

    /**
     * 判断手牌的点数是否超过17点
     */
    public Boolean over17() {
        return Calculate() > 17 && Calculate() < 21;
    }


    /**
     * 判断手牌的点数是否超过21点
     */
    public Boolean boom() {
        return Calculate() == -1;
    }
}
