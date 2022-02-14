public class Square2 extends Shape{
    public Square2(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Square.");
        return dim1 * dim2;
    }
}
