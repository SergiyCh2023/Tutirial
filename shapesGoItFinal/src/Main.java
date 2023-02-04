class Main {

    public static void main(String[] args) {
       Shape circle1 = new Circle(new Point(5,10), 5);
        System.out.println(circle1);
        displayShapes(circle1);
        System.out.println(circle1.output());
        System.out.println("circle.area(): " + circle1.area());
        System.out.println("circle1.perimetr(): " + circle1.perimetr());



System.out.println("**********************************************************************************");

       Shape triangle1 = new Triangle(new Point(3,2), new Point(5,6), new Point(2,4));
       System.out.println(triangle1);
       displayShapes(triangle1);
       System.out.println(triangle1.output());
       System.out.println("triangle.area(): "  + triangle1.area());
       System.out.println("triangle.perimetr(): " + triangle1.perimetr());

System.out.println("**********************************************************************************");
       Shape square1 = new Square(new Point(2,1), new Point(2,3), new Point(4,3), new Point(4,1) );
       System.out.println(square1);
       displayShapes(square1);
       System.out.println(square1.output());
       System.out.println("square.area(): " + square1.area());
       System.out.println("square1.perimetr(): " + square1.perimetr());

System.out.println("**********************************************************************************");
        Shape rhombus1 = new Rhombus(new Point(1,1), new Point(1,3), new Point(4,4), new Point(3,1) );
        System.out.println(rhombus1);
        displayShapes(rhombus1);
        System.out.println(rhombus1.output());
        System.out.println("rhombus.area(): " + rhombus1.area());
        System.out.println("square1.perimetr(): " + square1.perimetr());

System.out.println("**********************************************************************************");
        Shape trapezium1 = new Trapezium(new Point(-4,1), new Point(-3,2.5), new Point(-2,2.5), new Point(-1,1) );
        System.out.println(trapezium1);
        displayShapes(trapezium1);
        System.out.println(trapezium1.output());
        System.out.println("trapezium1.area(): " + trapezium1.area());
        System.out.println("trapezium1.perimetr(): " + trapezium1.perimetr());

System.out.println("**********************************************************************************");
        Shape parallelogram1 = new Parallelogram(new Point(1,-3), new Point(2,-1.5), new Point(4,-1.5), new Point(3,-3) );
        System.out.println(parallelogram1);
        displayShapes(parallelogram1);
        System.out.println(parallelogram1.output());
        System.out.println("parallelogram1.area(): " + parallelogram1.area());
        System.out.println("parallelogram1.perimetr(): " + parallelogram1.perimetr());
    }

    public static void displayShapes (Shape shape) {
        System.out.println("The name of shape: " + shape.nameShape);
    }
}