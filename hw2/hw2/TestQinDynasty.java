public class TestQinDynasty {
    public static void main(String[] args) {
        QinDynasty qinDynasty = new QinDynasty();
        System.out.println(qinDynasty.getPopulation().getHappiness());
        System.out.println(qinDynasty.getPopulation().getCivilians());
        System.out.println(qinDynasty.getPopulation().getWarriors());
        System.out.println(qinDynasty.getTreasury().getCoins());
        System.out.println(qinDynasty.getCoalMine().getCoal());
        System.out.println(qinDynasty.getCoalMine().getBurnCost());
        System.out.println("next set");
        System.out.println(qinDynasty.getRiver().getName());
        Fish f = qinDynasty.getRiver().getFish();
        System.out.println(qinDynasty.getRiver().getFish().getHealth());
        System.out.println(qinDynasty.getTechnology().getUnderstanding());
        System.out.println(qinDynasty.getTechnology().hasTechnologyWin());
        System.out.println(qinDynasty.getTechnology().getBuildExperience());
        System.out.println(qinDynasty.getStrategy().getStrategyLevel());
        System.out.println(qinDynasty.getStrategy().conqueredTheWorld());
        System.out.println("next set");
        Settlement[] settlements = qinDynasty.getSettlements();
        System.out.println(settlements.length);
        System.out.println(qinDynasty.getNumSettlements());
        Settlement s = new Settlement("settlement name");
        System.out.println(qinDynasty.settle(s));
        System.out.println(settlements[0].getName());
        System.out.println(settlements[0].getNumBuildings());
        System.out.println(settlements[0].getSizeOfBuildings());
        System.out.println(settlements[0].build(100,new Population(), 5, 5));
        System.out.println(settlements[0].getNumBuildings());
        System.out.println(settlements[0].getSizeOfBuildings());
        System.out.println(qinDynasty.getNumSettlements());
        System.out.println("next set");
        System.out.println(qinDynasty.getTreasury().getCoins());
        System.out.println(qinDynasty.getPopulation().getCivilians());
        System.out.println(qinDynasty.buildHouse(s));
        System.out.println(qinDynasty.getTreasury().getCoins());
        System.out.println(qinDynasty.getPopulation().getCivilians());
    }
}