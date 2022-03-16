package view;

import controller.GameController;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
//import view.GridFX;
//import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
/**
 * This class represents the GameScreen class
 */
public class GameScreen extends BorderPane {


    /**
     * Creates a new view into the game. this layout should include
     * the rescource bar, grid map, and action menus
     *
     */
    private static ResourcesMenu resourcesMenu = new ResourcesMenu();
    private static AbstractMenu abstractMenu = new AbstractMenu();
    private static MilitaryMenu militaryMenu = new MilitaryMenu();
    private static WorkerMenu workerMenu = new WorkerMenu();
    private static RecruitMenu recruitMenu = new RecruitMenu();
    private static BuildingMenu buildingMenu = new BuildingMenu();
    private static VBox vbox = new VBox(10, abstractMenu.getRootNode());
    public GameScreen() {

        //TODO
        //abstractMenu = new AbstractMenu();
        update();
        GridPane gridPane = GridFX.getInstance();
        setCenter(gridPane);
        setTop(getResources().getRootNode());
        //setLeft(abstractMenu.getRootNode());
        //setLeft(new VBox(10, abstractMenu.getRootNode()));
        setLeft(vbox);
        //setRight(new Text (GameController.getCivilization().toString()));
    }

    /**
     * This method should update the gridfx and the resouce bar
     */
    public void update() {
        //TODO
        getResources().update();
        GridFX.update();
    }
    /**
    * this method should return the resource menu
    * @return reosuce menu
    */
    public static ResourcesMenu getResources() {
        //TODO
        //ResourcesMenu resourcesMenu = new ResourcesMenu();
        return resourcesMenu;
    }


    /**
     * This method switches menus based on passed in game state.
     * Game.java calls this to selectively control which menus are displayed
     * @param state
     */
    public static void switchMenu(GameController.GameState state) {
        //TODO
        //NEUTRAL, MILITARY, WORKER, BUILDING, RECRUITING, ATTACKING, MOVING;
        vbox.getChildren().clear();
        switch (state) {
        case MILITARY:
            //abstractMenu = new MilitaryMenu();
            vbox.getChildren().add(militaryMenu.getRootNode());
            //vbox = militaryMenu.getRootNode();
            break;
        case WORKER:
            //abstractMenu = new WorkerMenu();
            vbox.getChildren().add(workerMenu.getRootNode());
            break;
        case RECRUITING:
            //abstractMenu = new RecruitMenu();
            vbox.getChildren().add(recruitMenu.getRootNode());
            //vbox = recruitMenu.getRootNode();
            break;
        case BUILDING:
            //abstractMenu = new BuildingMenu();
            vbox.getChildren().add(buildingMenu.getRootNode());
            //vbox = buildingMenu.getRootNode();
            break;
        case NEUTRAL:
            //abstractMenu = new AbstractMenu();
            vbox.getChildren().add(abstractMenu.getRootNode());
            //vbox = abstractMenu.getRootNode();
            break;
        default:
            //abstractMenu = new AbstractMenu();
            vbox.getChildren().add(abstractMenu.getRootNode());
            //vbox = abstractMenu.getRootNode();
        }

        //setLeft(abstractMenu.getRootNode());
        //vbox.getChildren().add(abstractMenu);
    }
}
