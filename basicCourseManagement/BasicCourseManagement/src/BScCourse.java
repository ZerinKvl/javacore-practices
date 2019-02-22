public class BScCourse extends Course {

    private int semester;
    private String classroom;
    private boolean isElective;
    private boolean isTechnical;

    public BScCourse(String courseName, String courseCode, int numberOfStudents, int semester, String classroom,
            boolean isElective, boolean isTechnical) {

        super(courseName, courseCode, numberOfStudents);

        this.classroom = classroom;
        this.isElective = isElective;
        this.isTechnical = isTechnical;
        setSemester(semester);

    }

    public BScCourse() {
        super();
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = (semester >= 1 && semester <= 8) ? semester : 0;

    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public boolean isElective() {
        return isElective;
    }

    public void setElective(boolean isElective) {
        this.isElective = isElective;
    }

    public boolean isTechnical() {
        return isTechnical;
    }

    public void setTechnical(boolean isTechnical) {
        this.isTechnical = isTechnical;
    }

    @Override
    public String toString() {
        return super.toString() + " Semester: " + getSemester() + " Classroom: " + getClassroom() + " Elective: "
                + isElective() + " Technical: " + isTechnical();
    }
}
