package inheritance;

public class Rectangle extends Shape {
    int l ;
    int b ;
    
    public Rectangle(int l , int b) {
           super("Rectangle");
           this.l=l ;
           this.b=b;
           
    }

    public double calculateArea() {
           
           return l*b ;
    }
}
