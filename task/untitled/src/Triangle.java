public class Triangle extends Shape {
    double height;
    double base;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Triangle( String color, double height, double base){
        super(color);
        this.base=base;
        this.height=height;
    }

    @Override
    public double area() {
        return 0.5*base*height;
    }
}
