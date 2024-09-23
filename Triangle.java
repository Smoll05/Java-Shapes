public class Triangle extends Shape {
    // TODO implement Triangle
    private double base;
    private double height;
    private double a;
    private double c;
    
    public Triangle(double base, double height, double a, double c, String color) {
        super(color);
        this.base = base;
        this.height = height;
        this.a = a;
        this.c = c;
    }
    
    public double area() {
        return (base * height) / 2;
    }
        
    public double perimeter() {
        return a + base + c;
    }
    
    public String toString() {
        return super.toString() + " which is also a Triangle";
    }

   public static class EquilateralTriangle extends Triangle {
        // TODO implement EquilateralTriangle
        public EquilateralTriangle(double side, String color) {
            super(side, (Math.sqrt(3) / 2.0) * side, side, side, color);
        }
        
        public double area() {
            return (Math.sqrt(3) / 4.0) * (super.base * super.base);
        }
        
        public double perimeter() {
            return super.a + super.base + super.c;
        }
        
        public String toString() {
            return super.toString() + " which is also an Equilateral Triangle";
        }
   }
}