package net.lecnam.ussi2a.tp5;

public class Disque {
    Point centre;
    double rayon;
    double pi = Math.PI;

    public Disque(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    void translate (double x, double y){
        this.centre.translate(x,y);
    }

    double retourneSurface(){
            return this.rayon *this.rayon * pi;
    }
    double retournePerimetre(){
        return 2 * (this.rayon * pi);
    }

    boolean contient(Point point){
        return point.x <= this.centre.x + rayon
                && point.x >= this.centre.x - rayon
                && point.y >= this.centre.y - rayon
                && point.y <= this.centre.y + rayon;
    }

    @Override
    public String  toString() {
        return "Disque{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }
}
