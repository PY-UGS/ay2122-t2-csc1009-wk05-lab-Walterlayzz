public class Circle2 extends Shape{
    public Circle2(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Circle.");
        return PI * dim1 * dim2;
    }
}
