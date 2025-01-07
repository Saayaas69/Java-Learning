package Miscalleneous;

public class AssignGrade {
  public static void main(String[] args) {

    int grade = 69;

    if (grade >= 90 && grade <= 100) {
      System.out.println("Its Grade A");
    } else if (80 <= grade && grade >= 89) {
      System.out.println("Its Grade B");
    } else if (70 <= grade && grade >= 79) {
      System.out.println("Its Grade C");
    } else if (grade < 70) {
      System.out.println("Its Grade D");

    } else {
      System.out.println("its invalid");
    }

  }
}
