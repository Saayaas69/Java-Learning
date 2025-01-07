package Assignment;

//A static variable statictotalStudents to track the total number of students. (attributes, constructor file)

public class Student {
  // attributes
  public static int statictotalStudents = 0;

  public String name;
  public int age;

  // Constructor
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
    statictotalStudents++; // Increment static variable whenever a new student is created
  }

  // Static method to get the total number of students
  public static int getTotalStudents() {
    return statictotalStudents;
  }

}
