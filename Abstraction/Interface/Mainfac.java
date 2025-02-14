package Abstraction.Interface;

public class Mainfac {
  public static void main(String[] args) {
    // assignment question solution
    Shape[] shapes = {
        new Rectangle(5, 5),
        new Circle(2f),
    };
    // ! for my own understanding
    Shape[] livingRoom = {
        new Rectangle(12, 12),
        new Circle(4)
    };

    // assignment question solution
    for (Shape shape : shapes) {
      if (shape instanceof Rectangle) {
        System.out.println("---For assignment Question---");
        System.out.println("Area of Rectangle: " + shape.calculateArea() + "sq");
      } else if (shape instanceof Circle) {
        System.out.println("----------");
        System.out.println("Area of Circle: " + shape.calculateArea() + "sq");
        System.out.println("----------");
      }
    }

    // ! for own understanding
    for (Shape shape : livingRoom) {
      if (shape instanceof Rectangle) {
        System.out.println("---For Living Room---");
        System.out.println("Area of Room: " + shape.calculateArea() + " sq");
      } else if (shape instanceof Circle) {
        System.out.println("----------");
        System.out.println("Area of Ceiling Circle: " + shape.calculateArea() + " sq");
        System.out.println("----------");
      }
    }
  }
}
