package Miscalleneous;

public class AssignGrade {
  public static void main(String[] args) {

    int grade = 79;

    if (grade >= 90 && grade <= 100) {
      System.out.println("It's Grade A+");
    } else if (grade >= 80 && grade <= 89) {
      System.out.println("It's Grade A");
    } else if (grade >= 70 && grade <= 79) {
      System.out.println("It's Grade B+");
    } else if (grade < 70) {
      System.out.println("It's Grade C");
    } else {
      System.out.println("It's invalid");
    }
  }
}
