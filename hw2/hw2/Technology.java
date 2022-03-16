public class Technology {
    private int understanding;
    private boolean foundMeaningOfLife;
    private int experienceLevel;
    private boolean builtWonderOfTheWorld;

    public Technology() {
        this.understanding = 0;
        this.foundMeaningOfLife = false;
        this.experienceLevel = 0;
        this.builtWonderOfTheWorld = false;
    }

    public void philosophize() {
        understanding += 25;
        if (understanding >= 200) {
            foundMeaningOfLife = true;
        }
    }

    public void improveWriting() {
        understanding += 10;
        if (understanding >= 200) {
            builtWonderOfTheWorld = true;
        }
    }

    public void increaseExperience(int e) {
        experienceLevel += e;
        if (experienceLevel >= 200) {
            builtWonderOfTheWorld = true;
        }
    }

    public boolean hasTechnologyWin() {
        return (foundMeaningOfLife && builtWonderOfTheWorld);
    }

    public int getUnderstanding() {
        return understanding;
    }

    public int getBuildExperience() {
        return experienceLevel;
    }
}
