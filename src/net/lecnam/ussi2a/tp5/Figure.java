package net.lecnam.ussi2a.tp5;

public abstract class Figure {
    abstract double retourneSurface();
    abstract double retournePerimetre();
    abstract void translate(double x, double y);
    abstract boolean contient(Point point);

}
