import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;

public class window{
    public static void main(String[] args){
        JFrame frame = new JFrame("Warehouse Management System"); //Where to set title of window
        JPanel panel = new JPanel();
        String[] menuOptions = { "Warehouse", "Drones", "Customers", "Equipment", 
                "Rentals", "Purchase Orders", "Reviews", "Exit"}; //Ok but actually this is where the entities will go
        JComboBox<String> comboBox = new JComboBox<>(menuOptions);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dropdown.update(e, (String) comboBox.getSelectedItem()); 
                menuSelection(selected, frame);
            }
        });
        panel.add(comboBox);
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

private static void menuSelection(String selected, JFrame frame) {
	if (selected == null) return;

    switch (selected) {
        case "Warehouse":
        	//call to warehouse menu option
            break;
        case "Drones":
        	//call to drone menu option
            break;
        case "Customers":
        	//call to customer menu option
            break;
        case "Equipment":
            //call to equipment menu option
            break;
        case "Rentals":
        	//call to rentals menu option
            break;
        case "Purchase Orders":
        	//call to purchase order menu option
            break;
        case "Reviews":
        	//call to reviews menu option
            break;
        case "Exit":
            System.exit(0);
            break;
        default:
            JOptionPane.showMessageDialog(frame, "Option not implemented yet.");
    }
}
}