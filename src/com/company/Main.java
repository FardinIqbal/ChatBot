package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ChatBot x = new ChatBot("Bob");
        System.out.println(x.greet());
        System.out.println();
        String response = x.getUserResponse();;
        x.containsNiceWords(response);
        x.containsMeanWords(response);

        switch (x.containsKeyWords(reponse)) {
            case ""
        }


    }
}