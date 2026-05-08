public class Student extends OrganizationComponent {

    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        super(name);
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent +
                "Student: " + name +
                " | ID: " + studentId +
                " | Tuition Fee: ₱" + tuitionFee);
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee;
    }
}