package entity;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {
    private int id;
    private int yVelocity;
    private int speed = 10;

    public Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {
        if (id == 1) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                setYDirection(-speed);
                move();
            }

            if (e.getKeyCode() == KeyEvent.VK_S) {
                setYDirection(speed);
                move();
            }
        } else {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                setYDirection(-speed);
                move();
            }

            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                setYDirection(speed);
                move();
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        if (id == 1) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                setYDirection(0);
                move();
            }

            if (e.getKeyCode() == KeyEvent.VK_S) {
                setYDirection(0);
                move();
            }
        } else {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                setYDirection(0);
                move();
            }

            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                setYDirection(0);
                move();
            }
        }
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    public void move() {
        y += yVelocity;
    }

    public void draw(Graphics g) {
        if (id == 1) {
            g.setColor(Color.BLUE);
        } else {
            g.setColor(Color.RED);
        }

        g.fillRect(x, y, width, height);
    }
}