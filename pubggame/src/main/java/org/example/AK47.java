package org.example;

public class AK47 implements Gun{
    private GunSound gunSound;
    public int bulletNumber = 30;
    public int bulletSize = 7;
    public String noSound = " ---------- ";

    public AK47(GunSound gunSound) {
        this.gunSound = gunSound;
    }

    @Override
    public void shoot() {
        if (bulletNumber > 0) {
            bulletNumber--;
            //System.out.println(sound);
            this.gunSound.sound();
        } else {
            System.out.println(noSound);
        }
    }

    @Override
    public void setSound(GunSound gunSound) {
        this.gunSound = gunSound;
    }

}


