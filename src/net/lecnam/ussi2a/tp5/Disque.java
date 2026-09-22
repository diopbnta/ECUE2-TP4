package net.lecnam.ussi2a.tp5;

public class Disque extends Figure{
    Point centre;
    double rayon;
    double pi = Math.PI;


    public Disque(Point centre, double rayon)  {
        this.centre = centre;
        this.rayon = rayon;
    }
@Override
    void translate (double x, double y){
        this.centre.translate(x,y);
    }
@Override
    double retourneSurface(){
            return this.rayon *this.rayon * pi;
    }

    @Override

    double retournePerimetre(){
        return 2 * (this.rayon * pi);
    }


    @Override
    boolean contient(Point point) {

        double dx = point.x - centre.x;
        double dy = point.y - centre.y;

        return dx * dx + dy * dy <= rayon * rayon;
    }

    @Override
    public String  toString() {
        return "Disque{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }
}
