public class Game {
    private int healthIncrease;

    public Game(int h) {
        this.healthIncrease = h;
    }

    public Game() {
        this(20);
    }

    public int getHealth() {
        return healthIncrease;
    }
}
