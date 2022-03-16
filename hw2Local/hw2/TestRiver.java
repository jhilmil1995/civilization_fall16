public class TestRiver {
    public static void main(String[] args) {
        River river = new River("rrrrr");
        System.out.println(river.getName());
        Fish f = river.getFish();
        System.out.println(f.getHealth());
        System.out.println(river.replenishFish());
        Fish f1 = river.getFish();
        System.out.println(f1.getHealth());
        System.out.println(river.replenishFish());
        Fish f2 = river.getFish();
        System.out.println(f2.getHealth());
        System.out.println(river.replenishFish());
        Fish f3 = river.getFish();
        System.out.println(f3.getHealth());
        System.out.println(river.replenishFish());
        Fish f4 = river.getFish();
        System.out.println(f4.getHealth());
        System.out.println(river.replenishFish());
        Fish f5 = river.getFish();
        System.out.println(f5.getHealth());
        System.out.println(river.replenishFish());
    }
}
        