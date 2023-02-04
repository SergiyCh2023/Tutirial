class Square extends Shape {  // чотирикутник

    private Point a;
    private Point b;
    private Point c;
    private Point d;


    public Square(Point a, Point b, Point c, Point d) {

        // усі сторони мають бути рівними
        double ab = Math.sqrt(((b.getX()-a.getX())*(b.getX()-a.getX()))  + ((b.getY()-a.getY())*(b.getY()-a.getY())));
        double bc = Math.sqrt(((c.getX()-b.getX())*(c.getX()-b.getX()))  + ((c.getY()-b.getY())*(c.getY()-b.getY())));
        double cd = Math.sqrt(((d.getX()-c.getX())*(d.getX()-c.getX()))  + ((d.getY()-c.getY())*(d.getY()-c.getY())));
        double ad = Math.sqrt(((d.getX()-a.getX())*(d.getX()-a.getX()))  + ((d.getY()-a.getY())*(d.getY()-a.getY())));


        if (!a.equals(b) && !b.equals(c) && !c.equals(d) && !a.equals(d) && (ab==bc && bc==cd && cd==ad)) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        } else throw new  IllegalArgumentException("These coordinates are not correct");
        nameShape = "square";
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



    public double area() {
      double  ab = Math.sqrt(((b.getX()-a.getX())*(b.getX()-a.getX())) + ((b.getY()-a.getY())*(b.getY()-a.getY())));
        return ab * ab;
    }

    @Override
    public double perimetr() {
        double ab = Math.sqrt(((b.getX()-a.getX())*(b.getX()-a.getX()))  + ((b.getY()-a.getY())*(b.getY()-a.getY())));
        return 4*ab;
    }


    @Override
    String output() {
        return this.nameShape;
    }

    @Override
    public String toString() {
        return "This shape is: " + output() + ", with coordinates vertexes: vertex A (" + getA().getX() + ", " + getA().getY()+
                ") and vertex B: (" + getB().getX() + ", " + getB().getY()+ ") and vertex C: (" + getC().getX() + ", "
                + getC().getY()+  ")" + ") and vertex D: (" + getD().getX() + ", "  + getD().getY()+  ")";
    }

}
