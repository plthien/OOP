package production_manage;

import java.util.Scanner;

public class EmployeeManagement {

    private static Employee[] employees = new Employee[100];
    private static int index = 3;

    static {
        employees[0] = new Engineer("Phan Le Thanh Hien", 26, true, "Da Nang", "Polymer engineer");
        employees[1] = new Worker("Tran Minh Hieu", 22, true, "Quang Nam", 1);
        employees[2] = new Officer("Tran Hoang Chieu", 23, false, "Da Nang", "Accountant");
    }

    public static void addNewEmployee(int choice) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter gender: ");
        boolean gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        if (choice == 1) {
            System.out.println("Enter task of Officer: ");
            String task = sc.nextLine();
            Employee officer = new Officer(name, age, gender, address, task);
            employees[index] = officer;
            index++;

        } else if (choice == 2) {
            System.out.println("Enter technique of Engineer: ");
            String technique = sc.nextLine();
            Employee engineer = new Engineer(name, age, gender, address, technique);
            employees[index] = engineer;
            index++;
        } else if (choice == 3) {
            System.out.println("Enter rank of Worker: ");
            int rank = sc.nextInt();
            Employee worker = new Worker(name, age, gender, address, rank);
            employees[index] = worker;
            index++;
        }
    }

    public static void searchByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employee.display();
                break;
            }

        }
    }

    public static void displayEmployee() {
        System.out.printf("%60S %n%n","Employee List");
        System.out.printf("|%-10s |%-30s |%-3s |%-10s |%-20s |%-20s|%n", "Job Title","Full Name","Age","Gender","Address","Rank/ Task");
        for (Employee employee : employees) {
            if (employee != null) {
                employee.display();
            }
        }

    }
}
