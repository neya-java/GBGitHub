import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("Моё окно");
        setBounds(600, 300, 600, 400);
        /*setLocation(700, 400);
        setSize(700, 400);*/

        JButton[] buttons =  new JButton[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton("#" + i);
            if(i == 0) {
                buttons[i] = new JButton("Вход");
            }
            if (i == 4) {
                buttons[i] = new JButton("Выход");
            }
        }

        JPanel panel = new JPanel(new GridLayout(1,2));
        add(panel,BorderLayout.SOUTH);
        panel.add(buttons[0]);
        panel.add(buttons[4]);

        ActionListener actionListener = new CloseActionListener();

        buttons[4].addActionListener(actionListener);

        /*setLayout(new BorderLayout());
        add(buttons[0], BorderLayout.EAST);
        add(buttons[1], BorderLayout.WEST);
        add(buttons[2], BorderLayout.SOUTH);
        add(buttons[3], BorderLayout.NORTH);
        add(buttons[4], BorderLayout.CENTER);*/
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
