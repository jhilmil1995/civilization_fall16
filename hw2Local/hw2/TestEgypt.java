public class TestEgypt {
    public static void main(String[] args) {
        Egypt egypt = new Egypt();
        System.out.println(egypt.getPopulation().getHappiness());
        System.out.println(egypt.getPopulation().getCivilians());
        System.out.println(egypt.getPopulation().getWarriors());
        System.out.println(egypt.getTreasury().getCoins());
        System.out.println(egypt.getCoalMine().getCoal());
        System.out.println(egypt.getCoalMine().getBurnCost());
        System.out.println("next set");
        System.out.println(egypt.getRiver().getName());
        Fish f = egypt.getRiver().getFish();
        System.out.println(egypt.getRiver().getFish().getHealth());
        System.out.println(egypt.getTechnology().getUnderstanding());
        System.out.println(egypt.getTechnology().hasTechnologyWin());
        System.out.println(egypt.getTechnology().getBuildExperience());
        System.out.println(egypt.getStrategy().getStrategyLevel());
        System.out.println(egypt.getStrategy().conqueredTheWorld());
        System.out.println("next set");
        Settlement[] settlements = egypt.getSettlements();
        System.out.println(settlements.length);
        System.out.println(egypt.getNumSettlements());
        Settlement s = new Settlement("settlement name");
        System.out.println(egypt.settle(s));
        System.out.println(settlements[0].getName());
        System.out.println(settlements[0].getNumBuildings());
        System.out.println(settlements[0].getSizeOfBuildings());
        System.out.println(settlements[0].build(100,new Population(), 5, 5));
        System.out.println(settlements[0].getNumBuildings());
        System.out.println(settlements[0].getSizeOfBuildings());
        Desert d = egypt.getDesert();
        System.out.println(d.findTreasure());
        System.out.println(egypt.getNumSettlements());
        System.out.println("next set");
        System.out.println(egypt.buildPyramid(s));
        System.out.println(egypt.getTreasury().getCoins());
        egypt.getTreasury().earn(200,200);
        System.out.println(egypt.getTreasury().getCoins());
        System.out.println(egypt.buildPyramid(s));
        System.out.println(egypt.getPopulation().getHappiness());
        System.out.println(egypt.getTechnology().getUnderstanding());
        egypt.practiceHieroglyphics(s);
        System.out.println(egypt.getPopulation().getHappiness());
        System.out.println(egypt.getTechnology().getUnderstanding());
    }
}