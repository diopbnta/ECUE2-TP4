package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {
        Point p = new Point(2,3);
        Point p1 = new Point(0,9);
        Point p2 = new Point(5,9);
        Point p3 = new Point(5,-10);

        Rectangle r  = new Rectangle(2,3,p);
        Disque d = new Disque(p,3);
        Triangle t = new Triangle(p3,p2,p1);

        dessin.ajout(r);
        dessin.ajout(d);
        dessin.ajout(t);


        System.out.println(dessin.retourneSurfaceTotale());
        System.out.println(dessin.retournePlusGrand());
        System.out.println(dessin.contient(p1));

    }


}
