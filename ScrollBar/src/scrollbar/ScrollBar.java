/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrollbar;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 *
 * @author HP
 */
public class ScrollBar extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Text text = new Text(20, 20, "JavaFX Programming");
       
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        
        ScrollBar sbHorizontal = new ScrollBar();
        ScrollBar sbVertical = new ScrollBar();
        
        sbVertical.setOrientation(Orientation.VERTICAL);

       // Listener for horizontal scroll bar value change
       sbHorizontal.valueProperty().addListener(ov ->
       //setting the x value for text location according to the horizontal scroll value and the width of Text pane
       text.xProperty().bind(sbHorizontal.valueProperty().multiply(paneForText.widthProperty()).divide(sbHorizontal.maxProperty()));

       );
       // Listener for vertical scroll bar value change
       sbVertical.valueProperty().addListener(ov ->
       //setting the y value text location according to the vertical scroll 
    text.yProperty().bind(sbVertical.valueProperty().multiply(paneForText.heightProperty().divide(sbVertical.maxProperty())));
       );
        // Create a border pane to hold text and scroll bars
        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(sbHorizontal);
        pane.setRight(sbVertical);
        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setTitle("ScrollBarDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}