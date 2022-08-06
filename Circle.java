class Circle {
    private double radius;
    private double PI = 22 / 7;

    public Circle() {
        radius = 1;
    }

    public Circle(double r) {
        radius = r;
    }

    double getArea() {
        return (PI * radius * radius);
    }

    double getPerimeter() {
        return (PI * 2 * radius);
    }
}

