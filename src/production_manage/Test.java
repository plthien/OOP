package production_manage;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice_1 = 0;
        while (choice_1 != 4) {
            System.out.println("Menu: ");
            System.out.println("1. Add new employee");
            System.out.println("2. Search employee by name");
            System.out.println("3. Display employee");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice_1 = Integer.parseInt(sc.nextLine());
            switch (choice_1) {
                case 1:
                    int choice_2 = 0;
                    while (true) {
                        System.out.println("Menu: \n" +
                                "1. Add new Officer \n" +
                                "2. Add new Engineer\n" +
                                "3. Add new Worker\n" +
                                "4. Exit");
                        System.out.println("Enter your  choice: ");
                        choice_2 = Integer.parseInt(sc.nextLine());
                        if (choice_2 == 4) {
                            break;
                        }
                        EmployeeManagement.addNewEmployee(choice_2);
                    }
                    break;
                case 2:
                    System.out.println("Enter name of employee: ");
                    String name = sc.nextLine();
                    EmployeeManagement.searchByName(name);
                    break;
                case 3:
                    EmployeeManagement.displayEmployee();
                    break;
            }
        }
    }
}
