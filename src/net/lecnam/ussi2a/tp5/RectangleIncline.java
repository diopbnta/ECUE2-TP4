package net.lecnam.ussi2a.tp5;

public class RectangleIncline extends Rectangle {

    double angle;

    public RectangleIncline(double longueur, double largeur, Point point, double angle) {

        super(longueur, largeur, point);
        this.angle = angle;

    }

    RectangleIncline(double longueur, double largeur, double x, double y, double angle) {
        this(longueur, largeur, new Point(x, y), angle);
    }

    @Override
    double retourneSurface() {
        return this.longueur * this.largeur;
    }

    @Override
    double retournePerimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    @Override
    void translate(double x, double y) {
        this.point.translate(x, y);
    }



    @Override
    public boolean equals(Object object) {
        Rectangle rectangle = (Rectangle) object;
        return this.point.equals(rectangle.point)
                && this.longueur == rectangle.longueur
                && this.largeur == rectangle.largeur;
    }

    @Override
    boolean contient(Point point) {

        double a = Math.toRadians(this.angle);

        double dx = point.x - this.point.x;
        double dy = point.y - this.point.y;

        double rotx = dx * Math.cos(a) + dy * Math.sin(a);
        double roty = -dx * Math.sin(a) + dy * Math.cos(a);

        return 0 <= rotx && rotx <= this.longueur
                && 0 <= roty && roty <= this.largeur;
    }

    @Override
    public String toString() {
        return "RectangleIncline{" +
                "angle=" + angle +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                ", point=" + point +
                '}';
    }
}
