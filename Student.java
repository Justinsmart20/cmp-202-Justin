package User;

public class Student extends User {
    String matric_no = "bhu/22/04/05/0013";
    String admission_no = "123888392873";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result. Are you even a student?";
        } else {
            return "You got 6As and 1B";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Justin Bangbin Filbert";
        student.password = "JUstin@20";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
