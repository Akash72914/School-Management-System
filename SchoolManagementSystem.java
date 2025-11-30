import java.util.*;

class Student {
    int id;
    String name;
    String cls;
    String section;

    public Student(int id, String name, String cls, String section) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.section = section;
    }
}

class Teacher {
    int id;
    String name;
    String subject;
    String qualification;

    public Teacher(int id, String name, String subject, String qualification) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.qualification = qualification;
    }
}

public class SchoolManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    static List<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("       SCHOOL MANAGEMENT SYSTEM");
            System.out.println("------------------------------------");
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: studentMenu(); break;
                case 2: teacherMenu(); break;
                case 3: System.out.println("Thank you!"); System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

    // -------------------- STUDENT MENU --------------------
    public static void studentMenu() {
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("         STUDENT MANAGEMENT");
            System.out.println("------------------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Search Student");
            System.out.println("5. View All Students");
            System.out.println("6. Back");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: addStudent(); break;
                case 2: deleteStudent(); break;
                case 3: updateStudent(); break;
                case 4: searchStudent(); break;
                case 5: viewAllStudents(); break;
                case 6: return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    // STUDENT OPERATIONS ----------------------------------

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Class: ");
        String cls = sc.nextLine();

        System.out.print("Enter Section: ");
        String section = sc.nextLine();

        students.add(new Student(id, name, cls, section));
        System.out.println("Student added successfully!");
    }

    public static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public static void updateStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.id == id) {

                System.out.println("1. Update Name");
                System.out.println("2. Update Class");
                System.out.println("3. Update Section");
                System.out.print("Enter your choice: ");
                int ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {
                    case 1:
                        System.out.print("Enter new name: ");
                        s.name = sc.nextLine();
                        break;
                    case 2:
                        System.out.print("Enter new class: ");
                        s.cls = sc.nextLine();
                        break;
                    case 3:
                        System.out.print("Enter new section: ");
                        s.section = sc.nextLine();
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                System.out.println("Updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public static void searchStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("ID: " + s.id);
                System.out.println("Name: " + s.name);
                System.out.println("Class: " + s.cls);
                System.out.println("Section: " + s.section);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("------------------------------------");
        System.out.println(" ID | Name | Class | Section ");
        System.out.println("------------------------------------");

        for (Student s : students) {
            System.out.println(s.id + " | " + s.name + " | " + s.cls + " | " + s.section);
        }
    }

    // -------------------- TEACHER MENU --------------------
    public static void teacherMenu() {
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("         TEACHER MANAGEMENT");
            System.out.println("------------------------------------");
            System.out.println("1. Add Teacher");
            System.out.println("2. Delete Teacher");
            System.out.println("3. Update Teacher");
            System.out.println("4. Search Teacher");
            System.out.println("5. View All Teachers");
            System.out.println("6. Back");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: addTeacher(); break;
                case 2: deleteTeacher(); break;
                case 3: updateTeacher(); break;
                case 4: searchTeacher(); break;
                case 5: viewAllTeachers(); break;
                case 6: return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    // TEACHER OPERATIONS -----------------------------------

    public static void addTeacher() {
        System.out.print("Enter Teacher ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Qualification: ");
        String qualification = sc.nextLine();

        teachers.add(new Teacher(id, name, subject, qualification));
        System.out.println("Teacher added successfully!");
    }

    public static void deleteTeacher() {
        System.out.print("Enter Teacher ID to delete: ");
        int id = sc.nextInt();

        for (Teacher t : teachers) {
            if (t.id == id) {
                teachers.remove(t);
                System.out.println("Teacher deleted successfully!");
                return;
            }
        }
        System.out.println("Teacher not found!");
    }

    public static void updateTeacher() {
        System.out.print("Enter Teacher ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Teacher t : teachers) {
            if (t.id == id) {

                System.out.println("1. Update Name");
                System.out.println("2. Update Subject");
                System.out.println("3. Update Qualification");
                System.out.print("Enter your choice: ");
                int ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {
                    case 1:
                        System.out.print("Enter new name: ");
                        t.name = sc.nextLine();
                        break;
                    case 2:
                        System.out.print("Enter new subject: ");
                        t.subject = sc.nextLine();
                        break;
                    case 3:
                        System.out.print("Enter new qualification: ");
                        t.qualification = sc.nextLine();
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                System.out.println("Updated successfully!");
                return;
            }
        }
        System.out.println("Teacher not found!");
    }

    public static void searchTeacher() {
        System.out.print("Enter Teacher ID: ");
        int id = sc.nextInt();

        for (Teacher t : teachers) {
            if (t.id == id) {
                System.out.println("ID: " + t.id);
                System.out.println("Name: " + t.name);
                System.out.println("Subject: " + t.subject);
                System.out.println("Qualification: " + t.qualification);
                return;
            }
        }
        System.out.println("Teacher not found!");
    }

    public static void viewAllTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers found!");
            return;
        }

        System.out.println("------------------------------------");
        System.out.println(" ID | Name | Subject | Qualification ");
        System.out.println("------------------------------------");

        for (Teacher t : teachers) {
            System.out.println(t.id + " | " + t.name + " | " + t.subject + " | " + t.qualification);
        }
    }
}
