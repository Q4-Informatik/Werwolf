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
            werwolf prg = new werwolf();
            prg.setVisible(true);
        });
        client cl = new client();
        cl.close();
    }
}

    class client {
        private static void connect(String[] args) {
            String serverName = args[0];
            int port = Integer.parseInt(args[1]);
            try {
                System.out.println("Connecting to " + serverName + "at" + port);
                Socket s = new Socket(serverName, port);

                System.out.println("Connected to " + s.getRemoteSocketAddress());
                OutputStream outToServer = s.getOutputStream();
                DataOutputStream out = new DataOutputStream(outToServer);

                InputStream inFromServer = s.getInputStream();
                DataInputStream in = new DataInputStream(inFromServer);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void close() {
            client.close();
        }
}




