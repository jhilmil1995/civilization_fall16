public class Egypt {
    private Population population;
    private Treasury treasury;
    private CoalMine coalMine;
    private River river;
    private Technology technology;
    private Strategy strategy;
    private Settlement[] settlement;
    private int numSettlement;
    private Desert desert;

    public Egypt() {
        population = new Population();
        treasury = new Treasury();
        coalMine = new CoalMine();
        river = new River("Egyption River");
        technology = new Technology();
        strategy = new Strategy();
        settlement = new Settlement[10];
        numSettlement = 0;
        desert = new Desert();
    }

    public boolean settle(Settlement s) {
        for (int i = 0; i < settlement.length; i++) {
            if (settlement[i] == null) {
                settlement[i] = s;
                numSettlement++;
                return true;
            }
        }
        return false;
    }

    public boolean buildPyramid(Settlement s) {
        if ((treasury.spend(500)) && (population.getCivilians() > 100)) {
            population.canWork(100);
            technology.increaseExperience(10);
            return true;
        }
        return false;
    }

    public void practiceHieroglyphics() {
        technology.improveWriting();
        population.increaseHappiness(10);
    }

    public Population getPopulation() {
        return population;
    }

    public Treasury getTreasury() {
        return treasury;
    }

    public CoalMine getCoalMine() {
        return coalMine;
    }

    public River getRiver() {
        return river;
    }

    public Technology getTechnology() {
        return technology;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public Settlement[] getSettlements() {
        return settlement;
    }

    public int getNumSettlements() {
        return numSettlement;
    }

    public Desert getDesert() {
        return desert;
    }
}
