public class RomanEmpire {
    private Population population;
    private Treasury treasury;
    private CoalMine coalMine;
    private River river;
    private Technology technology;
    private Strategy strategy;
    private Settlement[] settlement;
    private int numSettlement;
    private Hills hills;

    public RomanEmpire() {
        population = new Population();
        treasury = new Treasury();
        coalMine = new CoalMine();
        river = new River("Roman Empire River");
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

    public boolean buildAqueduct(Settlement s) {
        if ((treasury.spend(250)) && (population.getCivilians() > 130)) {
            population.canWork(250);
            technology.increaseExperience(10);
            return true;
        }
        return false;
    }

    public boolean buildBathHouse(Settlement s) {
        if ((treasury.spend(110)) && (population.getCivilians() > 20)) {
            population.canWork(20);
            technology.increaseExperience(10);
            return true;
        }
        return false;
    }

    public boolean buildVilla(Settlement s) {
        if ((treasury.spend(80)) && (population.getCivilians() > 15)) {
            population.canWork(15);
            technology.increaseExperience(5);
            return true;
        }
        return false;
    }

    public boolean studyPhilosophy() {
        if (population.getHappiness() >= 10) {
            population.decreaseHappiness(10);
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
