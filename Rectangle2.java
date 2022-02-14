public class Rectangle2 extends Shape {
    public Rectangle2(double width, double height) {
        super(width, height);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
