import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExceptionDivision extends JFrame implements ActionListener {
    private JTextField tf1, tf2, tf3;
    private JLabel l;
    private JButton btn;

    public ExceptionDivision() {
        super("Integer Division");
        GridLayout gl = new GridLayout(4, 2);
      setLayout(gl);

        l = new JLabel("Enter Value 1");
        add(l);
        tf1 = new JTextField();
        tf1.addActionListener(this);
        add(tf1);

        l = new JLabel("Enter Value 2");
        add(l);
        tf2 = new JTextField();
        tf2.addActionListener(this);
        add(tf2);

        l = new JLabel("Result");
        add(l);
        tf3 = new JTextField();
        tf3.addActionListener(this);
        add(tf3);

        l = new JLabel();
        add(l);
        btn = new JButton("DIVIDE");
        btn.addActionListener(this);
        add(btn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400, 400);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String cc = ae.getActionCommand();
        if (!cc.equals("")) {
            tf3.setText("");
            try {
                int v1 = Integer.parseInt(tf1.getText());
                int v2 = Integer.parseInt(tf2.getText());

                int result = v1 / v2;
                String output = "Division is: " + result;
                tf3.setText("Division is:" + String.valueOf(result));
                JOptionPane.showMessageDialog(this, output, "OUTPUT", JOptionPane.PLAIN_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new ExceptionDivision();
    }
}