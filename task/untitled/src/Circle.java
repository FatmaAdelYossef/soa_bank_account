public class Circle extends Shape {
    private double redus;

    public Circle(String color,double redus){
    super(color);
    this.redus=redus;
    }

    public double getRedus() {
        return redus;
    }

    public void setRedus(double redus) {
        this.redus = redus;
    }
    @Override
    public double area()
    {
        return redus*redus* Math.PI;
    }


}
