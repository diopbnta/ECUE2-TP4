package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {
        Point p = new Point(2,3);
        Point p1 = new Point(3,9);

        Rectangle r  = new Rectangle(2,3,p);
        Disque d = new Disque(p,3);

        dessin.ajout(r);
        dessin.ajout(d);


        System.out.println(dessin.retourneSurfaceTotale());
        System.out.println(dessin.retournePlusGrand());
        System.out.println(dessin.contient(p1));

    }


}
