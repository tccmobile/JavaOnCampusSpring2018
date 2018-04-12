import java.util.ArrayList;

public class ShapeTester {

    public static void main(String arg[]){

    //TODO Insert your code here

        Shape myCircle = new Circle(4);
        Shape myTriangle = new Triangle(3,8);
        Shape myRectangle = new Rectangle(10,8);
        Shape mySquare = new Square(5);
/*

        System.out.println("mySquare = " + mySquare + " area = "+mySquare.calcArea());
        System.out.println("myRectangle = " + myRectangle+ " area = "+myRectangle.calcArea());
        System.out.println("myCircle = " + myCircle+" area = "+myCircle.calcArea());
        System.out.println("myTriangle = " + myTriangle+" area = "+myTriangle.calcArea());
*/

        ArrayList<Shape> myShapes = new ArrayList<Shape>();

        myShapes.add(myCircle);
        myShapes.add(myRectangle);
        myShapes.add(mySquare);
        myShapes.add(myTriangle);

        for (int i = 0; i < myShapes.size() ; i++) {
            System.out.print(myShapes.get(i) + "  ");
            System.out.println(myShapes.get(i).calcArea());
        }


    }
}
