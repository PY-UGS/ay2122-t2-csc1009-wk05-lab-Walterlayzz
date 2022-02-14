public class ShapeMain {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(9,5);
        Triangle2 t = new Triangle2(10,8);
        Circle2 c = new Circle2(5,5);
        Ellipse2 e = new Ellipse2(7,7);
        Square2 s = new Square2(6,6);
        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Area is " + figref.area());
    }
}
