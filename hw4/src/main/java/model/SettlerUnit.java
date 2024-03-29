package model;

/**
 * Represents a Settler unit that can build a Settlement.
 *
 * @version 1.0
 * @author Jim Harris
 */
class SettlerUnit extends Unit implements Convertable {

    private String townName;

    /**
     * Public constructor.
     *
     * @param owner the owner of this unit.
     * @param townName the name of the Settlement this unit will build.
     */
    public SettlerUnit(Civilization owner, String townName) {
        super(owner);
        this.townName = townName;
    }

    @Override
    public Building convert() {
        getOwner().incrementNumSettlements();
        return getOwner().getSettlement(townName);
    }

    @Override
    public boolean canConvert(TileType type) {
        return type == TileType.PLAINS;
    }

    @Override
    public char symbol() {
        return 's';
    }

    @Override
    public String toString() {
        return "Settlers of " + townName + ". " + super.toString();
    }
}
