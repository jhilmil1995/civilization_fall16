package view;

import controller.GameController;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
//
//import model.MilitaryUnit;
//import model.Unit;
//import view.GridFX;
/**
 * Created by William on 11/11/2016.
 */

public class MilitaryMenu extends AbstractMenu {
    /**
    * Implement the buttons and actions associated with
    * the buttons for the military menu
    */
    //private static GameController GameController;
    //private static boolean turnOver = false;
    private Button attackButton;
    private Button moveButton;

    public MilitaryMenu() {
        attackButton = new Button("Attack");
        moveButton = new Button("Move");
        attackButton.setStyle("-fx-font: 30 arial; -fx-base: #ee2211;");
        moveButton.setStyle("-fx-font: 30 arial; -fx-base: #ee2211;");
        attackButton.setOnMousePressed(e -> {
                Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                newAlert.setHeaderText("Select an enemy to attack");
                newAlert.setTitle("Attacking an enemy");
                newAlert.showAndWait();
                GameController.attacking();
                GameController.updateResourcesBar();
            });


        moveButton.setOnMousePressed(e -> {
                Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                newAlert.setHeaderText("Select tile to move to");
                newAlert.setTitle("Moving the unit");
                newAlert.showAndWait();
                GameController.moving();
                GameController.updateResourcesBar();
                GridFX.update();
            });
        addMenuItem(attackButton);
        addMenuItem(moveButton);
    }
}
