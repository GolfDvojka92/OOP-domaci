package com.company;

public class Main {

    public static void main(String[] args) {
        Tacka a=new Tacka(2,3);
        Tacka b=new Tacka();
        Tacka c=new Tacka(4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        b.postavi(5,5);
        System.out.println(b);
        double ad=a.rastojanje();
        double bd=b.rastojanje();
        double cd=c.rastojanje();
        System.out.println("Distanca a:"+ad);
        System.out.println("Distanca b:"+bd);
        System.out.println("Distanca c:"+cd);
        double ab=a.rastojanjeOdTacke(b);
        double bc=b.rastojanjeOdTacke(c);
        double ac=c.rastojanjeOdTacke(a);
        System.out.println("Distanca a od b:"+ab);
        System.out.println("Distanca b od c:"+bc);
        System.out.println("Distanca c od a:"+ac);
        Tacka d=a;
        d.ucitaj();
        double da=d.rastojanjeOdTacke(a);
        System.out.println("Distanca a od b:"+ab);
        System.out.println("Distanca b od c:"+bc);
        System.out.println("Distanca c od a:"+ac);
        System.out.println("Distanca d od a:"+da);
    }
}
