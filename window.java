import javax.swing.JFrame;

public class window{
    public static void main(String[] args){
        JFrame frame = new JFrame("Simple Window");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}