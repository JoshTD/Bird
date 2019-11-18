package com.company;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Flock
{
    private ArrayList<Bird> flock;
    public Flock()
    {
        System.out.println("Enter: 0 for exit, 1 for new Parrot, 2 for new Penguin, 3 for new Sparrow");
        flock = new ArrayList<Bird>();
        Scanner in = new Scanner(System.in); 
        int a, k = 0;
        do
        {
            a = in.nextInt();
            if (a == 1)
            {
                flock.add(k++, new Parrot("Parrot №" + (Parrot.Count()+1)));
            }
            if (a == 2)
            {
                flock.add(k++, new Penguin("Penguin №" + (Penguin.Count()+1)));
            }
            if (a == 3)
            {
                flock.add(k++, new Sparrow("Sparrow №" + (Sparrow.Count()+1)));
            }
        } while(a != 0);
        in.close();
    }
    public void Flight()
    {
        for (Bird bird: flock)
        {
            bird.fly();
        }
    }
    public void draw(Graphics g)
    {
        for (Bird bird: flock)
        {
            bird.draw(g);
        }
    }
}
