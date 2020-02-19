import javax.swing.*;
import java.net.*;
import java.io.*;
import java.awt.*;

public class werwolf extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 7815814534460942224L;

    public werwolf() {
        initUI();
    }

    private void initUI() {
        add(new board());
        setSize(500, 500);
        setTitle("Werwolf");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            werwolf cl = new werwolf();
            cl.setVisible(true);
        });
    }
}



