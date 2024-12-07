public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalArgumentException("Сторона треугольника не может быть отрицательной!");
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getArea() {
        double p = (double) (side1 + side2 + side3) / 2;
        return Math.sqrt((p * (p - side1) * (p - side2) * (p - side3)));
    }

    public int getPerimeter() {
        return side1 + side2 + side3;
    }
}
