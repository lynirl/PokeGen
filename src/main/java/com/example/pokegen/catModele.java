package com.example.pokegen;

import com.github.oscar0812.pokeapi.models.pokemon.Pokemon;
import com.github.oscar0812.pokeapi.utils.Client;

import static java.lang.Math.round;

//gère les fonctions pures
public class catModele {

    //générer un pokémon
    public static String pokeGen(String nom){
        //fair rules du site
        Client.CACHE = true;

        //on hash le nom et on le divise pour avoir ses 3 derniers chiffres
        //déso pas déso les Pokémons à partir de 1000
        //TODO: (faire en sorte qu'il y ait un failsafe pour avoir les pokémons au dessus quand même)
        int pokeId = Math.abs(nom.hashCode() % 1000);

        //DEBUG: voir si l'id est valide
        System.out.println(pokeId);

        //on récupère le pokémon correspondant à cet int et on le capitalize
        String pokeResult = catUtilitaire.capitalize(Pokemon.getById(pokeId).getName());

        //DEBUG
        System.out.println(pokeResult);

        //résultat
        return pokeResult;
    }
}
