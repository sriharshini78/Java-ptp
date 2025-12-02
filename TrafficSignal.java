import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficSignal extends JFrame implements ActionListener {
    JRadioButton rb;
    JLabel l;
    Panel p;
    int a = 0;

    TrafficSignal() {
        super("Traffic Lights Demo");
        BorderLayout bl = new BorderLayout();
        setLayout(bl);

        p = new Panel();
        add(p, bl.NORTH);

        GridBagLayout gb = new GridBagLayout();
        p.setLayout(gb);
        GridBagConstraints gc = new GridBagConstraints();

        gc.fill = GridBagConstraints.HORIZONTAL;
        String[] c = {"Red", "Yellow", "Green"};
        int x = 0, y = 0;
        ButtonGroup bg = new ButtonGroup();

        for (String s : c) {
            rb = new JRadioButton(s);
            rb.addActionListener(this);
            gc.gridx = x;
            gc.gridy = y;
            p.add(rb, gc);
            bg.add(rb);
            x++;
        }

        l = new JLabel("GET SET TO GO");
        p = new Panel();
        add(p, bl.SOUTH);
        p.add(l);

        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        String cc = ae.getActionCommand();

        if (cc.equals("Red")) {
            a = 1; repaint();
            l.setText("STOP !");
        } else if (cc.equals("Yellow")) {
            a = 2; repaint();
            l.setText("SLOW DOWN");
        } else {
            a = 3; repaint();
            l.setText("GO ---- >");
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(100, 105, 110, 270);

        g.setColor(Color.WHITE);
        g.fillOval(125, 150, 60, 60);
        g.fillOval(125, 230, 60, 60);
        g.fillOval(125, 300, 60, 60);

        switch (a) {
            case 1:
                g.setColor(Color.RED);
                g.fillOval(125, 150, 60, 60);
                break;

            case 2:
                g.setColor(Color.YELLOW);
                g.fillOval(125, 230, 60, 60);
                break;

            case 3:
                g.setColor(Color.GREEN);
                g.fillOval(125, 300, 60, 60);
                break;

            default:
                l.setText("GET SET GO");
        }
    }

    public static void main(String args[]) {
        new TrafficSignal();
    }
}