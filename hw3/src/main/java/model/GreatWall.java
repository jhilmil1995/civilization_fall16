package model;

class GreatWall extends Landmark {

    public GreatWall(Civilization owner) {
        super(owner);
    }

    //need to fix
    @Override
    public void invest() {
        setTechPointGeneration(getTechPointGeneration() - 2);
        //setPhilosophyGeneration(getPhilosophyGeneration() + 10);
        this.getOwner().getStrategy().battle();
    }

    @Override
    public String toString() {
        return "GreatWall. " + super.toString();
    }
}
