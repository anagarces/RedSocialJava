package com.campusdual.redsocial;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.InputStream;

public class MP3Player {

    public static void play(String resourcePath) {
        try {
            InputStream inputStream = MP3Player.class.getClassLoader().getResourceAsStream(resourcePath);
            if (inputStream == null) {
                throw new IllegalArgumentException("Archivo no encontrado: " + resourcePath);
            }
            Player player = new Player(inputStream);
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}