package model;

/**
 * Represents the Han Dynasty Civiization.
 *
 * @version 2.0
 * @author Angie Palm, Jim Harris
 */
public class HanDynasty extends Civilization {
    private Hills hills = new Hills();

    /**
     * Public constructor.
     */
    public HanDynasty() {
        super("Han Dynasty");
    }

    @Override
    public String explore() {
        int food = hills.hunt().getHealth();
        hills.replenishGame();
        makeFood(food);
        return "You go hunting and get " + food + " food!";
    }

    /**
     * @return the Hills for this Civilization.
     */
    public Hills getHills() {
        return hills;
    }

    @Override
    public Landmark getLandmark() {
        return new GreatWall(this);
    }
}
