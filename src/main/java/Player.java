import java.util.Scanner;

public class Player {
    private String name;
    protected int score;
    protected Reader reader;

    public Player(String name, Reader reader) {
        this.name = name;
        this.score = 0;
        this.reader = reader;
    }

    public void addCoins(int coins) {
        this.score+=coins;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return score;
    }

    public boolean chooseToCooperate() {
        return reader.isChoiceCooperative();
    }

    public void subtractCoins(int coins) {
        this.score-=coins;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

}
