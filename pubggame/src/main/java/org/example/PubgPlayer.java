package org.example;

public class PubgPlayer {
    private Gun gun;

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public void trigger(int firingBulletNumber) {
        for (int i = 0; i < firingBulletNumber; i++) {
            System.out.print("i :" + i);
            gun.shoot();
        }
    }
}
