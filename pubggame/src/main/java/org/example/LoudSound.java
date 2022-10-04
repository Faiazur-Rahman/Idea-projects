package org.example;

public class LoudSound implements GunSound{
    private String sound;

    public LoudSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void sound() {
        System.out.println("----- lound sound -------");
    }
}
