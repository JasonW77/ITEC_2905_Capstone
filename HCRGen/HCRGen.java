package HCRGen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.*;
import java.awt.*;




public class HCRGen extends Application {
	// Tong's Fire Extinguisher Sales and Service Information
	String licenceNum = " Lic. # KE82431 & KE113954";
	String address1 = " P.O. Box 135 \n Elsinore, UT 84724";
	String address2 = " P.O. Box 3101 \n Cedar City, UT 84721";
	String phoneNum = " (435) 201-2182";

	
	@Override
	public void start(Stage primaryStage){
		//Create a grid pane and set its atributes
		GridPane pane = new GridPane();
		pane.setMinSize(400, 400);
		pane.setPadding(new Insets(10,10,10,10));
		pane.setVgap(5);
		pane.setHgap(5);
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setGridLinesVisible(true);
		
		Label tongAdr1 = new Label(address1);
		Label tongAdr2 = new Label(address2);
		Label tongPhone = new Label(phoneNum);
		Label tongAdr4 = new Label("P.O. Box 135");
		Label tongAdr5 = new Label("P.O. Box 135");
		Label tongLicNum = new Label(licenceNum);
		Label invRefNum = new Label("Invoice Reference #");
	
		HBox secondHBox = new HBox();
		HBox thirdHBox = new HBox();
		
		//Create Address VBox for client information
		VBox vb = new VBox();
		vb.getChildren().addAll(tongAdr1,tongAdr2, tongPhone, tongLicNum);
		pane.add(vb, 1,0);
		
		/*
		//create ImageView for logo and place in the grid
		
		
		pane.add(image, 0,0);
		*/
		
		//Create Invoice HBox and place it in the pane
		VBox invVBox = new VBox();
		TextField tfInvoice = new TextField();
		invVBox.getChildren().addAll(invRefNum, tfInvoice);
		pane.add(invVBox, 2,0);
		
		//Create Second row of boxes for Customer information and place them on the grid
		String custPhone = "";
		String clientName = "";
		String custAddress = "";
		String custCity = "";
		String custState = "";
		String custZip = "";
		
		Label custPhoneLabel = new Label("Phone: ");
		Label custNameLabel = new Label("Client: ");
		Label custAdrLabel = new Label("Address: ");
		Label custAdrCityLabel = new Label("City: ");
		Label custAdrStateLabel = new Label("State: ");
		Label custAdrZipLabel = new Label("Zip: ");
		
		TextField tfcustPhone = new TextField();
		TextField tfcustName = new TextField();
		TextField tfcustAdr = new TextField();
		TextField tfcustAdrCity = new TextField();
		TextField tfcustAdrState = new TextField();
		TextField tfcustAdrZip = new TextField();
		
		GridPane custGrid = new GridPane();
		custGrid.add(custPhoneLabel,0,0);
		custGrid.add(tfcustPhone,1,0);
		custGrid.add(custNameLabel,0,1);
		custGrid.add(tfcustName,1,1);
		custGrid.add(custAdrLabel,0,2);
		custGrid.add(tfcustAdr,1,2);
		custGrid.add(custAdrCityLabel,0,3);
		custGrid.add(tfcustAdrCity,1,3);
		custGrid.add(custAdrStateLabel,0,4);
		custGrid.add(tfcustAdrState,1,4);
		custGrid.add(custAdrZipLabel,0,5);
		custGrid.add(tfcustAdrZip,1,5);
	
		pane.add(custGrid, 2,1);
		
		//Create the cleaning notice and place it in the grid
		
		//Create the kitchen cleaning service report boxes and place them in the grid
		
		//Create the misc Notes and Acknowledgment Boxes and place them in the grid
		
		
		Button btFinish = new Button("Submit");
		
		Scene scene = new Scene(pane , 500, 500);
		
		pane.add(secondHBox, 1,1);
		pane.add(thirdHBox, 1,2);
		
		primaryStage.setTitle("HCRGen");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args){
			Application.launch(args);
		}
}