public class Settlement {
    private String name;
    private Building[] buildings;
    private int numBuilding;

    public Settlement(String s) {
        this.name = s;
        buildings = new Building[1];
        numBuilding = 0;
    }

    public void addBuilding(Building b) {
        if (buildings.length == numBuilding) {
            expandSettlement();
        }
        buildings[numBuilding] = b;
        numBuilding++;
    }

    public boolean build(int allottedMoney,
           Population population, int cost, int workersRequired) {
        if ((allottedMoney > cost)
                && (population.getCivilians() >= workersRequired)) {
            population.canWork(workersRequired);
            addBuilding(new Building(cost, workersRequired));
            return true;
        }
        return false;
    }

    public void expandSettlement() {
        Building[] tempBuilding = new Building[buildings.length * 2];
        for (int i = 0; i < buildings.length; i++) {
            tempBuilding[i] = buildings[i];
        }
        buildings = tempBuilding;
    }

    public String getName() {
        return name;
    }

    public int getNumBuildings() {
        return numBuilding;
    }

    public int getSizeOfBuildings() {
        return buildings.length;
    }
}
