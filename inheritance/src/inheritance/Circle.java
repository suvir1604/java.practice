package inheritance;

public class Circle extends Shape {
    int r;
    

    public Circle(int r) {
           super("Circle");
           this.r = r;
    }

    public double calculateArea() {
           return Math.PI*r*r;
    }
}

