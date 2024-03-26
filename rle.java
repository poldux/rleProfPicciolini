package it.edu.iisgubbio.rle;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class rle extends Application{
	
	String Img [][] = new String [3] [3];
	TextField tMatrice = new TextField();
	Button bCalcola = new Button("calcolo:");
	Label lRis = new Label();
	public void start(Stage finestra) {
	
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);
		
		griglia.add(tMatrice, 0, 0);
		griglia.add(bCalcola, 0, 1);
		griglia.add(lRis, 0, 2);
	
		griglia.setAlignment(Pos.CENTER);
		griglia.setPadding(new Insets(10));
		griglia.setHgap(10);
		griglia.setVgap(10);
		finestra.setScene(scena);
		finestra.setTitle("rle");
		finestra.show();
		
		bCalcola.setOnAction(e->calcolo());
	}
	
	public static void main(String[] args) {
		launch(args);
	}
} 
