import java.util.ArrayList;
import java.util.Scanner;

/**
 * Equipment Rental System
 * 
 * a) This program allows customers to manage equipment rentals, including adding,
 * editing, deleting, and searching records for both equipment and customers. 
 * b) It also supports renting, returning, delivering, and picking up equipment in text console
 */

public class EquipmentRentalSystem {
    // set
    static ArrayList<Equipment> equipmentList = new ArrayList<>();
    static ArrayList<Customer> customerList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewRecord(scanner);
                    break;
                case 2:
                    editDeleteRecord(scanner);
                    break;
                case 3:
                    searchRecords(scanner);
                    break;
                case 4:
                    rentEquipment(scanner);
                    break;
                case 5:
                    returnEquipment(scanner);
                    break;
                case 6:
                    deliverEquipment(scanner);
                    break;
                case 7:
                    pickupEquipment(scanner);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    // First Menu edit if needed
    public static void printMenu() {
        System.out.println("=== Equipment Rental System ===");
        System.out.println("1. Add New Record");
        System.out.println("2. Edit/Delete Record");
        System.out.println("3. Search Records");
        System.out.println("4. Rent Equipment");
        System.out.println("5. Return Equipment");
        System.out.println("6. Deliver Equipment");
        System.out.println("7. Pickup Equipment");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    // Second Menu no functionality yet
    public static void addNewRecord(Scanner scanner) {
        System.out.println("Add New Record");
        System.out.println("1. Add Equipment");
        System.out.println("2. Add customer");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter equipment name: ");
                String equipmentName = scanner.nextLine();
                System.out.print("Enter equipment serial number: ");
                String serialNumber = scanner.nextLine();
                equipmentList.add(new Equipment(equipmentName, serialNumber));
                System.out.println("Equipment added.");
                break;
            case 2:
                System.out.print("Enter customer name: ");
                String customerName = scanner.nextLine();
                System.out.print("Enter customer ID: ");
                String customerId = scanner.nextLine();
                customerList.add(new Customer(customerName, customerId));
                System.out.println("customer added.");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    // Third Menu skeleton will add implementation later
    public static void editDeleteRecord(Scanner scanner) {
        System.out.println("Edit/Delete Record");
        System.out.println("1. Edit Equipment");
        System.out.println("2. Edit customer");
        System.out.println("3. Delete Equipment");
        System.out.println("4. Delete customer");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter equipment serial number to edit: ");
                String editSerialNumber = scanner.nextLine();
                System.out.println("Equipment edited.");
                break;
            case 2:
                System.out.print("Enter customer ID to edit: ");
                String editcustomerId = scanner.nextLine();
                System.out.println("customer edited.");
                break;
            case 3:
                System.out.print("Enter equipment serial number to delete: ");
                String deleteSerialNumber = scanner.nextLine();
                System.out.println("Equipment deleted.");
                break;
            case 4:
                System.out.print("Enter customer ID to delete: ");
                String deletecustomerId = scanner.nextLine();
                System.out.println("customer deleted.");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    // Scanner to search records
    public static void searchRecords(Scanner scanner) {
        System.out.println("Search Records");
        System.out.println("1. Search Equipment");
        System.out.println("2. Search customer");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter equipment serial number to search: ");
                String serial = scanner.nextLine();
                System.out.println("Equipment found.");
                break;
            case 2:
                System.out.print("Enter customer ID to search: ");
                String customerId = scanner.nextLine();
                System.out.println("customer found.");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    // Rent equipment not functional yet
    public static void rentEquipment(Scanner scanner) {
        System.out.println("Rent Equipment");
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter equipment serial number: ");
        String serialNumber = scanner.nextLine();
        System.out.println("Equipment rented.");
    }
    // Again needs implementation
    public static void returnEquipment(Scanner scanner) {
        System.out.println("Return Equipment");
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter equipment serial number: ");
        String serialNumber = scanner.nextLine();
        System.out.println("Equipment returned.");
    }
    // Not functional yet
    public static void deliverEquipment(Scanner scanner) {
        System.out.println("Deliver Equipment");
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter equipment serial number: ");
        String serialNumber = scanner.nextLine();
        System.out.println("Equipment delivered.");
    }
    // Not functional yet
    public static void pickupEquipment(Scanner scanner) {
        System.out.println("Pickup Equipment");
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter equipment serial number: ");
        String serialNumber = scanner.nextLine();
        System.out.println("Equipment picked up.");
    }
}