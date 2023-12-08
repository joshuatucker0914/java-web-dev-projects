import java.util.HashMap;
public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student student1 = new Student("Joseph",4495,40,4.0);
        Student student2 = new Student("Myles",2401,36,3.8);
        Course course = new Course("Math", "Mrs. Claire");
        course.getEnrolledStudents().put(student1,100);
        course.getEnrolledStudents().put(student2,87);
        Teacher teacher = new Teacher ("Sarah","Milling","Science",12);

        for (Student student : course.getEnrolledStudents().keySet()) {
            int grade = course.getEnrolledStudents().get(student);
            System.out.println(student.getName() + "'s grade: " + grade);
        }
    }
}

