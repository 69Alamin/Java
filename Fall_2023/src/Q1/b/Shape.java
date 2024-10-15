package Q1.b;

public interface Shape {
    double getArea();
}
class Rectangle implements Shape {
    private double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}

class Square extends Rectangle{
    //write your code here
    Square(double length,double width)
    {
        super(length,width);

    }


}
class ShapeTest{
    //write code for draw method here
    static void draw( Shape e)
    {

        System.out.println("drawing over "+e.getArea()+" area");

    }


    public static void main(String[] args) {
        Shape r = new Rectangle(5,6);
        Shape s = new Square(3,3);
        draw(r);
        draw(s);
    }
}
