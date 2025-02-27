import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class window{
    public static void main(String[] args){
        JFrame frame = new JFrame("WE WINDOWS");
        JPanel panel = new JPanel();
        String[] items = {"WE", "WIN", "DOWS"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        panel.add(comboBox);
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}