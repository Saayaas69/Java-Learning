package student;

public class StudentFactory {

  public static void main(String[] args) {
    Student saayaas = new Student(69, "Raj Shrestha", 20, 50);
    saayaas.displayDetails();
    saayaas.updateGrade(69);
    saayaas.isPassing();

    System.out.println();

    Student jhusey = new Student(1, "Roshan Khanal", 19, 75);

    jhusey.displayDetails();
    jhusey.updateGrade(80);
    jhusey.isPassing();
  }
}
