package model;

public class MasterBuilderUnit extends Unit implements Convertable {

    public MasterBuilderUnit(Civilization owner) {
        super(owner);
    }

    public Building convert() {
        return (this.getOwner().getLandmark());
    }

    public boolean canConvert(TileType type) {
        return type.getSymbol() == 'P' && type.getName().equals("Plains")
            && type.getCost() == 1;
    }

    @Override
    public char symbol() {
        return 'm';
    }

    @Override
    public String toString() {
        return "MasterBuilders. " + super.toString();
    }
}
