import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("GridLayout Example");

        f.setLayout(new GridLayout(2, 3));

        f.add(new JButton("One"));
        f.add(new JButton("Two"));
        f.add(new JButton("Three"));
        f.add(new JButton("Four"));
        f.add(new JButton("Five"));
        f.add(new JButton("Six"));

        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}