public class Ellipse2 extends Shape{
    public Ellipse2(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Ellipse.");
        return PI * dim1 * dim2;
    }
}
