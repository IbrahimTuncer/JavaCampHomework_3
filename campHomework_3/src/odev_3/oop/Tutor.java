package odev_3.oop;

public class Tutor {

    private String firstName;
    private String LastName;
    private int id;
    private int courseAmount;
// how to make id otomatically!!!!

    public Tutor(String firstName, String lastName, int id, int courseAmount) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.id = id;
        this.courseAmount = courseAmount;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { // id visible but it's not setable
        this.id = id;
    }

    public int getCourseAmount() {
        return courseAmount;
    }

    public void setCourseAmount(int courseAmount) {
        this.courseAmount = courseAmount;
    }

}
