import java.util.HashMap;

public class Course {
    private String topic;
    private String teacher;
    private HashMap<Student, Integer> enrolledStudents;

    //constructor
    public Course(String topic, String teacher) {
        this.topic = topic;
        this.teacher = teacher;
        this.enrolledStudents = new HashMap<Student, Integer>();
    }

    //setters
    private void setTopic(String topic) {
        this.topic = topic;
    }

    private void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setEnrolledStudents(HashMap<Student, Integer> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    //getters
    public String getTopic() {
        return topic;
    }

    public String getTeacher() {
        return teacher;
    }

    public HashMap<Student, Integer> getEnrolledStudents() {
        return enrolledStudents;
    }

}

