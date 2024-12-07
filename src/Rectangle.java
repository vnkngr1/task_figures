public class Rectangle {
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) {
        if (side1 < 0 || side2 < 0) {
            throw new IllegalArgumentException("Стороны не могут быть отрицательными!");
        } else {
            this.side1 = side1;
            this.side2 = side2;
        }
    }

    public int getArea() {
        return side1 * side2;
    }

    public int getPerimeter() {
        return side1 + side2;
    }
}
