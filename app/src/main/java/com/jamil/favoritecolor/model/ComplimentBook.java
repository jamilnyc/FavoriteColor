package com.jamil.favoritecolor.model;

import java.util.Random;

public class ComplimentBook {
    private String[] mCompliments = {
        "You're beautiful.",
        "You're amazing.",
        "Your smile lights up the room.",
        "That's my favorite color, too! Great minds think alike.",
        "You're spectacular.",
        "I think you're fantastic.",
        "You're the coolest person I know. And I know a lot of people.",
        "You're super smart!",
        "You can do anything.",
        "Nothing can stop you."
    };

    public String getRandomCompliment()
    {
        Random rand = new Random();
        int n = rand.nextInt(mCompliments.length);
        return mCompliments[n];
    }
}
