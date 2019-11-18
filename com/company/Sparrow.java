package com.company;

import java.awt.*;

public class Sparrow extends Bird
{
    private static int SPARR_COUNT=0;
    public static int minX=1280, minY=720, maxX=-1280, maxY=-720;
    public static int sizeB = 8;
    Sparrow()
    {
        SPARR_COUNT++;
        int x = (int)(Math.random()*1280 - 640);
        int y = (int)(Math.random()*720 - 360);
        if (x > maxX) { maxX = x; }
        if (x < minX) { minX = x; }
        if (y > maxY) { maxY = y; }
        if (y < minY) { minY = y; }
        this.setGraph(x, y, sizeB, new Color(153,102,0));
        System.out.println("It's a Sparrow!");
    }
    Sparrow(String name)
    {
        SPARR_COUNT++;
        int x = (int)(Math.random()*1280 - 640);
        int y = (int)(Math.random()*720 - 360);
        if (x > maxX) { maxX = x; }
        if (x < minX) { minX = x; }
        if (y > maxY) { maxY = y; }
        if (y < minY) { minY = y; }
        this.setGraph(x, y,sizeB, new Color(153,102,0));
        this.name = name;
        System.out.println("It's a Sparrow!");
        this.printName();
        tweet();
    }
    public void tweet()
    {
        System.out.println("Chirik!");
    }
    public void fly()
    {
        System.out.println("The Sparrow is flying!");
    }
    public static int Count() { return SPARR_COUNT; }

}
