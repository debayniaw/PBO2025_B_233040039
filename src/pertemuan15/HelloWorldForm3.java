
import javax.swing.*;

public class HelloWorldForm3 extends JFrame {
    public HelloWorldForm3() {
        setTitle("Hello World Form 3");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World Form 3");
        add(label);
        setVisible(true);
    }
}
