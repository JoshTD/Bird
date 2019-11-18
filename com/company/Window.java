package com.company;
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame
{
    private Flock f;
    public Window()
    {
        this.setSize(1280, 720);
        this.setVisible(true);
        this.setTitle("Scheme");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Window(Flock f)
    {
        setSize(1280, 720);
        setVisible(true);
        setTitle("Birds");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.f = f;
    }
    @Override
    public void paint(Graphics g)
    {
        g.translate(getWidth()/2,getHeight()/2);
        g.setColor(Color.white);
        g.fillRect(-getWidth()/2, -getHeight()/2, getWidth(), getHeight());
        g.setColor(Color.black);
        g.drawLine(0, -getHeight()/2,0, getHeight()/2);
        g.drawLine(-getWidth()/2, 0,getWidth()/2, 0);
        f.draw(g);
        g.setColor(new Color (255,0,0));
        g.drawRect(Parrot.minX, Parrot.minY, (Parrot.maxX-Parrot.minX) + Parrot.sizeB, (Parrot.maxY-Parrot.minY) + Parrot.sizeB);
        g.setColor(new Color (0,0,0));
        g.drawRect(Penguin.minX, Penguin.minY, (Penguin.maxX-Penguin.minX) + Penguin.sizeB, (Penguin.maxY-Penguin.minY) + Penguin.sizeB);
        g.setColor(new Color (153,102,0));
        g.drawRect(Sparrow.minX, Sparrow.minY, (Sparrow.maxX-Sparrow.minX) + Sparrow.sizeB, (Sparrow.maxY-Sparrow.minY)+ Sparrow.sizeB);
    }
}
