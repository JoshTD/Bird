package com.company;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Bird
{
    private static int BIRD_COUNT=0;
    protected String name;
    protected Color color;
    protected int x, y, size;
    Bird()
    {
        BIRD_COUNT++;
        this.setGraph(0,0,100, new Color(0,0,0));
        System.out.println("New Bird!");
        tweet();
    }
    Bird(String name)
    {
        BIRD_COUNT++;
        this.setGraph(0,0,100, new Color(0,0,0));
        this.name = name;
        System.out.println("New Bird!");
        this.printName();
        tweet();
    }
    public void setGraph(int x, int y, int size, Color color)
    {
        this.x = x; this.y = y; this.size = size; this.color = color;
    }
    public static int Count() { return BIRD_COUNT; }
    public void setName(String name) { this.name = name; }
    public void printName() { System.out.println("Its name is " + name + "!"); }
    abstract public void tweet();
    abstract public void fly();
    public void draw(Graphics g)
    {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.size, this.size);
    }
    public void time()
    {
        GregorianCalendar c = new GregorianCalendar();
        String time = "";
        switch(c.getTime().getHours())
        {
            case 0: case 1: case 2: case 3: case 4: case 22: case 23:
                time = "night";
                break;
            case 5: case 6: case 7: case 8: case 9: case 10: case 11:
                time = "morning";
                break;
            case 12: case 13: case 14: case 15: case 16:
                time = "day";
                break;
            case 17: case 18: case 19: case 20: case 21:
                time = "evening";
                break;
        }
        System.out.println("It's " + time + "!");
    }

}