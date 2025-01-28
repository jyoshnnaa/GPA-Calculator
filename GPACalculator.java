import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = sc.nextInt();
        
        double totalGradePoints = 0;
        double totalCredits = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.print("Enter the grade for course " + i + ": ");
            double grade = sc.nextDouble();

            System.out.print("Enter the credits for course " + i + ": ");
            double credits = sc.nextDouble();

            totalGradePoints += grade * credits;
            totalCredits += credits;
        }

        double gpa = totalGradePoints / totalCredits;
        System.out.println("Your GPA is: " + gpa);

        sc.close();
    }
}


