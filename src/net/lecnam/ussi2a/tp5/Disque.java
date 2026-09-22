package net.lecnam.ussi2a.tp5;

public class Disque extends Figure implements Inclinable{
    Point centre;
    double rayon;
    double pi = Math.PI;
    double angle = 0 ;

    public Disque(Point centre, double rayon)  {
        this.centre = centre;
        this.rayon = rayon;
    }
    @Override
    public double getAngle() {
        return this.angle;
    }

    @Override
    public void pivoter(double degres) {
        this.angle += degres;
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
