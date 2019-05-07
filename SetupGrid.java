import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Ellipse;

public class SetupGrid extends Application {

 

  
    private Cell[][] cell =  new Cell[15][15];
    private Label statusLabel = new Label("Gomoku");

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane(); 
        for (int i = 0; i < 15; i++)
            for (int j = 0; j < 15; j++)
                pane.add(cell[i][j] = new Cell(), j, i);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        //borderPane.setBottom(statusLabel);
    
        Scene scene = new Scene(borderPane, 750.0f, 750.0f);
        primaryStage.setTitle("Gomoku");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
     public class Cell extends Pane {
        public Cell() {
            setStyle("-fx-border-color: black"); 
            setPrefSize(100.0f, 100.0f);
        }
    }
}