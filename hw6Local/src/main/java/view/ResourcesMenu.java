package view;

import controller.GameController;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
//import model.Civilization;

public class ResourcesMenu {

    /**
    * creates a resource bar and display the current state of
    * your civilization's resouces
    */
    private int strategy = 0;
    private int resources = 0;
    private int settlement = 0;
    private int money = 0;
    private int food = 0;
    private int happiness = 0;
    private Text label1 = new Text("Strategy: " + strategy);
    private Text label2 = new Text("Resources: " + resources);
    private Text label3 = new Text("Settlement: " + settlement);
    private Text label4 = new Text("Money: " + money);
    private Text label5 = new Text("Food: " + food);
    private Text label6 = new Text("Happiness: " + happiness);

    private HBox listResources = new HBox(8, label1, label2, label3, label4,
        label5, label6);

    public ResourcesMenu() {
        //TODO
        //update();
    }
    /**
    * should update all the resouce values to the current
    * state of your resource values
    */
    public void update() {
        strategy = GameController.getCivilization().getStrategy().
            getStrategyLevel();
        resources = GameController.getCivilization().getResources();
        settlement = GameController.getCivilization().getNumSettlements();
        money = GameController.getCivilization().getTreasury().getCoins();
        food = GameController.getCivilization().getFood();
        happiness = GameController.getCivilization().getHappiness();
        label1 = new Text("Strategy: " + strategy);
        label2 = new Text("Resources: " + resources);
        label3 = new Text("Settlement: " + settlement);
        label4 = new Text("Money: " + money);
        label5 = new Text("Food: " + food);
        label6 = new Text("Happiness: " + happiness);
        listResources.getChildren().clear();
        listResources.getChildren().addAll(label1, label2, label3, label4,
            label5, label6);
    }
    /**
    * updates the resource bar and returns the resource bar
    * @return a hbox representation of the resource bar
    */
    public HBox getRootNode() {
        //TODO
        update();
        return listResources;
    }
}