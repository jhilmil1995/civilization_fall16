public class TestPopulation {
    public static void main(String[] args) {
        Population population = new Population();
        System.out.println(population.getWarriors());
        System.out.println(population.getCivilians());
        System.out.println(population.getHappiness());
        population.increaseHappiness(10);
        System.out.println(population.getHappiness());
        population.decreaseHappiness(200);
        System.out.println(population.getHappiness());
        population.decreaseHappiness(30);
        System.out.println(population.getHappiness());
        population.canWork(10);
        System.out.println(population.getCivilians());
        population.canBattle();
        System.out.println(population.getWarriors());
        System.out.println("shalala");
        Hills h = new Hills();
        Game g = population.hunt(h);
        System.out.println(g.getHealth());
        River r = new River("river");
        Fish f = population.fish(r);
        System.out.println(f.getHealth());
        CoalMine c = new CoalMine();
        System.out.println(c.getCoal());
        System.out.println(population.canCook(g,c));
        System.out.println(c.getCoal());
        System.out.println(population.canCook(f,c));
        c.increaseCoal(20);
        System.out.println(c.getCoal());
        System.out.println(population.canCook(g,c));
        System.out.println(c.getCoal());
        System.out.println(population.canCook(f,c));
        c.increaseCoal(40);
        System.out.println(c.getCoal());
        System.out.println(population.canCook(f,c));
        System.out.println(c.getCoal());
    }
}