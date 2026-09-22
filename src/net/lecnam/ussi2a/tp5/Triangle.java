package net.lecnam.ussi2a.tp5;

public class Triangle extends Figure {

    Point A;
    Point B;
    Point C;
    Point point;
    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    void translate(double x, double y){
        this.point.translate(x,y);
    }

    @Override
    double retourneSurface() {

        double a = distance(B, C);
        double b = distance(A, C);
        double c = distance(A, B);

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double retournePerimetre() {

        double a = distance(B, C);
        double b = distance(A, C);
        double c = distance(A, B);

        return a + b + c;
    }

    @Override
    boolean contient(Point point) {

        double surfaceTriangle = retourneSurface();

        double surface1 = surface(A, B, point);
        double surface2 = surface(B, C, point);
        double surface3 = surface(C, A, point);

        return Math.abs(
                surface1 + surface2 + surface3 - surfaceTriangle
        ) < 0.000001;
    }

    private double surface(Point p1, Point p2, Point p3) {

        return Math.abs(
                (p1.x * (p2.y - p3.y)
                        + p2.x * (p3.y - p1.y)
                        + p3.x * (p1.y - p2.y)) / 2
        );
    }

    private double distance(Point p1, Point p2) {

        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ", point=" + point +
                '}';
    }
}