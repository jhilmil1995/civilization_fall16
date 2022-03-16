public class TestSettlement {
    public static void main(String[] args) {
        Settlement settlement = new Settlement("SettlementName");
        System.out.println(settlement.getName());
        System.out.println(settlement.getNumBuildings());
        System.out.println(settlement.build(100, new Population() , 500, 10));
        System.out.println(settlement.getNumBuildings());
        System.out.println(settlement.build(100, new Population() , 50, 100));
        System.out.println(settlement.getNumBuildings());
        System.out.println(settlement.build(100, new Population() , 50, 10));
        System.out.println(settlement.getNumBuildings());
        System.out.println(settlement.getSizeOfBuildings());
        System.out.println(settlement.build(100, new Population() , 50, 10));
        System.out.println(settlement.getNumBuildings());
        System.out.println(settlement.getSizeOfBuildings());
        System.out.println(settlement.build(100, new Population() , 50, 10));
        System.out.println(settlement.getNumBuildings());
        System.out.println(settlement.getSizeOfBuildings());
    }
}
        