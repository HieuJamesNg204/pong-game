import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class GameFrame extends JFrame {
    GamePanel panel;

    public GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Image icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pong-icon.png")))
                .getImage();
        this.setIconImage(icon);
    }
}