import java.awt.event.*;
import javax.swing.*;

public class GuiApp {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("GUI App");
        JLabel label = new JLabel("Hi,Welcome!", SwingConstants.CENTER);
        label.setBounds(50, 40, 200, 30);

        JButton button = new JButton("Click Me");
        button.setBounds(90, 90, 120, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You clicked me!");
            }
        });

        frame.add(label);
        frame.add(button);

        frame.setSize(300, 200);
        frame.setLayout(null);  // Use absolute positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
