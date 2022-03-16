package model;

public class SiegeUnit extends MilitaryUnit {

    public SiegeUnit(Civilization owner) {
        super(200, owner, 5, 10, 14, 5, 10, 60);
    }

    //need to fix
    @Override
    //public void battle(Building b)
    public void battle(MapObject o) {
        //b.demolish();
        if (o instanceof Building) {
            o.damage(this.getDamage());
        }
        /*if (!o.isDestroyed()
            && (o instanceof HybridUnit || o instanceof SiegeUnit)) {
            damage(((MilitaryUnit) o).getDamage());
        }*/
    }

    //need to fix
    @Override
    public void attack(MapObject object) {
        object.getOwner().getStrategy().siege();
        battle(object);
        setCanAttack(false);
    }

    @Override
    public char symbol() {
        return 'S';
    }

    @Override
    public String toString() {
        return "Siege Unit. " + super.toString();
    }
}
