package student;

public class StudentFactory {

  public static void main(String[] args) {
    Student saayaas = new Student(69, "Raj Shrestha", 20, 50);
    System.out.println("Student Details is created:");
    System.out.println("Student ID:" + saayaas.studentId);
    System.out.println("Student Name:" + saayaas.name);
    System.out.println("Student Age:" + saayaas.age);
    System.out.println("Student Grade:" + saayaas.grade);

    saayaas.displayDetails();
    saayaas.updateGrade(69);
    saayaas.isPassing();

    System.out.println();

    Student jhusey = new Student(1, "Roshan Khanal", 19, 70);
    System.out.println("Student Details is created:");
    System.out.println("Student ID:" + jhusey.studentId);
    System.out.println("Student Name:" + jhusey.name);
    System.out.println("Student Age:" + jhusey.age);
    System.out.println("Student Grade:" + jhusey.grade);

    jhusey.displayDetails();
    jhusey.updateGrade(80);
    jhusey.isPassing();
  }
}
