class Trapezium extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Trapezium(Point a, Point b, Point c, Point d) {

        //основи паралельні: коеффіцієнти нахилу основ будуть рівні, а коэфициенты сторін не будуть

        double k_BC = (c.getY()-b.getY())/(c.getX()-b.getX());
        double k_AD = (d.getY()-a.getY())/(d.getX()-a.getX());
        double k_AB = (b.getY()-a.getY())/(b.getX()-a.getX());
        double k_CD = (d.getY()-c.getY())/(d.getX()-c.getX());


       if (!a.equals(b) && !b.equals(c) && !c.equals(d) && !a.equals(d) && k_BC==k_AD && k_AB!=k_CD) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;

        } else throw new  IllegalArgumentException("These coordinates are not correct");
        nameShape = "rhombus";
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    public String output() {
        return nameShape;
    }


    @Override
    public String toString() {
        return "This shape is: " + output() + ", with coordinates vertexes: vertex A (" + getA().getX() + ", " + getA().getY()+
                ") and vertex B: (" + getB().getX() + ", " + getB().getY()+ ") and vertex C: (" + getC().getX() + ", "
                + getC().getY()+  ")" + ") and vertex D: (" + getD().getX() + ", "  + getD().getY()+  ")";
    }

    @Override
    public double area() {
        double ab = Math.sqrt(((b.getX()-a.getX())*(b.getX()-a.getX()))  + ((b.getY()-a.getY())*(b.getY()-a.getY())));
        double ad = Math.sqrt(((d.getX()-a.getX())*(d.getX()-a.getX()))  + ((d.getY()-a.getY())*(d.getY()-a.getY())));
        double bd = Math.sqrt(((d.getX()-b.getX())*(d.getX()-b.getX()))  + ((d.getY()-b.getY())*(d.getY()-b.getY())));

        double pABD = (ab + ad + bd)/2;
        double areaABD = Math.sqrt(pABD * (pABD - ab) * (pABD - ad) * (pABD - bd));

        double bc = Math.sqrt(((c.getX()-b.getX())*(c.getX()-b.getX()))  + ((c.getY()-b.getY())*(c.getY()-b.getY())));
        double cd = Math.sqrt(((d.getX()-c.getX())*(d.getX()-c.getX()))  + ((d.getY()-c.getY())*(d.getY()-c.getY())));

        double pBCD = (bc + cd + bd)/2;
        double areaBCD = Math.sqrt(pBCD * (pBCD - bc) * (pBCD - cd) * (pBCD - bd));

        return areaABD + areaBCD;
    }

    @Override
    public double perimetr() {
        double ab = Math.sqrt(((b.getX()-a.getX())*(b.getX()-a.getX()))  + ((b.getY()-a.getY())*(b.getY()-a.getY())));
        double bc = Math.sqrt(((c.getX()-b.getX())*(c.getX()-b.getX()))  + ((c.getY()-b.getY())*(c.getY()-b.getY())));
        double cd = Math.sqrt(((d.getX()-c.getX())*(d.getX()-c.getX()))  + ((d.getY()-c.getY())*(d.getY()-c.getY())));
        double ad = Math.sqrt(((d.getX()-a.getX())*(d.getX()-a.getX()))  + ((d.getY()-a.getY())*(d.getY()-a.getY())));

        return ab+bc+cd+ad;
    }


}