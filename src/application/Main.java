package application;
	
import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;


public class Main extends Application {

	private static int WIDTH = 800;
	private static int HEIGHT = 600;
	@Override
	public void start(Stage primaryStage) {
	Image icon = new Image("icon.jpg");	
	Group root = new Group();	
	Scene scene = new Scene(root , WIDTH , HEIGHT, Color.BLACK);

  Image img = new Image("star5.jpg");
  ImageView imgv = new ImageView(img);
  imgv.setX(90);
  imgv.setY(40);
  
  Image img2 = new Image("star5.jpg");
  ImageView imgv2 = new ImageView(img2);
  imgv2.setX(250);
  imgv2.setY(60);
  
  
  
  Image img3 = new Image("star5.jpg");
  ImageView imgv3 = new ImageView(img3);
  imgv3.setX(650);
  imgv3.setY(30);
 
  
  Image img4 = new Image("star5.jpg");
  ImageView imgv4 = new ImageView(img4);
  imgv4.setX(400);
  imgv4.setY(30);
  
  Image img5 = new Image("star5.jpg");
  ImageView imgv5 = new ImageView(img5);
  imgv5.setX(700);
  imgv5.setY(100);
  
  Image img6 = new Image("star5.jpg");
  ImageView imgv6 = new ImageView(img6);
  imgv6.setX(500);
  imgv6.setY(90);
  
  Image img7 = new Image("star5.jpg");
  ImageView imgv7 = new ImageView(img7);
  imgv7.setX(750);
  imgv7.setY(20);
  
  
  Image img8 = new Image("star5.jpg");
  ImageView imgv8 = new ImageView(img8);
  imgv8.setX(230);
  imgv8.setY(10);
  
  Image img9 = new Image("star5.jpg");
  ImageView imgv9 = new ImageView(img9);
  imgv9.setX(550);
  imgv9.setY(40);
  

 
 Color c = Color.rgb(255, 95, 31);
 
 
 
 
	Circle circle = new Circle ();
	circle.setCenterX(-100);
	circle.setCenterY(300);
	circle.setRadius(220);
	circle.setFill(c);
	circle.setStroke(Color.ORANGE);
	circle.setStrokeWidth(6);

	
	root.getChildren().add(imgv);
	root.getChildren().add(imgv2);
	root.getChildren().add(imgv3);
	root.getChildren().add(imgv4);
	root.getChildren().add(imgv5);
	root.getChildren().add(imgv6);
	root.getChildren().add(imgv7);
	root.getChildren().add(imgv8);
	root.getChildren().add(imgv9);
	
	
	root.getChildren().add(circle);
	 
	primaryStage.getIcons().add(icon);
	primaryStage.setTitle("Space1");
	primaryStage.setScene(scene);	
	primaryStage.setResizable(false);
    primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

