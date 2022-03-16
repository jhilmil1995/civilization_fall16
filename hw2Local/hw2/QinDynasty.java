public class QinDynasty {
    private Population population;
    private Treasury treasury;
    private CoalMine coalMine;
    private River river;
    private Technology technology;
    private Strategy strategy;
    private Settlement[] settlement;
    private int numSettlement;
    private Hills hills;

    public QinDynasty() {
        population = new Population();
        treasury = new Treasury();
        coalMine = new CoalMine();
        river = new River("Qin Dynasty River");
        technology = new Technology();
        strategy = new Strategy();
        settlement = new Settlement[10];
        numSettlement = 0;
        hills = new Hills();
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

    public boolean buildWall(Settlement s) {
        if ((treasury.spend(1000)) && (population.getCivilians() > 100)) {
            population.canWork(100);
            technology.increaseExperience(10);
            return true;
        }
        return false;
    }

    public boolean buildHouse(Settlement s) {
        if ((treasury.spend(30)) && (population.getCivilians() > 8)) {
            population.canWork(8);
            technology.increaseExperience(10);
            return true;
        }
        return false;
    }

    public boolean establishLegalism() {
        if (population.getHappiness() >= 20) {
            population.decreaseHappiness(20);
            technology.philosophize();
            return true;
        }
        return false;
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

    public Hills getHills() {
        return hills;
    }
}
