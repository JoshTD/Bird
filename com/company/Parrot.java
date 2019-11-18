package com.company;
import javax.swing.*;
import java.awt.*;

public class Parrot extends Bird
{
    private static int PARR_COUNT = 0;
    public static int minX=1280, minY=720, maxX=-1280, maxY=-720;
    public static int sizeB = 10;
    Parrot()
    {
        PARR_COUNT++;
        int x = (int)(Math.random()*1280 - 640);
        int y = (int)(Math.random()*720 - 360);
        if (x > maxX) { maxX = x; }
        if (x < minX) { minX = x; }
        if (y > maxY) { maxY = y; }
        if (y < minY) { minY = y; }
        this.setGraph(x, y, sizeB, new Color(255,0,0));
        System.out.println("It's a Parrot!");
    }
    Parrot(String name)
    {
        PARR_COUNT++;
        int x = (int)(Math.random()*1280 - 640);
        int y = (int)(Math.random()*720 - 360);
        if (x > maxX) { maxX = x; }
        if (x < minX) { minX = x; }
        if (y > maxY) { maxY = y; }
        if (y < minY) { minY = y; }
        this.setGraph(x, y, sizeB, new Color(255,0,0));
        this.name = name;
        System.out.println("It's a Parrot!");
        this.printName();
        tweet();
    }
    public static int Count() { return PARR_COUNT; }
    @Override
    public void tweet() { System.out.println("Cheeky breeky!"); }
    public void tweet(String speach) { System.out.println(speach); }
    @Override
    public void fly() { System.out.println("The Parrot is flying!"); }
    public void hello(Parrot p) { tweet("Hi, Parrot!"); p.tweet(); }
    public void hello(Penguin p) { tweet("Hi, Penguin!"); p.tweet(); tweet("What???"); }

}
