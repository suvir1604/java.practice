package inheritance;
public class Square extends Shape {
    int s;
    
    
    public Square(int s) {
           super("Square");
           this.s = s ;
                  // TODO Auto-generated constructor stub
    }
    public double calculateArea() {
           return s*s;
    }
}


