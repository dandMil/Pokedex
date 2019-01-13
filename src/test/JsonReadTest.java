package test;
//import org.junit.Test;


import android.app.Activity;
import android.content.res.AssetManager;
import android.util.JsonReader;

import com.google.gson.Gson;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import model.Pokemon;


public class JsonReadTest {

   // private AssetManager assetManager = getAssets();
    String actualFilename = "src/test/pokemon-list.json";


    @Test
    public void test() throws IOException {
        String pokemonListString= JsonTesterKt.readFileAsTextUsingInputStream(actualFilename);
        Gson gson = new Gson();
        Pokemon[] pokemon = gson.fromJson(pokemonListString, Pokemon[].class);
        assert pokemon.length > 0;
    }



}
