public abstract class Player {
    private String name;
    protected int score;
    protected Strategy strategy;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.score = 0;
        this.strategy = strategy;
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
        return strategy.isChoiceCooperative();
    }

    public void subtractCoins(int coins) {
        this.score-=coins;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
