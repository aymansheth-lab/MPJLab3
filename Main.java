class Shapes {
    double area;

    // Constructor for circle
    Shapes(double radius) {
        area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Constructor for rectangle
    Shapes(double length, double breadth) {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method overloading for triangle
    void area(double base, double height, String shape) {
        if (shape.equals("triangle")) {
            area = 0.5 * base * height;
            System.out.println("Area of Triangle: " + area);
        }
    }

    // Method overloading for square
    void area(int side) {
        area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public static void main(String[] args) {
        Shapes c = new Shapes(5);              // Circle
        Shapes r = new Shapes(4, 6);           // Rectangle

        Shapes obj = new Shapes(1);            // Dummy object
        obj.area(5, 4, "triangle");            // Triangle
        obj.area(5);                           // Square
    }
}