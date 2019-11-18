package com.company;
import javax.swing.*;
import java.awt.*;

public class Penguin extends Bird
{
    private static int PENG_COUNT=0;
    public static int minX=1280, minY=720, maxX=-1280, maxY=-720;
    public static int sizeB = 15;
    Penguin()
    {
        PENG_COUNT++;
        int x = (int)(Math.random()*1280  - 640);
        int y = (int)(Math.random()*720 - 360);
        if (x > maxX) { maxX = x; }
        if (x < minX) { minX = x; }
        if (y > maxY) { maxY = y; }
        if (y < minY) { minY = y; }
        this.setGraph(x, y,sizeB, new Color(255,255,0));
        System.out.println("It's a Penguin!");
    }
    Penguin(String name)
    {
        PENG_COUNT++;
        int x = (int)(Math.random()*1280 - 640);
        int y = (int)(Math.random()*720 - 360);
        if (x > maxX) { maxX = x; }
        if (x < minX) { minX = x; }
        if (y > maxY) { maxY = y; }
        if (y < minY) { minY = y; }
        this.setGraph(x,y,sizeB, new Color(255,255,0));
        this.name = name;
        System.out.println("It's a Penguin!");
        this.printName();
        tweet();
    }
    public void draw(Graphics g)
    {
        g.setColor(new Color(0,0,0));
        g.fillOval(this.x, this.y, this.size, this.size);
        g.setColor(this.color);
        g.fillOval(this.x + this.size / 4, this.y + this.size / 4, this.size / 2, this.size / 2);
    }
    public static int Count() { return PENG_COUNT; }
    @Override
    public void fly() { System.out.println("Penguins don't fly!"); }
    @Override
    public void tweet() { System.out.println("AAA!"); }
    public void hello(Parrot p) { tweet(); p.tweet("What???"); }
    public void hello(Penguin p) { tweet(); System.out.println("ArAraAr"); }
}
