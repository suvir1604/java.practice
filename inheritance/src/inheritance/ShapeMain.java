package inheritance;

import java.util.Scanner;

public class ShapeMain {

public static void main(String[] args) {
              int l = 0, b = 0, s = 0, r = 0;

              
              Scanner sc = new Scanner(System.in);
              //square sq = new Square(side);
              //Rectangle rc = new Rectangle(length, breadth);
              //Circle cr = new Circle(radius);

              System.out.println("1.Rectangle \n 2.Square \n 3.Circle");
              System.out.println("Area Calculator --- Choose your shape");
              int opt = Integer.parseInt(sc.nextLine());
              Shape shape = null;
              

              if (opt == 1) {
                     System.out.println("Enter length and breadth :");
                     l=Integer.parseInt(sc.nextLine());
                     b=Integer.parseInt(sc.nextLine());
                     shape = new Rectangle(l,b);
              } else if (opt == 2) {
                     System.out.println("Enter side :");
                     s=Integer.parseInt(sc.nextLine());
                     shape = new Square(s);
              } else if(opt == 3){
                     System.out.println("Enter radius :");
                     r=Integer.parseInt(sc.nextLine());
                     shape = new Circle(r);
              }
              else
              {
                     System.out.println("Invalid Number");
              }
              System.out.printf("Area of %s is : %.2f",shape.getShapeName(),shape.calculateArea());

       }

}
