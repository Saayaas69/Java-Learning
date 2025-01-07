package Assignment;
// A static variable statictotalStudents to track the total number of students. (main file)

public class StudentFac {
  public static void main(String[] args) {
    Student one = new Student("Raj Shrestha", 20);
    Student two = new Student("Roshan Khanal", 19);
    Student three = new Student("Dipankar Shrestha", 18);
    Student four = new Student("Bhimsen Basnet", 20);
    Student five = new Student("Shisir Chouhan", 18);
    Student six = new Student("Bibek Malla", 19);

    // Accessing the static variable via the static method

    System.out.println("Total Students: " + Student.getTotalStudents()); // Output: Total Students
  }
}
