public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color,double length,double width)
    {
        super( color);
        this.width=width;
        this.length=length;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double area(){
        return length*width;
    }
}
