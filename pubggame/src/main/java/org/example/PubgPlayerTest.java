package org.example;

import java.util.Scanner;

public class PubgPlayerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PubgPlayer pubgPlayer = new PubgPlayer();

        GunSound gun_sound = new Ak47LoudSound("---- Tas ---");
        Gun gun = new AK47(gunSound);//program to an interface

        pubgPlayer.setGun(gun);
        pubgPlayer.trigger(2);

        gunSound = new Silencer();
        gun.setSound(gunSound);
        pubgPlayer.trigger(2);
    }
}
