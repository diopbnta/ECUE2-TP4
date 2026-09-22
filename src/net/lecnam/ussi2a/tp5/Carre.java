package net.lecnam.ussi2a.tp5;

public class Carre extends Figure implements Rectangle{

    double cote;
    Point point;
    double angle = 0;


    public Carre(double cote, Point point) {
        super(cote,cote,point);

    }

    @Override
    public double getAngle() {
        return this.angle;
    }

    @Override
    public void pivoter(double degres) {
        this.angle += degres;
    }

    Carre(double cote, double x, double y) {
        this(cote, new Point(x, y));
    }
    @Override
    double retourneSurface(){
        return this.cote *this.cote;
    }

    @Override
    double retournePerimetre(){
        return 4 * (this.cote);
    }

    @Override
    void translate(double x, double y){
        this.point.translate(x,y);
    }

    @Override
    boolean contient(Point point) {
        return point.x >= this.point.x
                && point.x <= this.point.x + cote
                && point.y >= this.point.y
                && point.y <= this.point.y + cote;
    }

    @Override
    public boolean equals(Object object){
        Carre carre = (Carre) object;
        return this.point.equals(carre.point)
                && this.cote == carre.cote
                && this.cote == carre.cote;
    }

    @Override
    public String toString() {
        return "Carre{" +
                "cote=" + cote +
                ", point=" + point +
                '}';
    }
}
