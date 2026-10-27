package university;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter Student ID: ");
            String studentID = input.nextLine();

            System.out.print("Enter Student Name: ");
            String studentName = input.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(input.nextLine());

            System.out.print("Enter Exam Mark: ");
            double examMark = Double.parseDouble(input.nextLine());

            System.out.print("Enter Number of Subjects: ");
            int numberOfSubjects = Integer.parseInt(input.nextLine());

            ExamRegistration student = new ExamRegistration(
                    studentID, studentName, age, examMark, numberOfSubjects
            );

            student.register();

        } catch (InvalidRegistrationException e) {
            System.out.println("Registration Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");

        } finally {
            System.out.println("Registration process completed.");
            input.close();
        }
    }
}