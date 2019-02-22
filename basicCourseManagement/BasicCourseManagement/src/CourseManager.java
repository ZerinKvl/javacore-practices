import java.util.Scanner;

public class CourseManager {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Course[] courses = new Course[100];
        Scanner input = new Scanner(System.in);
        int selection = 0;
        int courseNo;
        int courseCounter = 0;

        while (selection != 5) {
            System.out.println("1-Add Course ");
            System.out.println("2-List Courses");
            System.out.println("3-View Course by code");
            System.out.println("4-Delete Course by index");
            selection = input.nextInt();

            switch (selection) {

            case 1:
                System.out.println("Select which course information do you want to add");
                System.out.println("1-BSc Course");
                System.out.println("2-MSc COurse");
                courseNo = input.nextInt();
                System.out.println("Enter course information");

                if (courseNo == 1) {
                    BScCourse bsc = new BScCourse();

                    System.out.println("Course Name: ");
                    bsc.setCourseName(input.next());

                    System.out.println("Course code: ");
                    bsc.setCourseCode(input.next());

                    System.out.println("Number of students: ");
                    bsc.setNumberOfStudents(input.nextInt());
                    input.nextInt();

                    System.out.println("Which semester: ");
                    bsc.setSemester(input.nextInt());

                    System.out.println("Enter classroom: ");
                    bsc.setClassroom(input.next());

                    System.out.println("Is the course elective: ");
                    String elective = input.next();

                    System.out.println("Is the course technical: ");
                    String technical = input.next();

                    if (elective.equalsIgnoreCase("yes")) {
                        bsc.setElective(true);
                    } else if (elective.equalsIgnoreCase("no")) {
                        bsc.setElective(false);
                    } else {
                        break;
                    }

                    if (technical.equalsIgnoreCase("yes")) {
                        bsc.setTechnical(true);
                    } else if (technical.equalsIgnoreCase("no")) {
                        bsc.setTechnical(false);
                    } else {
                        break;
                    }

                    courses[courseCounter] = bsc;
                    courseCounter++;

                } else if (courseNo == 2) {
                    MScCourse msc = new MScCourse();

                    System.out.println("Course Name: ");
                    msc.setCourseName(input.next());
                    System.out.println("Course code: ");
                    msc.setCourseCode(input.next());
                    System.out.println("Number of students");
                    msc.setNumberOfStudents(input.nextInt());
                    System.out.println("Enter subject");
                    msc.setSubject(input.next());
                    System.out.println("Is the course thesis dependency?");
                    String dependecy = input.next();

                    if (dependecy.equalsIgnoreCase("yes")) {
                        msc.setThesisDependency(true);
                    } else if (dependecy.equalsIgnoreCase("no")) {
                        msc.setThesisDependency(false);
                    } else {
                        break;
                    }

                    courses[courseCounter] = msc;

                    courseCounter++;
                } else {
                    System.out.println("entered invalid value");
                    break;
                }
                break;
            case 2:
                if (courseCounter > 0) {
                    for (int i = 0; i < courseCounter; i++) {
                        System.out.println("Course at index " + i + "in array" + " Code: " + courses[i].getCourseCode()
                                + " Course name: " + courses[i].getCourseName());
                    }
                    break;
                } else {
                    System.out.println("no course to list");
                }
                break;
            case 3:
                if (courseCounter > 0) {
                    System.out.println("Enter course's code do you want to view:");
                    String code = input.next();

                    for (int j = 0; j < courseCounter; j++) {
                        if (courses[j].getCourseCode().equals(code)) {
                            System.out.println(courses[j].toString());
                            break;
                        } else {
                            System.out.println("no course belonging this code");
                            break;

                        }

                    }
                } else {
                    System.out.println("no course to view");

                }

                break;
            case 4:
                if (courseCounter > 0) {
                    System.out.println("Enter index of course (position of course in array) to delete");
                    int indexTobeDeleted = input.nextInt();
                    System.out.println("Are you sure you want to delete  (Y/N)?) ");
                    char ans = input.next().charAt(0);

                    if (ans == 'Y' || ans == 'y') {
                        if (indexTobeDeleted < 0 || indexTobeDeleted > courseCounter - 1) {
                            System.out.println("invalid index you entered");
                        } else {
                            for (int i = 0; i < courseCounter; i++) {
                                if (indexTobeDeleted == i && indexTobeDeleted != courseCounter - 1) {
                                    for (int j = indexTobeDeleted; j < courseCounter; j++) {
                                        courses[j] = courses[j + 1];
                                    }

                                    courses[courseCounter - 1] = null;
                                    courseCounter--;
                                    break;
                                } else {
                                    courses[courseCounter - 1] = null;
                                    courseCounter--;

                                }
                            }
                        }
                    } else {
                        break;
                    }
                } else {
                    System.out.println("no course to delete");
                }
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("there is no operation you select-please select between 1-4");
                break;
            }

        }

    }

}
