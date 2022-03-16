package model;

public class LegionUnit extends MeleeUnit {

    public LegionUnit(Civilization owner) {
        super(owner);
    }

    @Override
    public void battle(MapObject o) {
        o.damage((int) (this.getDamage() * 1.5));
        if (!o.isDestroyed() && o instanceof LegionUnit) {
            damage((int) (((MilitaryUnit) o).getDamage() * 1.5));
        }
    }

    @Override
    public char symbol() {
        return 'L';
    }

    @Override
    public String toString() {
        return "Legion Unit. " + super.toString();
    }
}
