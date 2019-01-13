package util;

import com.google.gson.Gson;


import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import model.Pokemon;

public class PokemonLoader {
    private static final org.tensorflow.demo.env.Logger logger = new org.tensorflow.demo.env.Logger();

    public static HashMap<String, Pokemon> loadPokemonMap (String listAsString){
        Gson gson = new Gson();
        HashMap<String,Pokemon> pokemonMap = new HashMap<>();
        Pokemon[] pokemonArray =gson.fromJson(listAsString,Pokemon[].class);

        for (Pokemon pokemon: pokemonArray){
            pokemonMap.put(pokemon.getName(),pokemon);
            logger.d(pokemon.getName()+ " captured!!");

        }
       return pokemonMap;
    }
}
