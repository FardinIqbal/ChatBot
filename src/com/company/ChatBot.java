package com.company;

public class ChatBot {
    private final String name;

    String[] keyword = {"birth", "weather", "food", "hobby", "age", "gender", "family", "culture", "friend", "movie"};
    String[] nice = {"love", "hug", "happy", "believe", "awesome", "amazing", "cool"};
    String[] mean = {"loser", "dumb", "hate", "suck", "die", "kill", "murder", "midget", "nazi", "depressed"};


    public ChatBot (String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public boolean containsMeanWords(String str) {
        // Returns true if str contains a "mean" word

    }

    public boolean containsNiceWords(String str) {
        // Returns true if str contains a "nice" word
    }

    public String getUserResponse() {
        // Asks the user for a question or response and returns user's input

    }

    public int randomInt(int min, int max){
        // returns a random integer from min to max
    }

    public String greet() {
        // Returns a random string from the three pre-made greetings
    }
}