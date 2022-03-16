package model;

class Coliseum extends Landmark {

    public Coliseum(Civilization owner) {
        super(owner);
    }

    @Override
    public void invest() {
        setTechPointGeneration(getTechPointGeneration() - 2);
        setHappinessGeneration(getHappinessGeneration() + 50);
    }

    @Override
    public String toString() {
        return "Coliseum. " + super.toString();
    }
}
