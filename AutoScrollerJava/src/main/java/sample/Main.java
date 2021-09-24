package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label website = new Label("Website");
        website.setOpacity(0.75);
        TextField textField = new TextField();

        Label scrollSpeed = new Label("Scroll Speed");
        website.setOpacity(0.75);
        ComboBox<Integer> scrollSpeedList = new ComboBox<Integer>();

        Button submitButton = new Button("Submit");

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                new HandleScroll(textField.getText(),scrollSpeedList.getValue());
            }
        });

        for (int i = 0; i < 10; i++) {
            scrollSpeedList.getItems().add(i);
        }


        GridPane root = new GridPane();

        GridPane.setConstraints(website, 0, 0);
        root.getChildren().addAll(website);
        GridPane.setConstraints(textField, 1, 0);
        root.getChildren().addAll(textField);

        GridPane.setConstraints(scrollSpeed, 0, 1);
        root.getChildren().addAll(scrollSpeed);
        GridPane.setConstraints(scrollSpeedList, 1, 1);
        root.getChildren().addAll(scrollSpeedList);


        root.add(submitButton,1, 3    ,3,1);

        website.setPadding(new Insets(10));
        scrollSpeed.setPadding(new Insets(10));
        root.setPadding(new Insets(10));


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 150));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
