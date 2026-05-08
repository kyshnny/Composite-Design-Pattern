public class Main {

    public static void main(String[] args) {

        // Colleges
        College university = new College("New Era University");

        College info_comp = new College("College of Informatics and Computing Studies");
        College engineering = new College("College of Engineering");
        College business = new College("College of Business");

        // Departments
        Department csDept = new Department("Department of Computer Science");
        Department itDept = new Department("Department of Information Technology");

        // Teachers
        Teacher teacher1 = new Teacher(
                "Juan Dela Cruz",
                "Object-Oriented Programming",
                50000);

        Teacher teacher2 = new Teacher(
                "Kara Santos",
                "Information Management",
                45000);

        Teacher teacher3 = new Teacher(
                "Jacinto Reyes",
                "Networking and Communication",
                47000);

        // Students
        Student student1 = new Student(
                "Sanya Lopez",
                "2024-001",
                30000);

        Student student2 = new Student(
                "Toni Fowler",
                "2024-002",
                32000);

        Student student3 = new Student(
                "Liza Soberano",
                "2024-003",
                31000);

        // Build hierarchy
        csDept.add(teacher1);
        csDept.add(teacher2);
        csDept.add(student1);
        csDept.add(student2);

        itDept.add(teacher3);
        itDept.add(student3);

        info_comp.add(csDept);
        info_comp.add(itDept);

        university.add(business);
        university.add(engineering);
        university.add(info_comp);

        // Display structure
        System.out.println("===== UNIVERSITY STRUCTURE =====");
        university.displayDetails("");

        // Total students
        System.out.println("\n===== TOTAL STUDENTS =====");
        System.out.println("Total Students: "
                + university.getStudentCount());

        // Total budget
        System.out.println("\n===== TOTAL BUDGET =====");
        System.out.println("Total Budget: ₱"
                + university.getBudget());
    }
}