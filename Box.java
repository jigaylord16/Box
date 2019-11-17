//Jacob Gaylord
//jigaylord16@ole.augie.edu
//Box.java
//Class Box support objects representing boxes. Each box object knows its height,
//width, length, volume, and surface area.
public class Box
{
  private double height;
  private double width;
  private double length;
  private double volume;
  private double surfaceArea;
  //Post: Area and perimeter of this Box recalculated.
  private void calcVolumeAndSurfaceArea()
  {
    volume = height * width * length;
    surfaceArea = 2 * ((width * length) + (height * length) + (height * width));
  }
  //Post: Height, width, length, volume, and surface area initialized to 0.0.
  public Box()
  {
    height = width = length = volume = surfaceArea = 0.0;
  }
  //Pre:  Height, width, and length must be positive.
  //Post: Height of this Box initialized to height.
  //      Width of this Box initialized to width.
  //      Length of this Box initialized to length.
  //      Volume and surface area fo this Box properly initialized.
  public Box(double height, double width, double length)
  {
    this.height = height;
    this.width = width;
    this.length = length;
    calcVolumeAndSurfaceArea();
  }
  //Pre:  Height must be positive.
  //Post: Height of this Box initialized to height.
  //      Volume and surface area of this box properly initialized.
  public void setHeight(double height)
  {
    this.height = height;
    calcVolumeAndSurfaceArea();
  }
  //Pre:  Width must be positive.
  //Post: Width of this Box initialized to width.
  //      Volume and surface area of this box properly initialized.
  public void setWidth(double width)
  {
    this.width = width;
    calcVolumeAndSurfaceArea();
  }
  //Pre:  Length must be positive.
  //Post: Length of this Box initialized to length.
  //      Volume and surface area of this box properly initialized.
  public void setLength(double length)
  {
    this.length = length;
    calcVolumeAndSurfaceArea();
  }
  //Return: Height of this Box.
  public double getHeight()
  {
    return height;
  }
  //Return: Width of this Box.
  public double getWidth()
  {
    return width;
  }
  //Return: Length of this Box.
  public double getLength()
  {
    return length;
  }
  //Return: Height of this Box.
  public double getVolume()
  {
    return volume;
  }
  //Return: Height of this Box.
  public double getSurfaceArea()
  {
    return surfaceArea;
  }
}
