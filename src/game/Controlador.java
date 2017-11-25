package game;

import java.awt.Label;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controlador {
	
	public static String jugador;
	@FXML
	private TextField textJugador;
	
	@FXML
	private Label nombreJugador;
	
	
	@FXML
	public void ActionRs(ActionEvent e){
		
		try {
			FXMLLoader load= new FXMLLoader(getClass().getResource("PantallaR'.fxml"));
			Parent root1 =(Parent) load.load();
			Stage stage= new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setTitle("Juguemos!!!");
			stage.setScene(new Scene(root1));
			stage.setResizable(false);
			stage.getIcons().add(new Image(getClass().getResourceAsStream("Fondo.png")));
			stage.show();
			
		} catch(Exception r) {
			System.out.println("Error");
		}	
	}
	
	@FXML
	public void ActionAgua(ActionEvent e){
		
		try {
			FXMLLoader load= new FXMLLoader(getClass().getResource("AhorrarAgua.fxml"));
			Parent root1 =(Parent) load.load();
			Stage stage= new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setTitle("Juguemos!!!");
			stage.setScene(new Scene(root1));
			stage.setResizable(false);
			stage.getIcons().add(new Image(getClass().getResourceAsStream("Fondo.png")));
			stage.show();
			
		} catch(Exception r) {
			System.out.println("Error");
		}	
	}
}
