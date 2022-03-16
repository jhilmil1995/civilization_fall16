public class TestTreasury {
    public static void main(String[] args) {
        Treasury treasury = new Treasury();
        System.out.println(treasury.getCoins());
        System.out.println(treasury.spend(100));
        System.out.println(treasury.getCoins());
        System.out.println(treasury.spend(500));
        System.out.println(treasury.getCoins());
        treasury.earn(400, 300);
        System.out.println(treasury.getCoins());
    
        Treasury treasury2 = new Treasury();
        System.out.println(treasury2.getCoins());
    
    }
}
        