package model;
//import java.util.Random;

class QinDynasty extends Civilization {
    /*private static Random rand = new Random();

    private String name;

    private Technology technology = new Technology();
    private Strategy strategy = new Strategy();

    private int numSettlements;

    private Treasury treasury = new Treasury(50);
    private int food = 50;
    private int resources = 50;
    private int happiness = 50;
    */
    private Hills hills = new Hills();

    public QinDynasty() {
        super("Qin Dynasty");
        //this.name = name;
    }

    public Hills getHills() {
        return hills;
    }

    @Override
    public String explore() {
        Game gameFound = hills.hunt();
        if (gameFound == null) {
            System.out.println("Unfortunately, it looks like all the Wild "
                + "Game has left this terrain.\n No fear, though! The "
                + "terrain will replenish itself soon enough.\n");
            String replenished = (hills.replenishGame()) ? "Success! We "
                + "found more Wild Game!\n" : "You can only replenish Game"
                + " once all other Game has been hunted.\n";
            return replenished;
        } else {
            int h = gameFound.getHealth();
            makeFood(getFood() + h);
            return "You explore your surroundings and acquire " + h + " food!";
        }
        //resources += rand.nextInt(20);
        //return "You explore your surroundings and acquire 20 resources!";
    }

    @Override
    public SiegeUnit getSiegeUnit() {
        return new BlackPowderUnit(this);
    }

    @Override
    public Landmark getLandmark() {
        return new GreatWall(this);
    }
    /*
    public String getName() {
        return this.name;
    }

    public int getNumSettlements() {
        return numSettlements;
    }

    public void incrementNumSettlements() {
        numSettlements++;
    }

    public void decrementNumSettlements() {
        numSettlements--;
    }

    public Treasury getTreasury() {
        return treasury;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public Technology getTechnology() {
        return technology;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public int getFood() {
        return this.food;
    }

    public int getResources() {
        return this.resources;
    }

    public void eat(int foodAmount) {
        this.food -= foodAmount;
    }

    public void makeFood(int foodAmount) {
        this.food += foodAmount;
    }

    public void dockResources(int resourceAmount) {
        this.resources -= resourceAmount;
    }

    public void produceResources(int resourceAmount) {
        this.resources += resourceAmount;
    }

    public void dockHappiness(int happinessAmount) {
        this.happiness -= happinessAmount;
    }

    public void increaseHappiness(int happinessAmount) {
        this.happiness += happinessAmount;
    }

    public MeleeUnit getMeleeUnit() {
        return new MeleeUnit(this);
    }

    public RangedUnit getRangedUnit() {
        return new RangedUnit(this);
    }

    public HybridUnit getHybridUnit() {
        return new HybridUnit(this);
    }

    public SiegeUnit getSiegeUnit() {
        return new SiegeUnit(this);
    }

    public SettlerUnit getSettlerUnit(String settlementName) {
        return new SettlerUnit(this, settlementName);
    }

    public AnglerUnit getAnglerUnit() {
        return new AnglerUnit(this);
    }

    public CoalMinerUnit getCoalMinerUnit() {
        return new CoalMinerUnit(this);
    }

    public FarmerUnit getFarmerUnit() {
        return new FarmerUnit(this);
    }

    public MasterBuilderUnit getMasterBuilderUnit() {
        return new MasterBuilderUnit(this);
    }

    public Settlement getSettlement(String settlementName) {
        return new Settlement(this, settlementName);
    }

    public FishingShack getFishingShack() {
        return new FishingShack(this);
    }

    public CoalMine getCoalMine() {
        return new CoalMine(this);
    }

    public Farm getFarm() {
        return new Farm(this);
    }

    public Landmark getLandmark() {
        return new Landmark(this);
    }
    */
}
