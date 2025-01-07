package student;

public class Student {

  // attributes

  public int studentId;

  public String name;

  public int age;

  public double grade;

  // constructors

  public Student() {

  };

  public Student(int studentId, String name, int age, double grade) {
    this.studentId = studentId;
    this.name = name;
    this.age = age;
    this.grade = grade;
  }

  // Methods

  public void displayDetails() {
    System.out.println("All the details");
  }

  public void updateGrade(double newGrade) {
    newGrade = grade;
    System.out.println("New grade");
  }

  public void isPassing() {
    if (grade >= 60) {
      System.out.println("You passed");
    } else {
      System.out.println("You failed");
    }
  }
}
