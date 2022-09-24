package application;
	
import java.io.File;
import java.io.FileInputStream;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
//import java.util.Random;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.*;
import javafx.scene.*;
//import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
//import javafx.scene.shape.Polygon;

public class Main extends Application {
	private static final int height = 600;
	private static final int Width = 800;

	@Override
	public void start(Stage primaryStage) {
		try {
			/////group for object////////
			Group root = new Group();
            Scene scene = new Scene(root,Width,height,Color.BLACK);	
            
			Camera camera = new PerspectiveCamera();
			scene.setCamera(camera);
			 
			
			
		
			
			
			 
			 /////icon///////
			Image icon = new Image(new File("icon.jpg").toURI().toString());
			
			////////stars////////
			  Image img = new Image(new File("star5.jpg").toURI().toString());
			  ImageView imgv = new ImageView(img);
			  imgv.setX(90);
			  imgv.setY(40);
			  Image img2 = new Image(new File("star5.jpg").toURI().toString());
			  ImageView imgv2 = new ImageView(img2);
			  imgv2.setX(250);
			  imgv2.setY(60);			  
			  Image img3 = new Image(new File("star5.jpg").toURI().toString());
			  ImageView imgv3 = new ImageView(img3);
			  imgv3.setX(650);
			  imgv3.setY(30);			  
			  Image img4 = new Image(new File("star5.jpg").toURI().toString());
			  ImageView imgv4 = new ImageView(img4);
			  imgv4.setX(400);
			  imgv4.setY(30);		  
			  Image img5 = new Image(new File("star5.jpg").toURI().toString());
			  ImageView imgv5 = new ImageView(img5);
			  imgv5.setX(700);
			  imgv5.setY(100);		  
			  Image img6 = new Image(new File("star5.jpg").toURI().toString());
			  ImageView imgv6 = new ImageView(img6);
			  imgv6.setX(500);
			  imgv6.setY(90);		  
			  Image img7 = new Image(new File("star5.jpg").toURI().toString());
			  ImageView imgv7 = new ImageView(img7);
			  imgv7.setX(750);
			  imgv7.setY(20);	  
			  Image img8 = new Image(new File("star5.jpg").toURI().toString());
			  ImageView imgv8 = new ImageView(img8);
			  imgv8.setX(230);
			  imgv8.setY(10);		  
			  Image img9 = new Image(new File("star5.jpg").toURI().toString());
			  ImageView imgv9 = new ImageView(img9);
			  imgv9.setX(550);
			  imgv9.setY(40);
			  

			    //////sun/////
			   // Color c = Color.rgb(255, 95, 31);
				Circle circle = new Circle ();
				circle.setCenterX(-100);
				circle.setCenterY(300);
				circle.setRadius(220);
				//circle.setFill(c);
				//circle.setStroke(Color.DARKRED);
				//circle.setStrokeWidth(6);
				 RadialGradient gradient1 = new RadialGradient(0,  
				            .1,  
				            100,  
				            100,  
				            200,  
				            false,  
				            CycleMethod.NO_CYCLE,  
				            new Stop(0, Color.YELLOW),  
				            new Stop(1, Color.DARKRED));  
				        circle.setFill(gradient1);  
				
				////earth////
				
				Sphere earth = new Sphere(80);
				earth.setTranslateX((Width/3)-50);
				earth.setTranslateY(Width/3);
			    //earth.setTranslateZ(90);
				// new Image(new File("ER.jpg").toURI().toString());        
				PhongMaterial erathmMat = new PhongMaterial();
				erathmMat. setDiffuseMap(new Image(getClass().getResourceAsStream("ER.jpg")));
				erathmMat.setSpecularMap(new Image(getClass().getResourceAsStream("ER.jpg")));
				earth.setMaterial(erathmMat);
				primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
			        switch (event.getCode()) {
			            
			            case E:
			            	 earth.translateZProperty().set(earth.getTranslateZ()+10);
			                break;
			            case R:
			            	 earth.translateZProperty().set(earth.getTranslateZ()-10);
			                break;
			        }
			    });
		        
