package org.My.Daemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private ClassicalMusic classicM;
    private RockMusic rockM;
    @Autowired
    public MusicPlayer(ClassicalMusic classicM, RockMusic rockM) {
        this.classicM = classicM;
        this.rockM = rockM;
    }


    public void playMusic(EMusic genre) {
        Random r = new Random();
        int random = r.nextInt(3);
    if (genre == EMusic.ROCK){
       System.out.println(rockM.getSong().get(random));
    } else {
        System.out.println(classicM.getSong().get(random));
    }
    }
}
