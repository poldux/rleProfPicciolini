package it.edu.iisgubbio.rle;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class rle extends Application{
	
	String Img [][] = new String [3] [3];
	TextField tMatrice = new TextField();
	Button bCalcola = new Button("calcolo:");
	Label lRis = new Label();
	public void start(Stage finestra) {
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
} 
