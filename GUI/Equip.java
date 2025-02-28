import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Equip {
    // customer and Equip Struct
    static ArrayList<Equipment> equipmentList = new ArrayList<>();
    static ArrayList<customer> customerList = new ArrayList<>();

    // Create frame and panels
    static JFrame frame = new JFrame("Equipment Rental System");
    static JPanel panel = new JPanel();
    static JTextArea outputArea = new JTextArea(10, 40);

    public static void main(String[] args) {
        // Setup frame and panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        // Add components into the panel
        setupMenu(panel);

        // Scrollable output area
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.NORTH);
        frame.setVisible(true);
    }

    // Setup menu with buttons
    public static void setupMenu(JPanel panel) {
        // Create buttons
        JButton addEquipmentButton = new JButton("Add Equipment");
        JButton addcustomerButton = new JButton("Add customer");
        JButton rentEquipmentButton = new JButton("Rent Equipment");
        JButton returnEquipmentButton = new JButton("Return Equipment");

        // Add action listeners
        addEquipmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewEquipment();
            }
        });

        addcustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewcustomer();
            }
        });

        rentEquipmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rentEquipment();
            }
        });

        returnEquipmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnEquipment();
            }
        });

        // Add buttons to the ponel (might look blocky?)
        panel.add(addEquipmentButton);
        panel.add(addcustomerButton);
        panel.add(rentEquipmentButton);
        panel.add(returnEquipmentButton);
    }

    // Add new equipment method
    public static void addNewEquipment() {
        JTextField equipmentNameField = new JTextField(20);
        JTextField serialNumberField = new JTextField(20);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(new JLabel("Equipment Name:"));
        inputPanel.add(equipmentNameField);
        inputPanel.add(new JLabel("Serial Number:"));
        inputPanel.add(serialNumberField);

        int option = JOptionPane.showConfirmDialog(frame, inputPanel, "Add New Equipment", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String name = equipmentNameField.getText();
            String serialNumber = serialNumberField.getText();
            equipmentList.add(new Equipment(name, serialNumber));
            outputArea.append("Equipment added: " + name + " with Serial: " + serialNumber + "\n");
        }
    }

    // Add new customer method
    public static void addNewcustomer() {
        JTextField customerNameField = new JTextField(20);
        JTextField customerIdField = new JTextField(20);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(new JLabel("customer Name:"));
        inputPanel.add(customerNameField);
        inputPanel.add(new JLabel("customer ID:"));
        inputPanel.add(customerIdField);

        // Show input dialog -- ask for input same as text
        int option = JOptionPane.showConfirmDialog(frame, inputPanel, "Add New customer", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String name = customerNameField.getText();
            String customerId = customerIdField.getText();
            customerList.add(new customer(name, customerId));
            outputArea.append("customer added: " + name + " with customerID: " + customerId + "\n");
        }
    }

    // Rent equipment method
    public static void rentEquipment() {
        // These look odd maybe?
        JTextField customerIdField = new JTextField(20);
        JTextField equipmentSerialField = new JTextField(20);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(new JLabel("customer ID:"));
        inputPanel.add(customerIdField);
        inputPanel.add(new JLabel("Equipment Serial Number:"));
        inputPanel.add(equipmentSerialField);

        int option = JOptionPane.showConfirmDialog(frame, inputPanel, "Rent Equipment", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String customerId = customerIdField.getText();
            String serialNumber = equipmentSerialField.getText();
            outputArea.append("Equipment rented to customer " + customerId + " (Serial: " + serialNumber + ")\n");
        }
    }

    // Return equipment method
    public static void returnEquipment() {
        JTextField customerIdField = new JTextField(20);
        JTextField equipmentSerialField = new JTextField(20);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(new JLabel("customer ID:"));
        inputPanel.add(customerIdField);
        inputPanel.add(new JLabel("Equipment Serial Number:"));
        inputPanel.add(equipmentSerialField);

        int option = JOptionPane.showConfirmDialog(frame, inputPanel, "Return Equipment", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String customerId = customerIdField.getText();
            String serialNumber = equipmentSerialField.getText();
            outputArea.append("Equipment returned by customer " + customerId + " (Serial: " + serialNumber + ")\n");
        }
    }
}

// Split into new file if needed
class Equipment {
    String name;
    String serialNumber;

    Equipment(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Equipment [name=" + name + ", serialNumber=" + serialNumber + "]";
    }
}

// Split into new file if needed
class Customer {
    String name;
    String customerId;

    customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "customer [name=" + name + ", customerId=" + customerId + "]";
    }
}
