public class TestTechnology {
    public static void main(String[] args) {
        Technology technology = new Technology();
        System.out.println(technology.getUnderstanding());
        technology.philosophize();
        System.out.println(technology.getUnderstanding());
        technology.improveWriting();
        System.out.println(technology.getUnderstanding());
        System.out.println(technology.hasTechnologyWin());
        System.out.println("building");
        System.out.println(technology.getBuildExperience());
        technology.increaseExperience(100);
        System.out.println(technology.getBuildExperience());
        System.out.println(technology.hasTechnologyWin());
        technology.increaseExperience(200);
        System.out.println(technology.getBuildExperience());
        System.out.println(technology.hasTechnologyWin());
        technology.philosophize();
        technology.philosophize();
        technology.philosophize();
        technology.philosophize();
        technology.philosophize();
        technology.philosophize();
        technology.philosophize();
        technology.philosophize();
        System.out.println(technology.getUnderstanding());
        System.out.println(technology.hasTechnologyWin());
    }
}
        