package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ChatBot {
    private final String name;
    String[] keyWords = {"birth", "weather", "food", "hobby", "age", "gender", "family", "culture", "friend", "movie"};
    String[] niceWords = {"love", "hug", "happy", "believe", "awesome", "amazing", "cool"};
    String[] meanWords = {"loser", "dumb", "hate", "suck", "die", "kill", "murder", "midget", "nazi", "depressed"};
    String[] greetings = {"Hey, do you have anything you want to ask me?",
            "What's up. What do you want to chat about?", "Do you have any interesting questions for me?"};
    public ChatBot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Returns true if str contains a "mean" word
    public boolean containsMeanWords(String str) {
        // Creates an array of strings that contains all the words inside str
        String[] words = str.split(" ");
        for (String meanWord :
                meanWords) {
            if (Arrays.asList(words).contains(meanWord.toLowerCase())) {
                System.out.println("Hey, I think you should tone it down a little.");
                return true;
            }
        }
        return false;
    }

    // Returns true if str contains a "nice" word
    public boolean containsNiceWords(String str) {
        String[] words = str.split(" ");
        for (String niceWord :
                niceWords) {
            if (Arrays.asList(words).contains(niceWord.toLowerCase())) {
                System.out.println("Wow thanks. This is why I love talking to you.");
                return true;
            }
        }
        return false;
    }

    // Returns true if str contains a "key" word
    public boolean containsKeyWords(String str) {
        String[] words = str.split(" ");
        for (String keyWord :
                keyWords) {
            if (Arrays.asList(words).contains(keyWord)) {
                switch (keyWord){
                    case "movie":
                        System.out.println("My favorite movies is Whiplash!");
                        break;
                    case ""
                }
                return true;
            }
        }
        return false;
    }

    public boolean respondTo(String question) {
        return true;
    }

    // Asks the user for a question or response and returns user's input
    public String getUserResponse() {
        // this comment
        System.out.println("Enter a question for ChatBot: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine().toLowerCase();
    }

    public String

    public int randomInt(int min, int max) {
        // returns a random integer from min to max
        return (int) ((Math.random() * max) + min) - 1;
    }

    public String greet() {
        // Returns a random string from the three pre-made greetings
        return greetings[randomInt(1, 3)];
    }
}
