import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentManagementApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField studentName = new TextField();
        studentName.setPromptText("Enter student name");

        Button registerButton = new Button("Register");

        registerButton.setOnAction(e -> {
            String name = studentName.getText();
            System.out.println("Registered Student: " + name);
            // Call business logic to save student information
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(studentName, registerButton);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Student Management System");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
