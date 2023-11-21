/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listviewdemo;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 *
 * @author HP
 */
public class ListViewDemo extends Application {
    String[] cities = new String[]{"Makkah", "Madina", "Jeddah",
 "Riyadh", "Unaizah", "Al-Khubar"};
 //create a discription for each city
 String[] citiesDescription= new String[]{
 "Makkah is the heart of the Islamic world ...",
 "Madinah is a city of peace... ",
 "Jeddah is known as the Bride of the Red Sea ... ",
 "Riyadh is the capital of Suadi Arabia ... ",
 "Unaizah is the second largest city in Al-Qassim... ",
 "Al-Khubar is oasis and port city ... "};
 
    @Override
    public void start(Stage primaryStage) {
            ListView<String> lv = new ListView<>();
      lv.getItems().addAll(cities);
      lv.setPrefSize(140, 400);
      lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
      
      TextArea taDescription;
      taDescription = new TextArea();
      taDescription.setFont(new Font("Serif", 14));
      taDescription.setWrapText(true);
      
      lv.getSelectionModel().selectedItemProperty().addListener(ov -> {
      taDescription.setText("");
      
      for (Integer i: lv.getSelectionModel().getSelectedIndices()){ 
          taDescription.setText(taDescription.getText()+"\n"+citiesDescription[i]);
}
 
 });
 BorderPane pane = new BorderPane();
 pane.setLeft(new ScrollPane(lv));
 pane.setCenter(new ScrollPane (taDescription));
 Scene scene = new Scene(pane, 450, 170);
 
 primaryStage.setTitle("ListViewDemo");
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
