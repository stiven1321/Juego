package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class Controlador2 {
	int aciertos=0;
	
	@FXML
	private CheckBox c3_1, cReduce_1, cReutilizar_1, cRecicla_1,
	c3_2, cReduce_2, cReutilizar_2, cRecicla_2;
	
	@FXML
	public void metodo_cR1(ActionEvent e){
		if(c3_1.isSelected() && c3_2.isSelected()){
			aciertos++;
			c3_1.setVisible(false);
			c3_2.setVisible(false);	
			
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
			
			Stage stage = (Stage) c3_1.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_cReduce_1(ActionEvent e){
		if(cReduce_1.isSelected() && cReduce_2.isSelected()){
			aciertos++;
			cReduce_1.setVisible(false);
			cReduce_2.setVisible(false);
			
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
			
			Stage stage = (Stage) cReduce_1.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_cRecicla_1(ActionEvent e){
		if(cRecicla_1.isSelected() && cRecicla_2.isSelected()){
			aciertos++;
			cRecicla_1.setVisible(false);
			cRecicla_2.setVisible(false);
			
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
			
			Stage stage = (Stage) cRecicla_1.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_cReutilizar_1(ActionEvent e){
		if(cReutilizar_1.isSelected() && cReutilizar_2.isSelected()){
			aciertos++;
			cReutilizar_1.setVisible(false);
			cReutilizar_2.setVisible(false);
			
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
			
			Stage stage = (Stage) cReutilizar_1.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_cR2(ActionEvent e){
		if(c3_2.isSelected() && c3_1.isSelected()){
			aciertos++;
			c3_1.setVisible(false);
			c3_2.setVisible(false);	
			
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
			
			Stage stage = (Stage) c3_2.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_cReduce_2(ActionEvent e){
		if(cReduce_2.isSelected() && cReduce_1.isSelected()){
			aciertos++;
			cReduce_1.setVisible(false);
			cReduce_2.setVisible(false);
			
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
			
			Stage stage = (Stage) cReduce_2.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_cRecicla_2(ActionEvent e){
		if(cRecicla_2.isSelected() && cRecicla_1.isSelected()){
			aciertos++;
			cRecicla_1.setVisible(false);
			cRecicla_2.setVisible(false);
			
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
			
			Stage stage = (Stage) cRecicla_2.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
	@FXML
	public void metodo_cReutilizar_2(ActionEvent e){
		if(cReutilizar_2.isSelected() && cReutilizar_1.isSelected()){
			aciertos++;
			cReutilizar_1.setVisible(false);
			cReutilizar_2.setVisible(false);
			
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
			
			Stage stage = (Stage) cReutilizar_2.getScene().getWindow();
		    // do what you have to do
		    stage.close();
		}
	}
	
}

