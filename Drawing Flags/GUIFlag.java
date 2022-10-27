import javax.swing.*;
import java.awt.*;

public class GUIFlag{
    public static void main(String[] args){
        JFrame theGUI = new JFrame();
        theGUI.setTitle("Gui Window 4");
        theGUI.setSize(300, 200);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.black);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.yellow);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.red);
        Container pane = theGUI.getContentPane();
        pane.setLayout(new GridLayout(1, 3));
        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);
        theGUI.setVisible(true);
    }
}