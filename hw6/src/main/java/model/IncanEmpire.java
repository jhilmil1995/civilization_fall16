package model;

/**
 * Represents the Incan Empire civilization.
 *
 * @version 2.0
 * @author Angie Palm, Jim Harris
 */
public class IncanEmpire extends Civilization {
    private Desert desert = new Desert();

    /**
     * Public constructor.
     */
    public IncanEmpire() {
        super("Incan Empire");
    }

    @Override
    public String explore() {
        int gold = desert.findTreasure();
        getTreasury().earn(gold);
        return "You explore the desert and find " + gold + " gold!";
    }

    /**
     * @return this civilization's Desert.
     */
    public Desert getDesert() {
        return desert;
    }

    @Override
    public MeleeUnit getMeleeUnit() {
        return new LegionUnit(this);
    }

    @Override
    public SiegeUnit getSiegeUnit() {
        return new BlackPowderUnit(this);
    }

    @Override
    public RangedUnit getRangedUnit() {
        return new WarChariotUnit(this);
    }

    @Override
    public Landmark getLandmark() {
        return new Pyramid(this);
    }

}
