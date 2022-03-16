import java.util.Random;

public class River {
    private static Random randomGenerator = new Random();
    private String name;
    private Fish[] fishes;

    public River(String n) {
        name = n;
        fishes = new Fish[5];
        for (int i = 0; i < fishes.length; i++) {
            fishes[i] = new Fish(randomGenerator.nextInt(5));
        }
    }

    public boolean replenishFish() {
        for (int i = 0; i < fishes.length; i++) {
            if (fishes[i] != null) {
                return false;
            }
        }
        for (int i = 0; i < fishes.length; i++) {
            fishes[i] = new Fish(randomGenerator.nextInt(5));
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public Fish getFish() {
        Fish fishToReturn = null;
        for (int i = 0; i < fishes.length; i++) {
            if (fishes[i] != null) {
                fishToReturn = fishes[i];
                fishes[i] = null;
                return fishToReturn;
            }
        }
        replenishFish();
        return fishToReturn;
    }
}
