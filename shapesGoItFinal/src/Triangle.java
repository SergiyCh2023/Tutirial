class Triangle extends Shape {  // трикутник

    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c) {
        // перевірки на не виродженість трикутника: сума 2 сторін трикутника має бути більшою ніж інша сторона
        double ab = Math.sqrt(((b.getX()-a.getX())*(b.getX()-a.getX())) + ((b.getY()-a.getY())*(b.getY()-a.getY())));
        double ac = Math.sqrt(((c.getX()-a.getX())*(c.getX()-a.getX())) + ((c.getY()-a.getY())*(c.getY()-a.getY())));
        double bc = Math.sqrt(((c.getX()-b.getX())*(c.getX()-b.getX())) + ((c.getY()-b.getY())*(c.getY()-b.getY())));

        if ((ab+ac>bc && ab+bc>ac && ac+bc>ab) || (!a.equals(b) && b.equals(c) && a.equals(c)) ) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else throw new  IllegalArgumentException("These coordinates are not correct");


        nameShape = "triangle";
    }


    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
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

    String output() {
    return this.nameShape;
  }

    //TODO      area
    public double area() {

        double ab = Math.sqrt(((b.getX()-a.getX())*(b.getX()-a.getX()))  + ((b.getY()-a.getY())*(b.getY()-a.getY())));
        double ac = Math.sqrt(((c.getX()-a.getX())*(c.getX()-a.getX()))+ ((c.getY()-a.getY())*(c.getY()-a.getY())));
        double bc = Math.sqrt(((c.getX()-b.getX())*(c.getX()-b.getX())) + (c.getY()-b.getY())*(c.getX()-b.getX()));
        double p = perimetr() * 0.5;

        return  (Math.sqrt(p*(p-ab)* (p-ac)*(p-bc)));
    }

    @Override
    public double perimetr() {
        double ab = Math.sqrt(((b.getX()-a.getX())*(b.getX()-a.getX()))  + ((b.getY()-a.getY())*(b.getY()-a.getY())));
        double ac = Math.sqrt(((c.getX()-a.getX())*(c.getX()-a.getX()))+ ((c.getY()-a.getY())*(c.getY()-a.getY())));
        double bc = Math.sqrt(((c.getX()-b.getX())*(c.getX()-b.getX())) + (c.getY()-b.getY())*(c.getX()-b.getX()));
        return ab + ac + bc;
    }


    public String toString() {
        return "This shape is: " + output() + ", with coordinates vertexes: vertex A (" + getA().getX() + ", " + getA().getY()+
                ") and vertex B: (" + getB().getX() + ", " + getB().getY()+ ") and vertex C: (" + getC().getX() + ", "
                + getC().getY()+  ")";
    }



}