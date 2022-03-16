public class TestGame {
    public static void main(String[] args) {
        Game game1 = new Game();
        System.out.println(game1.getHealth());
        Game game2 = new Game(400);
        System.out.println(game2.getHealth());
    }
}
        