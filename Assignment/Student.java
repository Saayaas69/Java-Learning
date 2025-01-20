package Assignment;

public class Student {
  // attributes
  public static int totalStudents = 0;

  public String name;
  public int age;

  // Constructor
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
    totalStudents++; // Increment static variable whenever a new student is created
  }

  // Static method to get the total number of students
  public static int getTotalStudents() {
    return totalStudents;
  }

}
