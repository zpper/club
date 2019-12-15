//package org.zipper.desktop.login;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//public class Login extends Application {
//    private static Stage stage;
//
//    @Override
//    public void start(Stage stage) throws Exception {
//
//
//        Parent root = FXMLLoader.load(getClass().getResource("/page/login.fxml"));
//
//        stage.setTitle("FXML Welcome");
//        stage.setScene(new Scene(root, 300, 275));
//        this.stage = stage;
//        stage.show();
//    }
//
//    public static void  onSwitch() throws IOException {
//        Parent root = FXMLLoader.load(Login.class.getResource("/page/desktop.fxml"));
//        stage.setTitle("FXML Welcome");
//        stage.setScene(new Scene(root, 300, 275));
//        stage.show();
//    }
//
//}