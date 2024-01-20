package com.example.pokegen;

public class catUtilitaire {
    //mettre en majuscule le nom du pokémon qd même
    public static String capitalize(String phrase){
        return phrase.toUpperCase().charAt(0) + phrase.substring(1);
    }
}
