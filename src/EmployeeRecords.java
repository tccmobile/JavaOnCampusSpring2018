import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeRecords {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<EmployeeData> emplList = new ArrayList<EmployeeData>(); // Stores all employee data
        EmployeeData emplData;                                            // Stores info for one employee
        String userCommand = "";                                          // User defined add/print/quit command
        String emplFirstName = "";                                        // User defined employee first name
        String emplLastName = "";                                         // User defined employee last name
        Integer emplID = 0;                                               // User defined employee ID
        Integer deptNum = 0;                                              // User defined employee Dept
        int i = 0;                                                        // Loop counter

        do {
            // Prompt user for input
            System.out.println("Enter command ('a' to add new employee, 'p' to print all employees, 'q' to quit): ");
            userCommand = scnr.next();

            // Add new employee entry
            if (userCommand.equals("a")) {
                System.out.print("First Name: ");
                emplFirstName = scnr.next();
                System.out.print("Last Name: ");
                emplLastName = scnr.next();
                System.out.print("ID: ");
                emplID = scnr.nextInt();
                System.out.print("Department Number: ");
                deptNum = scnr.nextInt();
                emplData = new EmployeeData(emplFirstName, emplLastName, emplID, deptNum);
                emplList.add(emplData);
            }
            // Print all entries
            else if (userCommand.equals("p")) {

                // Sort employees by department number first
                // and name second
                Collections.sort(emplList);

                System.out.println("");
                System.out.println("Employees: ");
                // Access employee records
                for (i = 0; i < emplList.size(); ++i) {
                    System.out.println(emplList.get(i).toString());
                }
                System.out.println("");
            }
        } while (!userCommand.equals("q"));

        return;
    }
}