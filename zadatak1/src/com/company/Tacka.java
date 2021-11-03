package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Tacka {
    private double x;
    private double y;
    Tacka()
    {
        x=0;
        y=0;
    }
    Tacka(double xx, double yy)
    {
        x=xx;
        y=yy;
    }
    Tacka(double xx)
    {
        x=xx;
        y=0;
    }
    public void postavi(double xx, double yy)
    {
        x=xx;
        y=yy;
    }
    public double rastojanje()
    {
        double d = sqrt(pow(this.x,2) + pow(this.y,2));
        return d;
    }
    public double rastojanjeOdTacke(Tacka t)
    {
        double dx=abs(this.x-t.x);
        double dy=abs(this.y-t.y);
        double d=sqrt(pow(dx,2) + pow(dy,2));
        return d;
    }
    public void ucitaj()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite x:");
        this.x=s.nextDouble();
        System.out.println("Unesite y:");
        this.y=s.nextDouble();
        s.close();
    }
    public String toString()
    {
        return "X:"+this.x+"\nY:"+this.y+"\n";
    }
}
