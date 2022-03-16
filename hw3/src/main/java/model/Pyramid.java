package model;

class Pyramid extends Landmark {

    public Pyramid(Civilization owner) {
        super(owner);
    }

    @Override
    public void invest() {
        setTechPointGeneration(getTechPointGeneration() - 2);
        setPhilosophyGeneration(getPhilosophyGeneration() + 25);
    }

    @Override
    public String toString() {
        return "Pyramid. " + super.toString();
    }
}
