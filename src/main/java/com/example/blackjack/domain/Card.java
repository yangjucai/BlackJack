package com.example.blackjack.domain;

public class Card {
    private String suit;
    private int value;
    private String face;
    private Boolean visibility=true;

    public Card(String suit, int face) {
        this.suit = suit;
        this.face = convert(face);
        if (face == 1) this.value = 11;
        else if (face >= 10) this.value = 10;
        else
            this.value = face;

    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public Boolean getVisibility() {
        return visibility;
    }

    public int getValue() {
        return value;
    }

    public Boolean isAce() {
        return face == "A";
    }

    private String convert(int number) {
        String result;
        switch (number) {
            case 1:
                result = "A";
                break;
            case 11:
                result = "J";
                break;
            case 12:
                result = "Q";
                break;
            case 13:
                result = "K";
                break;
            default:
                result = String.valueOf(number);
        }
        return result;
    }

    @Override
    public String toString() {
        return suit + face + "";
    }
}
