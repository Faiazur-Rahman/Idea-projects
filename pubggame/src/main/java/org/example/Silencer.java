package org.example;

public class Silencer implements GunSound{
    @Override
    public void sound() {
        System.out.println(" --------- silence sound ------");
    }
}
