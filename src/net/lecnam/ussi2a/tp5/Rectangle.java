package net.lecnam.ussi2a.tp5;


public class Rectangle extends Figure {

    double longueur;
    double largeur;
    Point point;


    public Rectangle(double longueur, double largeur, Point point) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.point = point;
    }

    Rectangle(double longueur, double largeur, double x, double y) {
        this(longueur, largeur, new Point(x, y));
    }
@Override
    double retourneSurface(){
        return this.longueur *this.largeur;
    }

@Override
    double retournePerimetre(){
        return 2 * (this.longueur + this.largeur);
    }

@Override
    void translate(double x, double y){
        this.point.translate(x,y);
    }

@Override
    boolean contient(Point point){
        return point.x >= this.point.x
                && point.x <= this.point.x+ longueur
                && point.y >= this.point.y
                && point.y <= this.point.y+largeur;
    }

    @Override
    public boolean equals(Object object){
        Rectangle rectangle = (Rectangle) object;
        return this.point.equals(rectangle.point)
                && this.longueur == rectangle.longueur
                && this.largeur == rectangle.largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longeur=" + longueur +
                ", largeur=" + largeur +
                ", point=" + point +
                ", surface=" + this.retourneSurface() +
                '}';
    }


}
