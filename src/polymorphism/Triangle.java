package polymorphism;

public class Triangle extends Shapes{
    private double baseWidth;
    private double height;

    public Triangle(double baseWidth, double height) {
        this.baseWidth = baseWidth;
        this.height = height;
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public void setBaseWidth(double baseWidth) {
        this.baseWidth = baseWidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return (baseWidth*height)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "baseWidth=" + baseWidth +
                ", height=" + height +
                '}';
    }
}
