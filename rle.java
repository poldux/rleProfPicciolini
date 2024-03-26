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
	 
	public void calcolo() {
		String m = tMatrice.getText();
		String vetto[] = m.split(",");
		int l = 0;
		int lett = 1;
		int riga = 0;
		int bt=0;
		int risu = 0;
		String ris = "";
		String l1;
		String l3;
		String l2;

		for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
		Img[i][j] = vetto[l];
		l++;
		}
		}


		for(int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {
		l1=Img[i][0];
		l2=Img[i][1];
		l3=Img[i][2];
		if(!(l1).equals(l2)){
		lett++;
		}
		if(!(l1).equals(l3)) {
		lett++;
		}
		if(!(l2).equals(l3)) {
		lett++;
		}
		riga=lett;
		while (riga!=0) {
		riga/=2;
		bt++;
		}

		}
		risu+=bt+(lett+24);
		}

		lRis.setText(risu+"");
		}
	
	public static void main(String[] args) {
		launch(args);
	}
} 