               /////mars/////
		        Sphere mars = new Sphere(70);
				mars.setTranslateX(Width/2);
				mars.setTranslateY(Width/3);      
				PhongMaterial marsMat = new PhongMaterial();
				marsMat. setDiffuseMap(new Image(getClass().getResourceAsStream("mars.jpeg")));
				marsMat.setSpecularMap(new Image(getClass().getResourceAsStream("mars.jpeg")));
			    mars.setMaterial(marsMat);
			    primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
			        switch (event.getCode()) {
			            
			            case M:
			            	 mars.translateZProperty().set(mars.getTranslateZ()+10);
			                break;
			            case A:
			            	 mars.translateZProperty().set(mars.getTranslateZ()-10);
			                break;
			        }
			    });
		        
				     
				////jupiter///
			    Sphere jupiter = new Sphere(100);
				jupiter.setTranslateX((Width/2)+200);
				jupiter.setTranslateY(Width/3);      
				PhongMaterial jupiterMat = new PhongMaterial();
				jupiterMat. setDiffuseMap(new Image(getClass().getResourceAsStream("jupiter.jpeg")));
				jupiterMat.setSpecularMap(new Image(getClass().getResourceAsStream("jupiter.jpeg")));
			    jupiter.setMaterial(jupiterMat);
			    primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
			        switch (event.getCode()) {
			            
			            case J:
			            	 jupiter.translateZProperty().set(jupiter.getTranslateZ()+10);
			                break;
			            case U:
			            	 jupiter.translateZProperty().set(jupiter.getTranslateZ()-10);
			                break;
			        }
			    });
		        
			    
			    
			    ////spin the plants//////
			    RotateTransition rotateEarth = new RotateTransition(); 
			    rotateEarth.setAxis(Rotate.Y_AXIS); 
				rotateEarth.setDuration(Duration.seconds(10));
				 rotateEarth.setByAngle(360);  
			     rotateEarth.setCycleCount(500);  
				 rotateEarth.setNode(earth);
				 rotateEarth.play();
				 RotateTransition rotateMars = new RotateTransition();
				 rotateMars.setAxis(Rotate.Y_AXIS); 
				 rotateMars.setDuration(Duration.seconds(10));
				 rotateMars.setByAngle(360);  
				 rotateMars.setCycleCount(500);  
				 rotateMars.setNode(mars);
				 rotateMars.play();
				 RotateTransition rotateJupiter = new RotateTransition();
				 rotateJupiter.setAxis(Rotate.Y_AXIS); 
				 rotateJupiter.setDuration(Duration.seconds(10));
				 rotateJupiter.setByAngle(360);  
				 rotateJupiter.setCycleCount(500);  
				 rotateJupiter.setNode(jupiter);
				 rotateJupiter.play();
			    
				 ////text/////
				 Text jupiterText = new Text();
				 jupiterText.setText("Jupiter");
				 jupiterText.setX((Width/2)+180); 
				 jupiterText.setY((Width/3)+120);
				 jupiterText.setUnderline(true);
				 jupiterText.setFill(Color.ALICEBLUE);
				 Text earthText = new Text();
				 earthText.setText("Earth");
				 earthText.setX((Width/3-70)); 
				 earthText.setY((Width/3)+120);
				 earthText.setUnderline(true);
				 earthText.setFill(Color.ALICEBLUE); 
				 Text marsText = new Text();
				 marsText.setText("Mars");
				 marsText.setX((Width/3+120)); 
				 marsText.setY((Width/3)+120);
				 marsText.setUnderline(true);
				 marsText.setFill(Color.ALICEBLUE);
				 
				 Text sunText = new Text();
				 sunText.setText("the sun");
				 sunText.setX(4); 
				 sunText.setY(520);
				 sunText.setUnderline(true);
				 sunText.setFill(Color.ALICEBLUE);
				 
				 ////audio////
				  // String path ="audioS.mp3";
//				 Media media = new Media(new File("/CG/src/application/audioS.mp3").toURI().toString());  
//				 MediaPlayer mediaPlayer = new MediaPlayer(media);  
//				 mediaPlayer.play();  
                ///// adding images and object///////
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
				root.getChildren().add(earth);
				root.getChildren().add(mars);
				root.getChildren().add(jupiter);
				root.getChildren().add(jupiterText);
				root.getChildren().add(earthText);
				root.getChildren().add(marsText);
				root.getChildren().add(sunText);
				
				/////settings for the scene////
				primaryStage.getIcons().add(icon);
				primaryStage.setTitle("Space1");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
