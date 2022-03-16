public class TestStrategy {
    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        System.out.println(strategy.getStrategyLevel());
        strategy.battle();
        System.out.println(strategy.getStrategyLevel());
        strategy.siege();
        System.out.println(strategy.getStrategyLevel());
        System.out.println(strategy.conqueredTheWorld());
        strategy.siege();
        strategy.siege();
        strategy.siege();
        strategy.battle();
        System.out.println(strategy.getStrategyLevel());
        System.out.println(strategy.conqueredTheWorld());
    }
}
        