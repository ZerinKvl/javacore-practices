
public class Course {
    private String courseName;
    private String courseCode;
    private int numberOfStudents;

    public Course(String courseName, String courseCode, int numberOfStudents) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.numberOfStudents = numberOfStudents;
    }

    public Course() {

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;

    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return "Course name: " + getCourseName() + " Course code: " + getCourseCode()
                + " Number of Student in this course: " + getNumberOfStudents();
    }
}
