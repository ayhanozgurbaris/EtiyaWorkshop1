public class Student {

    private String firstName;
    private String lastName;
    private int studentNo;
    private int nationalityId;
    private int group;


    public Student(String firstName, String lastName, int studentNo, int nationalityId, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNo = studentNo;
        this.nationalityId = nationalityId;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getGroup() {
        return group;
    }

}
