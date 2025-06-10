
import javax.swing.*;

public class HelloWorldForm1 extends JFrame {
    public HelloWorldForm1() {
        setTitle("Hello World Form 1");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World Form 1");
        add(label);
        setVisible(true);
    }
}
