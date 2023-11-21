/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrollbardomin;
import javafx.application.Application;  
import javafx.geometry.Orientation;  
import javafx.scene.Scene;  
import javafx.scene.control.ScrollBar;  
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  
 
public class ScrollBardomin extends Application {
    
    @Override
    public void start(Stage primaryStage) {
          // TODO Auto-generated method stub  
        ScrollBar l = new ScrollBar();  
        l.setMin(0);  
        l.setMax(200);  
        l.setValue(110);  
        l.setOrientation(Orientation.VERTICAL);  
        l.setUnitIncrement(12);  
        l.setBlockIncrement(10);  
//        StackPane root1 = new StackPane();  
//        root.getChildren().add(s);  
//        Scene scene = new Scene(root,300,200);  
//        primaryStage.setScene(scene);  
//        primaryStage.setTitle("ScrollBar Example");  
//        primaryStage.show();

        // TODO Auto-generated method stub  
        ScrollBar s = new ScrollBar();  
        StackPane root = new StackPane();  
        BorderPane pane = new BorderPane();
        root.getChildren().add(s);  
        pane.setLeft(l);
        pane.setBottom(s);
        Scene scene = new Scene(pane,300,200);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("ScrollBar Example");  
        primaryStage.show();  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
