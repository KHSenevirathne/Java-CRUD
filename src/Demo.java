import java.util.Scanner;

import objects.Student;

class Demo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How many Student in your classroom? : ");
            int studentCount = input.nextInt();
            Student[] student = new Student[studentCount];
            mainMenu(student, input);
        }

    }

    private static void mainMenu(Student[] student, Scanner input) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("|                 Choose what you wants                      |");
        System.out.println("--------------------------------------------------------------");
        System.out.println("\n1) Add Students\n2)Get Students details\n3)Update Student Details\n4)Delete Student");
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                createStudent(student, input);
                break;
            case 2:
                viewStudent(student, input);
                break;
            case 3:
                updateStudent(student, input);
                break;
            case 4:
                deleteStudent(student, input);
                break;
            default:
                break;
        }
    }

    private static void deleteStudent(Student[] student, Scanner input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }

    private static void updateStudent(Student[] student, Scanner input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateStudent'");
    }

    private static void viewStudent(Student[] student, Scanner input) {
        try {
            for (int i = 0; i < student.length; i++) {
                System.out.println("Student " + (i + 1) + " Details");
                System.out.println("Student Name : "+student[i].getName());
                System.out.println("Student Age : "+student[i].getAge());
                System.out.println("Student Id : "+student[i].getId());
                System.out.println("Student Address : "+student[i].getAddress());
            }
            mainMenu(student, input);
        } catch (Exception e) {
            mainMenu(student, input);
        }
        
    }

    private static void createStudent(Student[] student, Scanner input) {
        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter Your Student " + (i + 1) + " Details");
            System.out.print("Enter Student Name : ");
            String name = input.next();
            System.out.print("Enter Student Age : ");
            int age = input.nextInt();
            System.out.print("Enter Student Id : ");
            String id = input.next();
            System.out.print("Enter Student Address : ");
            String address = input.next();
            student[i] = new Student(id, name, age, address);
            System.out.println("Student Successfully created.");
        }
        mainMenu(student, input);

    }
}