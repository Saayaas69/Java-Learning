package Abstraction.Interface;

// import java.lang.Math.*;

public class Circle implements Shape {
  private float radius;

  public Circle(float radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}
