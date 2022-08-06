/* ID - 21CE062  Yagnik Ladani
Aim : Design a class named Circle containing following attributes and behavior.
• One double data field named radius. The default value is 1.
• A no-argument constructor that creates a default circle.
• A Single argument constructor that creates a Circle with the specified radius.
• A method named getArea() that returns area of the Circle.
• A method named getPerimeter() that returns perimeter of it.
 */
public class Program2_1 {
    public static void main(String[] args) {

        //Parametrized Constructor
        Circle c1 = new Circle(5.25);
        System.out.println("Perimeter of circle 1 : " + c1.getPerimeter());
        System.out.println("area of Circle 1 : " + c1.getArea());

        //Default Constructor
        Circle c2 = new Circle();
        System.out.println("\nPerimeter of circle 2 : " + c1.getPerimeter());
        System.out.println("area of Circle 2 : " + c1.getArea());
    }
}

