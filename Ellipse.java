public class Ellipse extends Shape {
    // TODO implement Ellipse
    static final double PI = 3.14159;
    private double a;
    private double b;
    public Ellipse(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }
    
    public double area() {
        return PI * a * b;
    }
    
    public double perimeter() {
        return (PI * (3 * (a + b) - (Math.sqrt((a + 3 * b) * (b + 3 * a)))));
    }
    
    public String toString() {
        return super.toString() + " which is also an Ellipse";
    }


   public static class Circle extends Ellipse {
        // TODO implement Circle
        
        public Circle(double radius, String color) {
            super(radius, 2 * radius, color);
        }
        
        public double area() {
            return PI * (super.a * super.a);
        }
        
        public double perimeter() {
            return PI * super.b;
        }
        
        public String toString() {
            return super.toString() + " which is also a Circle";
        }
   }
}