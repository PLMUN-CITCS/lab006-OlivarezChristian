import java.util.Scanner;

public class CircleCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius of the circle: "); //Input radius
    double radius = input.nextDouble();

    double area = Math.PI * Math.pow(radius, 2); //calculate the area
    double circumference = 2 * Math.PI * radius;  //calculate the circumference
    
    System.out.printf("Radius: %.2f%n", radius);
    System.out.printf("Area: %.2f%n", area);
    System.out.printf("Circumference: %.2f%n", circumference);

    input.close();
  }
}