import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;

public class window{
    public static void main(String[] args){
        JFrame frame = new JFrame("WE WINDOWS"); //Where to set title of window
        JPanel panel = new JPanel();
        String[] items = {"WE", "WIN", "DOWS"}; //Ok but actually this is where the entities will go
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dropdown.update(e, (String) comboBox.getSelectedItem()); 
            }
        });
        panel.add(comboBox);
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}