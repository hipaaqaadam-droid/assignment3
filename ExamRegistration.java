package university;
public class ExamRegistration {

    String studentID;
    String studentName;
    int age;
    double examMark;
    int numberOfSubjects;

    public ExamRegistration(String studentID, String studentName,
                            int age, double examMark, int numberOfSubjects) {

        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.examMark = examMark;
        this.numberOfSubjects = numberOfSubjects;
    }

    public void register() throws InvalidRegistrationException {

        if (age < 18) {
            throw new InvalidRegistrationException(
                    "Student age must be 18 or above.");
        }

        if (examMark < 0 || examMark > 100) {
            throw new InvalidRegistrationException(
                    "Exam mark must be between 0 and 100.");
        }

        if (numberOfSubjects < 1 || numberOfSubjects > 5) {
            throw new InvalidRegistrationException(
                    "Number of subjects must be between 1 and 5.");
        }

        System.out.println("\nRegistration Successful!");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Exam Mark: " + examMark);
        System.out.println("Number of Subjects: " + numberOfSubjects);
    }
}