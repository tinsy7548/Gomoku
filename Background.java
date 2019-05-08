

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Background	extends Application {
	public static void main(String args[])
	{
		launch(args);
	}

	
	public void start(Stage stage)  {
//		Image image = new Image("file:background.png");
//		ImageView mv= new ImageView(image);
//		
//		Group root= new Group();
//		root.getChildren().addAll(mv);
//		
//		Scene scene= new Scene(root,750,750);
//		stage.setScene(scene);
//		stage.setResizable(false);
//		stage.show();
//		
//		//title
//		Text t= new Text();
//		t.setFont(Font.font("Verdana",50));
//		t.setFill(Color.BLACK);
//		t.setText("GOMOKU");
		int x = 750;
        int y = 750;
//
        Image image = new Image("file:background.png",x,y, false, false);
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        iv1.setPreserveRatio(true);
        iv1.setFitHeight(x);
        iv1.setFitWidth(y);
//        
//        Text text = new Text("GOMOKU");
//        text.setFont(Font.font ("Arial", 50));
//
//        Button button = new Button("Start");
//        button.setTranslateX(10);
//        button.setTranslateY(10);
//        button.setContentDisplay(ContentDisplay.TOP);
//
//
//        HBox root = new HBox();
//
//
//        root.getChildren().add(iv1);
//        root.getChildren().add(text);
//        root.getChildren().add(button);
//
//
//        Scene scene = new Scene(root,x,y);
//
//        stage.setTitle("Gomoku");
//        stage.setScene(scene);
//        stage.show();
        
        Button button = new Button("Start");
        Text text = new Text("Gomoku");
        text.setFont(Font.font ("Arial", 50));

        HBox hbox = new HBox();
  hbox.getChildren().addAll(button, text); // button will be left of text
      

//        Image image = new Image("file:background.png",x,y, false, false);
//        ImageView iv1 = new ImageView();

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(iv1, hbox); // hbox with button and text on top of image view

        HBox root = new HBox();
        root.getChildren().add(stackPane);
        
      Scene scene = new Scene(root,x,y);

      stage.setTitle("Gomoku");
      stage.setScene(scene);
      stage.show();
        
		
		
	}

}
