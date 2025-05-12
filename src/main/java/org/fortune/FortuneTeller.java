package org.fortune;

public class FortuneTeller {
    private static final String[] fortunes = {
            "You will find great success.",
            "Beware of unexpected challenges.",
            "A new opportunity is coming your way.",
            "Expect good news soon.",
            "Someone close to you will surprise you."
    };

    public String tellFortune() {
        int index = (int) (Math.random() * fortunes.length);
        return fortunes[index];
    }

    public static void main(String[] args) {
        FortuneTeller teller = new FortuneTeller();
        System.out.println("Your fortune: " + teller.tellFortune());
    }
}