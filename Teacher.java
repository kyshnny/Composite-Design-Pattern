public class Teacher extends OrganizationComponent {

    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        super(name);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent +
                "Teacher: " + name +
                " | Subject: " + subject +
                " | Salary: ₱" + salary);
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public double getBudget() {
        return salary;
    }
}