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
    System.out.println("Student Details is created:");
    System.out.println("Student ID:" + studentId);
    System.out.println("Student Name:" + name);
    System.out.println("Student Age:" + age);
    System.out.println("Student Grade:" + grade);
  }

  public void updateGrade(double newGrade) {
    grade = newGrade;
    System.out.println("New grade:" + grade);
  }

  public void isPassing() {
    if (grade >= 60) {
      System.out.println("You passed");
    } else {
      System.out.println("You failed");
    }
  }
}
