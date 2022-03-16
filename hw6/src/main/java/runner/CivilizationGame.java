package runner;

import controller.GameController;
import view.StartScreen;
//import view.CivEnum;
import view.GameScreen;
import model.Map;
import model.QinDynasty;
import model.RomanEmpire;
import model.IncanEmpire;
import model.Egypt;
import model.HanDynasty;
import model.GreekEmpire;
import model.Bandit;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

//
//import model.Civilization;
import view.GridFX;
/**
 * Created by Tian-Yo Yang on 11/11/2016.
 */
public class CivilizationGame extends Application {

    private StartScreen startScreen;
    private GameScreen gameScreen;
    private static Stage window;
    //private boolean playing = false;
    private String name;
    /**
     * this method is called upon running/launching the application
     * this method should display a scene on the stage
     */
    public void start(Stage primaryStage) {
        //TODO
        //GameController.setCivilization(new Egypt());
        primaryStage.setScene(startGame());
        primaryStage.show();
        window = primaryStage;
    }
    /**
     * This is the main method that launches the javafx application
     */

    public static void main(String[] args) {
        Application.launch(args);
    }
    /**
    * This method is responsible for setting the scene to the corresponding
    * layout.
    * and returning the scene.
    * @return Scene
    */

    public Scene startGame() {
        //TODO
        //StartScreen startScreen = new StartScreen();
        startScreen = new StartScreen();
        TextInputDialog dialog = new TextInputDialog("Town Name");
        dialog.setTitle("A New Settlement");
        dialog.setHeaderText("You have built a settlement");
        dialog.setContentText("Enter the name of your first town!");

        startScreen.getStartButton().setOnMouseClicked(e -> {
                Optional<String> result = dialog.showAndWait();
                if (result.isPresent()) {
                    name = result.get();
                    String civ = startScreen.getCivList().getSelectionModel().
                        getSelectedItem().toString();
                    switch (civ) {
                    case ("Ancient Egypt"):
                        GameController.setCivilization(new Egypt());
                        break;
                    case ("Qin Dynasty"):
                        GameController.setCivilization(new QinDynasty());
                        break;
                    case ("Roman Empire"):
                        GameController.setCivilization(new RomanEmpire());
                        break;
                    case ("Incan Empire"):
                        GameController.setCivilization(new IncanEmpire());
                        break;
                    case ("Greek Empire"):
                        GameController.setCivilization(new GreekEmpire());
                        break;
                    case ("Han Dynasty"):
                        GameController.setCivilization(new HanDynasty());
                        break;
                    default:
                        break;
                    }
                    GridFX.getMap().putSettlement(name,
                        GameController.getCivilization(), 0, 9);
                    Map.addEnemies(new Bandit(), 1);

                    gameScreen = new GameScreen();
                    Scene startScene = new Scene(gameScreen);
                    CivilizationGame.window.setScene(startScene);

                }
            });
        Scene startScene = new Scene(startScreen);
        return startScene;
    }
}

