public class Rectangle {
    private double length = 1;
    private double width = 1;

//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

    public double calcPerimeter() {
        return 2*(this.length + this.width);
    }

    public double calcArea() {
        return this.length * this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double val) {
        if (val > 0 && val < 20) {
            this.length = val;
        }

    }

    public void setWidth(double val) {
        if (width > 0 && width < 20) {
            this.width = val;
        }

    }
}
