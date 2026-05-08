import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {

    private List<EducationalUnit> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void add(EducationalUnit unit) {
        children.add(unit);
    }

    public void remove(EducationalUnit unit) {
        children.remove(unit);
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Department: " + name);

        for (EducationalUnit unit : children) {
            unit.displayDetails(indent + "   ");
        }
    }

    @Override
    public int getStudentCount() {
        int total = 0;

        for (EducationalUnit unit : children) {
            total += unit.getStudentCount();
        }

        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;

        for (EducationalUnit unit : children) {
            total += unit.getBudget();
        }

        return total;
    }
}