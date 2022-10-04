package org.example;

public class VSS implements Gun{
    public int bulletNumber = 10;
    public int bulletSize = 9;
    public String sound = "---- Ting ---";

    public String noSound = " ---------- ";

    @Override
    public void shoot() {
        if (bulletNumber > 0) {
            bulletNumber--;
            System.out.println(sound);
        } else {
            System.out.println(noSound);
        }
    }

    @Override
    public void setSound(GunSound gunSound) {

    }
}
