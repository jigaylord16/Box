//Jacob Gaylord
//jigaylord16@ole.augie.edu
//TestBox.java
import java.util.Scanner;
public class TestBox
{
  //Description: This program tests the box class by first printing an example of
  //             a box and then asks the user to define the parameters of the box
  //             and then provides them with the volume and surface area.
  //Input:       The client enters the height, width, and length of a box.
  //Output:      The volume and surface area of the specified box printed on the
  //             screen.
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Box b1 = new Box(15.0,12.0,10.0);
    System.out.printf("Box height: %.2f Width: %.2f Length: %.2f\nVolume = %.2f Surface Area = %.2f\n",
                      b1.getHeight(),b1.getWidth(), b1.getLength(), b1.getVolume(),b1.getSurfaceArea());
    Box b2 = new Box();
    System.out.print("Please enter height: ");
    b1.setHeight(input.nextDouble());
    System.out.print("Please enter width: ");
    b1.setWidth(input.nextDouble());
    System.out.print("Please enter length: ");
    b1.setLength(input.nextDouble());
    System.out.printf("Your Box Volume= %.2f Surface Area= %.2f\n",b1.getVolume(),
                      b1.getSurfaceArea());
  }
}
