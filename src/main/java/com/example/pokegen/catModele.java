package com.example.pokegen;

import com.github.oscar0812.pokeapi.models.pokemon.Pokemon;
import com.github.oscar0812.pokeapi.utils.Client;

import static java.lang.Math.round;

//gère les fonctions pures
public class catModele {

    //générer un pokémon
    public static String pokeGen(){
        Client.CACHE = false;

        //on génère un int, intervalle pour tous les pokémon existants
        long pokeId = round(Math.random()*1025);

        //on récupère le pokémon correspondant à cet int et on le capitalize
        String pokeResult = catUtilitaire.capitalize(Pokemon.getById((int) pokeId).getName());

        //debug
        System.out.println(pokeResult);

        //résultat
        return pokeResult;
    }
}
