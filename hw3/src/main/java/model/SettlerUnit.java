package model;

public class SettlerUnit extends Unit implements Convertable {
    private String townName;

    public SettlerUnit(Civilization owner, String settlementName) {
        super(owner);
        this.townName = settlementName;
    }

    public Building convert() {
        this.getOwner().incrementNumSettlements();
        return (this.getOwner().getSettlement(townName));
    }

    public boolean canConvert(TileType type) {
        return type.getSymbol() == 'P' && type.getName().equals("Plains")
            && type.getCost() == 1;
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
