
import java.io.File;
import java.io.InputStream;
import java.awt.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
 
public class Background extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    
    public void start(Stage primaryStage) 
    {
    
        StackPane root = new StackPane();
      //Basic set up of Start Page
        primaryStage.setScene(new Scene(root, 750, 750));
        primaryStage.show();
        
        Canvas canvas = new Canvas( 750, 750 );
        root.getChildren().add( canvas );
             
        GraphicsContext gc = canvas.getGraphicsContext2D();
      
        
        //Background Image
        Image back = new Image("file:background.png", 750, 750, false, false);
        gc.drawImage(back, 0, 0);
        
       
        
        gc.setFill(Color.PINK);
        gc.setFont(Font.font( "Impact", FontWeight.BOLD, 100 ));
        gc.fillText( "GOMOKU", 200, 90 );
        
        
        
       
        primaryStage.setResizable(false);

        primaryStage.setTitle("GOMOKU");
        Button button = new Button();
        button.setText("Start");
        button.setLayoutX(200);
        button.setLayoutY(200);
        root.getChildren().add(button);

        Gomoku game = new Gomoku();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event)
            {
            	Stage stage1 = new Stage();
                game.start(stage1);
                Stage stage2 = (Stage) button.getScene().getWindow();
                stage2.close();
            }
        });
        
       
      
        primaryStage.show();
    
    }
    
   
   
}

