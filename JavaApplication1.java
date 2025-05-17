import javafx.application.*;
import javafx.scene.control.Label; // For Label
import javafx.scene.layout.FlowPane; // For FlowPane
import javafx.scene.*;
import javafx.stage.*;


public class JavaApplication1 extends Application {
    public static void main(String[] args) {
        // Start the JavaFX application
        launch(args);
    }

    @Override
    public void start(Stage myStage) {
        // Set window title
        myStage.setTitle("Demonstrate a JavaFX label.");
        
        // Create root layout (FlowPane)
        FlowPane rootNode = new FlowPane();
        
        // Create scene with dimensions 300x200 pixels
        Scene myScene = new Scene(rootNode, 300, 200);
        
        // Set the scene on the stage
        myStage.setScene(myScene);
        
        // Create a label
        Label myLabel = new Label("This is a JavaFX label");
        
        // Add label to the layout
        rootNode.getChildren().add(myLabel);
        
        // Display the window
        myStage.show();
    }
}