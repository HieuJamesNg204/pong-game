package evaluation;

import java.awt.*;

public class Score extends Rectangle {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    private int player1;
    private int player2;

    public Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public int getPlayer1() {
        return player1;
    }

    public int getPlayer2() {
        return player2;
    }

    public void giveOnePoint(int playerId) {
        if (playerId == 1) {
            player1++;
        } else {
            player2++;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));

        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);

        g.drawString(
                String.valueOf(player1 / 10) + String.valueOf(player1 % 10),
                (GAME_WIDTH / 2) - 85, 50
        );
        g.drawString(
                String.valueOf(player2 / 10) + String.valueOf(player2 % 10),
                (GAME_WIDTH / 2) + 20, 50
        );
    }
}