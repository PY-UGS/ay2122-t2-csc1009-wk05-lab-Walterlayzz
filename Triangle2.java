public class Triangle2 extends Shape{
    public Triangle2(double base, double height) {
        super(base, height);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Triangle.");
        return 0.5 * dim1 * dim2;
    }
}
