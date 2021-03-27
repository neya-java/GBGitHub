import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        new MyWindow();
    }
}

class MyWindow  extends JFrame {
    public MyWindow(){

        setTitle("Моё окно");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(500, 150, 1024, 768);

        setVisible(true);

    }
}
