
public class MScCourse extends Course {
    private String subject;
    private boolean thesisDependency;

    public MScCourse(String courseName, String courseCode, int numberOfStudents, String subject,
            boolean thesisDependency) {
        super(courseName, courseCode, numberOfStudents);

        this.subject = subject;
        this.thesisDependency = thesisDependency;

    }

    public MScCourse() {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isThesisDependency() {
        return thesisDependency;
    }

    public void setThesisDependency(boolean thesisDependency) {
        this.thesisDependency = thesisDependency;
    }

    public String toString() {
        return super.toString() + "Subject: " + getSubject() + " Dependency: " + isThesisDependency();
    }

}
