package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class Controlador3 {
	int aciertos=0;
	
	@FXML
	private CheckBox c1_1, c1_2, c1_3, c1_4,
	c2_1, c2_2, c2_3, c2_4;
	
	@FXML
	public void metodo_c1_1(ActionEvent e){
		if(c1_1.isSelected() && c2_3.isSelected()){
			aciertos++;
			c1_1.setVisible(false);
			c2_3.setVisible(false);
			
			Alert ms = new Alert(AlertType.INFORMATION);
			ms.setTitle("Acertaste!!!");
			ms.setHeaderText("Acertaste");
			ms.setContentText("Acertaste, busca una nueva pareja.");
			
			ms.showAndWait();
		}
		if(aciertos>=4){
			Alert ms2 = new Alert(AlertType.INFORMATION);
			ms2.setTitle("Ganaste!!!");
			ms2.setHeaderText("Ganaste");
			ms2.setContentText("Acertaste todas las parejas...Ganaste!!! :D.");
			
			ms2.showAndWait();
			
			Stage stage = (Stage) c1_1.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_c1_2(ActionEvent e){
		if(c1_2.isSelected() && c2_4.isSelected()){
			aciertos++;
			c1_2.setVisible(false);
			c2_4.setVisible(false);
			
			Alert ms = new Alert(AlertType.INFORMATION);
			ms.setTitle("Acertaste!!!");
			ms.setHeaderText("Acertaste");
			ms.setContentText("Acertaste, busca una nueva pareja.");
			
			ms.showAndWait();
		}
		if(aciertos>=4){
			Alert ms2 = new Alert(AlertType.INFORMATION);
			ms2.setTitle("Ganaste!!!");
			ms2.setHeaderText("Ganaste");
			ms2.setContentText("Acertaste todas las parejas...Ganaste!!! :D.");
			
			ms2.showAndWait();
			
			Stage stage = (Stage) c1_2.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_c1_3(ActionEvent e){
		if(c1_3.isSelected() && c2_1.isSelected()){
			aciertos++;
			c1_3.setVisible(false);
			c2_1.setVisible(false);
			
			Alert ms = new Alert(AlertType.INFORMATION);
			ms.setTitle("Acertaste!!!");
			ms.setHeaderText("Acertaste");
			ms.setContentText("Acertaste, busca una nueva pareja.");
			
			ms.showAndWait();
		}
		if(aciertos>=4){
			Alert ms2 = new Alert(AlertType.INFORMATION);
			ms2.setTitle("Ganaste!!!");
			ms2.setHeaderText("Ganaste");
			ms2.setContentText("Acertaste todas las parejas...Ganaste!!! :D.");
			
			ms2.showAndWait();
			
			Stage stage = (Stage) c1_3.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_c2_2(ActionEvent e){
		if(c2_2.isSelected() && c1_4.isSelected()){
			aciertos++;
			c1_4.setVisible(false);
			c2_2.setVisible(false);
			
			Alert ms = new Alert(AlertType.INFORMATION);
			ms.setTitle("Acertaste!!!");
			ms.setHeaderText("Acertaste");
			ms.setContentText("Acertaste, busca una nueva pareja.");
			
			ms.showAndWait();
		}else
		if(aciertos>=4){
			Alert ms2 = new Alert(AlertType.INFORMATION);
			ms2.setTitle("Ganaste!!!");
			ms2.setHeaderText("Ganaste");
			ms2.setContentText("Acertaste todas las parejas...Ganaste!!! :D.");
			
			ms2.showAndWait();
			
			Stage stage = (Stage) c2_2.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_c2_3(ActionEvent e){
		if(c2_3.isSelected() && c1_1.isSelected()){
			aciertos++;
			c1_1.setVisible(false);
			c2_3.setVisible(false);
			
			Alert ms = new Alert(AlertType.INFORMATION);
			ms.setTitle("Acertaste!!!");
			ms.setHeaderText("Acertaste");
			ms.setContentText("Acertaste, busca una nueva pareja.");
			
			ms.showAndWait();
		}
		if(aciertos>=4){
			Alert ms2 = new Alert(AlertType.INFORMATION);
			ms2.setTitle("Ganaste!!!");
			ms2.setHeaderText("Ganaste");
			ms2.setContentText("Acertaste todas las parejas...Ganaste!!! :D.");
			
			ms2.showAndWait();
			
			Stage stage = (Stage) c2_3.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_c2_4(ActionEvent e){
		if(c2_4.isSelected() && c1_2.isSelected()){
			aciertos++;
			c1_2.setVisible(false);
			c2_4.setVisible(false);
			
			Alert ms = new Alert(AlertType.INFORMATION);
			ms.setTitle("Acertaste!!!");
			ms.setHeaderText("Acertaste");
			ms.setContentText("Acertaste, busca una nueva pareja.");
			
			ms.showAndWait();
		}
		if(aciertos>=4){
			Alert ms2 = new Alert(AlertType.INFORMATION);
			ms2.setTitle("Ganaste!!!");
			ms2.setHeaderText("Ganaste");
			ms2.setContentText("Acertaste todas las parejas...Ganaste!!! :D.");
			
			ms2.showAndWait();
			
			Stage stage = (Stage) c2_4.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_c2_1(ActionEvent e){
		if(c2_1.isSelected() && c1_3.isSelected()){
			aciertos++;
			c1_3.setVisible(false);
			c2_1.setVisible(false);
			
			Alert ms = new Alert(AlertType.INFORMATION);
			ms.setTitle("Acertaste!!!");
			ms.setHeaderText("Acertaste");
			ms.setContentText("Acertaste, busca una nueva pareja.");
			
			ms.showAndWait();
		}
		if(aciertos>=4){
			Alert ms2 = new Alert(AlertType.INFORMATION);
			ms2.setTitle("Ganaste!!!");
			ms2.setHeaderText("Ganaste");
			ms2.setContentText("Acertaste todas las parejas...Ganaste!!! :D.");
			
			ms2.showAndWait();
			
			Stage stage = (Stage) c2_1.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_c1_4(ActionEvent e){
		if(c1_4.isSelected() && c2_2.isSelected()){
			aciertos++;
			c1_4.setVisible(false);
			c2_2.setVisible(false);
			
			Alert ms = new Alert(AlertType.INFORMATION);
			ms.setTitle("Acertaste!!!");
			ms.setHeaderText("Acertaste");
			ms.setContentText("Acertaste, busca una nueva pareja.");
			
			ms.showAndWait();
		}else
		if(aciertos>=4){
			Alert ms2 = new Alert(AlertType.INFORMATION);
			ms2.setTitle("Ganaste!!!");
			ms2.setHeaderText("Ganaste");
			ms2.setContentText("Acertaste todas las parejas...Ganaste!!! :D.");
			
			ms2.showAndWait();
			
			Stage stage = (Stage) c1_4.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}	
}
