package odev_3.oop;

public class Course {

    private String courseName;
    private String tutorName;
    private boolean doesItContinue;
    private int courseId;
    private int coursePrice;

    public Course(String courseName, String tutorName, boolean doesItContinue, int courseId, int coursePrice) {
        this.courseName = courseName;
        this.tutorName = tutorName;
        this.doesItContinue = doesItContinue;
        this.courseId = courseId;
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public boolean isDoesItContinue() {
        return doesItContinue;
    }

    public void setDoesItContinue(boolean doesItContinue) {
        this.doesItContinue = doesItContinue;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

}
