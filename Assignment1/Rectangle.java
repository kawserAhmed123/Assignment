
public class Rectangle {

    public double length;
    public double width;
    public double perimeter;
    public double area;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    double calculateArea(double l, double w) {

        area = l * w;
        return area;
    }

    double calculatePerimeter(double l, double w) {

        perimeter = 2 * (l + w);
        return perimeter;
    }
}
