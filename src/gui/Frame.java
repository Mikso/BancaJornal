/**
 * 
 */
package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.Group;


/**
 * @author Bruno
 * @version 1
 * 
 * Hibernate 5.1.10
 * MySQL connector 5.0.8
 * Java 8
 * 
 * 
 * 
 */
public class Frame extends Application {

	public static void main(String[]args){
		// Chamando o a classe
		launch(args);
	}
	
	@Override
	public void start(Stage frame) throws Exception {
		// Definindo estilo de frame
		AnchorPane master = new AnchorPane();
		// Configurando a scene - estilo altura e largura
		Scene scene = new Scene(master, 400, 400);
		Group group = new Group();
		
		// Botao de consulta
		Button btnConsultar = new Button("Consultar");
		btnConsultar.setLayoutX(160);
		btnConsultar.setLayoutY(100);
		btnConsultar.setPrefWidth(100);
		
		// Botao de insercao
		Button btnInserir = new Button("Inserir");
		btnInserir.setLayoutX(160);
		btnInserir.setLayoutY(140);
		btnInserir.setPrefWidth(100);
		
		// Botao de Atualizacao
		Button btnAtualizar = new Button("Atualizar");
		btnAtualizar.setLayoutX(160);
		btnAtualizar.setLayoutY(180);
		btnAtualizar.setPrefWidth(100);
		
		// Botao de remocao
		Button btnRemover = new Button("Remover");
		btnRemover.setLayoutX(160);
		btnRemover.setLayoutY(220);
		btnRemover.setPrefWidth(100);
		
		// Capturando os items para o frame
		master.getChildren().addAll(btnConsultar,btnInserir,btnAtualizar,btnRemover);
		
		// Titulo da janela
		frame.setTitle("Menu");
		// Definindo a scene 
		frame.setScene(scene);
		// Chamando a janela
		frame.show();
	}

}
