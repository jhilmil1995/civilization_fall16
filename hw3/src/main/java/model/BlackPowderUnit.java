package model;

public class BlackPowderUnit extends SiegeUnit {

    public BlackPowderUnit(Civilization owner) {
        super(owner);
    }

    //need to fix
    @Override
    public void battle(MapObject o) {
        o.damage(this.getDamage());
        /*if (!o.isDestroyed()
            && (o instanceof HybridUnit || o instanceof BlackPowderUnit)) {
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
        return 'B';
    }

    @Override
    public String toString() {
        return "BlackPowder Unit. " + super.toString();
    }
}
