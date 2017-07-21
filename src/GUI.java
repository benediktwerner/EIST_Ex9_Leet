import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JSeparator;

public class GUI {

    private JFrame frame;
    private JTextArea txtNormal;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e1) {
            e1.printStackTrace();
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI window = new GUI();
                    window.frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 641, 436);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        txtNormal = new JTextArea();
        txtNormal.setBounds(10, 35, 290, 301);
        frame.getContentPane().add(txtNormal);

        JTextArea txtLeet = new JTextArea();
        txtLeet.setBounds(322, 35, 290, 301);
        frame.getContentPane().add(txtLeet);

        JLabel lblNormal = new JLabel("Normal");
        lblNormal.setBounds(10, 10, 92, 14);
        frame.getContentPane().add(lblNormal);

        JLabel lblLeet = new JLabel("Leet");
        lblLeet.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLeet.setBounds(520, 10, 92, 14);
        frame.getContentPane().add(lblLeet);

        JButton btnToLeet = new JButton("To Leet");
        btnToLeet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNormal.setText(txtNormal.getText().toLowerCase());
                String leetText = LeetTranslator.translateToLeet(txtNormal.getText());
                txtLeet.setText(leetText);
            }
        });
        btnToLeet.setBounds(10, 347, 113, 35);
        frame.getContentPane().add(btnToLeet);

        JButton btnToNormal = new JButton("To Normal");
        btnToNormal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String normalText = LeetTranslator.translateFromLeet(txtLeet.getText());
                txtNormal.setText(normalText);
            }
        });
        btnToNormal.setBounds(471, 347, 141, 35);
        frame.getContentPane().add(btnToNormal);

        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBounds(310, 35, 2, 301);
        frame.getContentPane().add(separator);
    }
}
