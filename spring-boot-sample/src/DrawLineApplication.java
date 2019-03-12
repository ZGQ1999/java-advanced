import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DrawLineApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Creating a line object
        Line line = new Line();

        //Setting the properties to a line
        line.setStartX(50.0);
        line.setStartY(150.0);
        line.setEndX(225.0);
        line.setEndY(150.0);

        //Creating a Text object
        Text text = new Text();

        //Setting font to the text
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        //setting the position of the text
        text.setX(50);
        text.setY(130);

        //Setting the text to be added.
        text.setText("Hi how are you");

        //Creating an image
        Image image = new Image("https://upload.jianshu.io/users/upload_avatars/8972166/bd7164e9-2272-4ecf-91d0-f4903a150d4f.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180");

        //Setting the image view
        ImageView imageView = new ImageView(image);

        //Setting the position of the image
        imageView.setX(800);
        imageView.setY(100);

        //setting the fit height and width of the image view
        imageView.setFitHeight(150);
        imageView.setFitWidth(275);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);

        //Drawing a Box
        Box box1 = new Box();

        //Setting the properties of the Box
        box1.setWidth(125.0);
        box1.setHeight(125.0);
        box1.setDepth(125.0);

        //Setting the position of the box
        box1.setTranslateX(200);
        box1.setTranslateY(400);
        box1.setTranslateZ(0);

        //Setting the drawing mode of the box
        box1.setDrawMode(DrawMode.LINE);

        //Drawing a Box
        Box box2 = new Box();

        //Setting the properties of the Box
        box2.setWidth(125.0);
        box2.setHeight(125.0);
        box2.setDepth(125.0);

        //Setting the position of the box
        box2.setTranslateX(400); //450
        box2.setTranslateY(400);//150
        box2.setTranslateZ(300);

        //Setting the drawing mode of the box
        box2.setDrawMode(DrawMode.FILL);


        //creating a Group object

     
        Group group = new Group(line,text,imageView,box1,box2);

        //Creating a Scene by passing the group object, height and width
        Scene scene = new Scene(group ,1000, 618);

        //setting color to the scene
        scene.setFill(Color.PINK);

        //Setting the title to Stage.
        primaryStage.setTitle("Sample Application");

        //Adding the scene to Stage
        primaryStage.setScene(scene);

        //Displaying the contents of the stage
        primaryStage.show();
    }
}
