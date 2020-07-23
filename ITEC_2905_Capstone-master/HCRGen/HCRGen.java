package HCRGen;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.awt.*;
import java.security.acl.*;


public class HCRGen extends Application {
	// Tong's Fire Extinguisher Sales and Service Information
	//String licenceNum = " Lic. # KE82431 & KE113954";
	String licNumTech1 = " Lic. # KE82431";
	String licNumTech2 = " Lic. # KE113954";
	String address1 = " P.O. Box 135 \n Elsinore, UT 84724";
	String address2 = " P.O. Box 3101 \n Cedar City, UT 84721";
	String phoneNum = " (435) 201-2182";

	
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException{
		//Create a main page VBox and set its atributes
		VBox mainVB = new VBox();
		mainVB.setMinSize(400, 400);
		mainVB.setPadding(new Insets(10,10,10,10));
		mainVB.setAlignment(Pos.TOP_CENTER);

		//Create the main page HBoxs, VBoxs and set thier atributes
		HBox hb1 = new HBox();
		hb1.setAlignment(Pos.TOP_CENTER);

		HBox hb2 = new HBox();
		hb2.setAlignment(Pos.TOP_CENTER);
		hb2.setPadding(new Insets(10,10,10,10));
		hb2.setSpacing(10);
		
		HBox hb3 = new HBox();
		hb3.setAlignment(Pos.TOP_CENTER);
		hb3.setPadding(new Insets(10,10,10,10));
		hb3.setSpacing(10);
		
		HBox hb4 = new HBox();
		hb4.setAlignment(Pos.TOP_CENTER);
		hb4.setPadding(new Insets(10,10,10,10));
		hb4.setSpacing(10);
		
		HBox hb5 = new HBox();
		hb5.setAlignment(Pos.TOP_CENTER);
		hb5.setPadding(new Insets(10,10,10,10));
		hb5.setSpacing(10);
		
		HBox hb6 = new HBox();
		hb6.setAlignment(Pos.TOP_CENTER);
		hb6.setPadding(new Insets(10,10,10,10));
		hb6.setSpacing(10);
		
		HBox hb7 = new HBox();
		hb6.setAlignment(Pos.TOP_LEFT);
		hb6.setPadding(new Insets(10,10,10,10));
		hb6.setSpacing(10);
			
		VBox vb1 = new VBox();
		vb1.setAlignment(Pos.BOTTOM_LEFT);
		vb1.setMinWidth(100);
		
		VBox vb2 = new VBox();
		vb2.setAlignment(Pos.BOTTOM_LEFT);
		vb2.setMinWidth(100);
		
		VBox vb3 = new VBox();
		vb3.setAlignment(Pos.TOP_CENTER);
		vb3.setMinWidth(100);
		
		VBox vb4 = new VBox();
		vb4.setAlignment(Pos.TOP_LEFT);
		vb4.setMinWidth(100);
		
	/*
	Items that go in hb1 go here
		~ Imageview of logo
		~ Buiseness Info
		~ Invoice box
	*/
		
		//create GridPane for the logo, buissness information and invoice Box
		GridPane headPane = new GridPane();
		headPane.setMinSize(200, 100);
		headPane.setPadding(new Insets(10,10,10,10));
		headPane.setVgap(50);
		headPane.setHgap(60);
		headPane.setAlignment(Pos.TOP_LEFT);
		headPane.setGridLinesVisible(false);
		
		//create ImageView for logo and place in the grid
		//Creating a Label
		Label logo = new Label();
		
		//Creating a graphic
		Image img = new Image(new FileInputStream("/Users/student/Desktop/ITEC_2905_Capstone-Master/HCRGen/TONGS FIRE EXTINGUISHER SALES AND SERVICE/TONGS-FIRE-EXTINGUISHER-SALES-AND-SERVICE.jpg"));
		ImageView view = new ImageView(img);
		view.setFitHeight(125);
		view.setFitWidth(225);
		view.setPreserveRatio(false);
		
		logo.setGraphic(view);

		//create address box labels for Tong's Fire Extinguisher Sales and Service
		Label tongAdr1 = new Label(address1);
		Label tongAdr2 = new Label(address2);
		Label tongPhone = new Label(phoneNum);
		Label tongLicNum1 = new Label(licNumTech1);
		Label tongLicNum2 = new Label(licNumTech2);
		
		//Create Address VBox for Tong's Fire Extinguisher Sales and Serviceinformation
		vb1.getChildren().addAll(tongAdr1, tongAdr2, tongPhone, tongLicNum1, tongLicNum2);
		
		//Create Invoice HBox and place it in the pane
		VBox invVBox = new VBox();
		invVBox.setAlignment(Pos.TOP_LEFT);
		
		Label invRefNum = new Label(" Invoice Reference #");
		TextField tfInvoice = new TextField();
		invVBox.getChildren().addAll(invRefNum, tfInvoice);
		
		//place boxes in the top pane
		headPane.add(logo, 0,0);		
		headPane.add(vb1, 1,0);
		headPane.add(invVBox, 2,0);
		
		//add completed headPane to hb1
		hb1.getChildren().addAll(headPane);
		
	/*
	Items that go in hb2 and go here
		~ Service Info Box
		~ Customer Info Box
	*/
	
		//Create Service Scedule Information box
		Label servLabel1 = new Label(" Service Scheduled with: ");
		Label servLabel2 = new Label(" Store Closing Manager: ");
		Label servLabel3 = new Label(" Date of Service: ");
		Label servLabel4 = new Label(" Service Every ");
		Label servLabel5 = new Label(" Time of Service: ");
		Label servLabel6 = new Label(" Next Service Due: ");
		Label servLabel8 = new Label(" ");
		
		TextField tfServ1 = new TextField("Bob \"The Mad Man\" Renolds");
		tfServ1.setMinWidth(205);
		TextField tfServ2 = new TextField();
		tfServ2.setMaxWidth(275);
		TextField tfServ3 = new TextField();
		tfServ3.setMaxWidth(75);
		TextField tfServ4 = new TextField();
		tfServ4.setMaxWidth(75);
		TextField tfServ5 = new TextField();
		tfServ5.setMaxWidth(75);
		TextField tfServ6 = new TextField();
		tfServ6.setMaxWidth(75);
		
		GridPane servGrid = new GridPane();
		servGrid.setMinSize(400, 100);
				
		servGrid.add(servLabel1,0,0);
		servGrid.add(tfServ1,1,0);
		servGrid.add(servLabel2,0,1);
		servGrid.add(tfServ2,1,1);
		servGrid.add(servLabel3,0,2);
		servGrid.add(tfServ3,1,2);
		servGrid.add(servLabel4,0,4);
		servGrid.add(tfServ4,1,4);
		servGrid.add(servLabel5,0,3);
		servGrid.add(tfServ5,1,3);
		servGrid.add(servLabel6,0,5);
		servGrid.add(tfServ6,1,5);
		
		servGrid.setAlignment(Pos.TOP_LEFT);
		
		//Create Second row of boxes for Customer information and place them on the grid
		String custPhone = "";
		String clientName = "";
		String custAddress = "";
		String custCity = "";
		String custState = "";
		String custZip = "";
		
		Label custPhoneLabel = new Label(" Phone: ");
		Label custNameLabel = new Label(" Client: ");
		Label custAdrLabel = new Label(" Address: ");
		Label custAdrCityLabel = new Label(" City: ");
		Label custAdrStateLabel = new Label(" State: ");
		Label custAdrZipLabel = new Label(" Zip: ");
		
		TextField tfcustPhone = new TextField("435-896-8021");
		tfcustPhone.setMaxWidth(115);
		TextField tfcustName = new TextField("Ted \"Bob's Boss\" Williams");
		tfcustName.setMinWidth(205);
		TextField tfcustAdr = new TextField("BFE north of no-where");
		tfcustAdr.setMaxWidth(275);
		TextField tfcustAdrCity = new TextField("Cedar City");
		tfcustAdrCity.setMaxWidth(115);
		TextField tfcustAdrState = new TextField("Arizona");
		tfcustAdrState.setMaxWidth(115);
		TextField tfcustAdrZip = new TextField("84720");
		tfcustAdrZip.setMaxWidth(115);
		
		GridPane custGrid = new GridPane();
		custGrid.add(custNameLabel,0,0);
		custGrid.add(tfcustName,1,0);
		
		custGrid.add(custPhoneLabel,0,5);
		custGrid.add(tfcustPhone,1,5);
		
		custGrid.add(custAdrLabel,0,1);
		custGrid.add(tfcustAdr,1,1);
		
		custGrid.add(custAdrCityLabel,0,2);
		custGrid.add(tfcustAdrCity,1,2);
		
		custGrid.add(custAdrStateLabel,0,3);
		custGrid.add(tfcustAdrState,1,3);
		
		custGrid.add(custAdrZipLabel,0,4);
		custGrid.add(tfcustAdrZip,1,4);

		hb2.setAlignment(Pos.TOP_LEFT);
		
		hb2.getChildren().addAll(servGrid, custGrid);
		
	/*
	Items that go in vb2 go here
		~ Notes to technitians *servLabel7*
		~ TextArea *taServ1*
	*/
		
		//Create cleaning notes text rea and label
		TextArea taServ1 = new TextArea();
		taServ1.setPrefHeight(50);
		Label servLabel7 = new Label(" Notes for Cleaning Technicians: ");
		vb2.getChildren().addAll(servLabel7, taServ1);
		
		/*
		Items that go in hb3 go here
			~ cleaning notice label *cLNOLabel*
		*/
		//Create the cleaning notice and place it in the grid
		Label clNoLabel = new Label("All cleaning is in accordance with the local fire codes and/or NFPA Standard Code #96. This courtesy follow-up report \nis provided as a free customer service only; it is not a paid consultation. The inspection of the exhaust system is limited \nto the possible need for improved access and cleaning only. Other deficiencies, wether reported or not, are beyond the \nscope of our cleaning crew's knowledge. it is the owner of the exhaust system's responsibility to take appropriate \naction to modify any deficiencies noted herein or elsewhere.");
		clNoLabel.setMaxWidth(750);
		hb3.getChildren().add(clNoLabel);
		

	/*
	Items that go in vb3 go here
		~ Kitchen Exhaust Cleaning Service Report Title bar
		~ Initial service check boxes
	*/
		
		//Create the kitchen cleaning service report boxes and place them in the grid
		Label kECSRLabel = new Label("KITCHEN EXHAUST CLEANING SERVICE REPORT");
		
		CheckBox iScb = new CheckBox("INITIAL SERVICE ");
		CheckBox rScb = new CheckBox("REGULAR SERVICE ");
		CheckBox iNcb = new CheckBox("INSPECTION ");
		hb4.getChildren().addAll(iScb, rScb, iNcb);
		
		
		vb3.getChildren().addAll(kECSRLabel, hb4);
		
	/*
	Items that go in hb5 go here
		~ Check In Box
		~ Check Out Box
	*/
	
		//Check In Box
		Label checkInLabel = new Label("Check In: ");
		Label cIYLabel = new Label("Yes ");
		Label cINLabel = new Label("No");
		Label lightLabel = new Label("Lit ");
		Label mediumLabel = new Label("Med ");
		Label heavyLabel = new Label("Hvy");
		Label dKWLabel = new Label("1. Key Works ");
		Label fWPLabel = new Label("2. Fans working Pproperly ");
		Label dIFWLabel = new Label("3. Defects in fan wiring ");
		Label aFHLabel = new Label("4. Fans Hinged ");
		Label fDWLabel = new Label("5. Floor Drains Working ");
		Label hLWLabel = new Label("6. Hood Lights working ");
		Label hGPLabel = new Label("7. Hood Globes Present ");
		Label rTCSLabel = new Label("8. Rooftop Grease Containment System ");
		Label gBURFLabel = new Label("9. Grease Build-Up around roof fan ");
		Label gBUFBLabel = new Label("10. Grease Build-Up Fan Blades ");
		Label gBUSDLabel = new Label("11. Grease Build-Up Stacks/Ductwork ");
		Label gBUHLabel = new Label("12. Grease Build-Up on Hoods ");
		Label gBUFiLabel = new Label("13. Grease Build-Up on Filter ");	
		
		RadioButton dKWrb1 = new RadioButton();
		RadioButton dKWrb2 = new RadioButton();
		RadioButton fWPrb1 = new RadioButton();
		RadioButton fWPrb2 = new RadioButton();
		RadioButton dIFrb1 = new RadioButton();
		RadioButton dIFrb2 = new RadioButton();
		RadioButton aFHrb1 = new RadioButton();
		RadioButton aFHrb2 = new RadioButton();
		RadioButton fDWrb1 = new RadioButton();
		RadioButton fDWrb2 = new RadioButton();
		RadioButton hLWrb1 = new RadioButton();
		RadioButton hLWrb2 = new RadioButton();
		RadioButton hGPrb1 = new RadioButton();
		RadioButton hGPrb2 = new RadioButton();
		RadioButton rTCSrb1 = new RadioButton();
		RadioButton rTCSrb2 = new RadioButton();
		
		RadioButton gBURFrb1 = new RadioButton();
		RadioButton gBURFrb2 = new RadioButton();
		RadioButton gBURFrb3 = new RadioButton();
		RadioButton gBUFBrb1 = new RadioButton();
		RadioButton gBUFBrb2 = new RadioButton();
		RadioButton gBUFBrb3 = new RadioButton();
		RadioButton gBUSDrb1 = new RadioButton();
		RadioButton gBUSDrb2 = new RadioButton();
		RadioButton gBUSDrb3 = new RadioButton();
		RadioButton gBUHrb1 = new RadioButton();
		RadioButton gBUHrb2 = new RadioButton();
		RadioButton gBUHrb3 = new RadioButton();
		RadioButton gBUFirb1 = new RadioButton();
		RadioButton gBUFirb2 = new RadioButton();
		RadioButton gBUFirb3 = new RadioButton();

		
		GridPane cIBGrid = new GridPane();
		cIBGrid.add(checkInLabel,0,0);
		cIBGrid.add(cIYLabel,1,0);
		cIBGrid.add(cINLabel,2,0);
		
		cIBGrid.add(dKWLabel,0,1);
		cIBGrid.add(dKWrb1,1,1);
		cIBGrid.add(dKWrb2,2,1);
		
		cIBGrid.add(fWPLabel,0,2);
		cIBGrid.add(fWPrb1,1,2);
		cIBGrid.add(fWPrb2,2,2);
		
		cIBGrid.add(dIFWLabel,0,3);
		cIBGrid.add(dIFrb1,1,3);
		cIBGrid.add(dIFrb2,2,3);
						
		cIBGrid.add(aFHLabel,0,4);
		cIBGrid.add(aFHrb1,1,4);
		cIBGrid.add(aFHrb2,2,4);
		
		cIBGrid.add(fDWLabel,0,5);
		cIBGrid.add(fDWrb1,1,5);
		cIBGrid.add(fDWrb2,2,5);
		
		cIBGrid.add(hLWLabel,0,6);
		cIBGrid.add(hLWrb1,1,6);
		cIBGrid.add(hLWrb2,2,6);
		
		cIBGrid.add(hGPLabel,0,7);
		cIBGrid.add(hGPrb1,1,7);
		cIBGrid.add(hGPrb2,2,7);
		
		cIBGrid.add(rTCSLabel,0,8);
		cIBGrid.add(rTCSrb1,1,8);
		cIBGrid.add(rTCSrb2,2,8);
		
		cIBGrid.add(lightLabel,1,9);
		cIBGrid.add(mediumLabel,2,9);
		cIBGrid.add(heavyLabel,3,9);
		
		cIBGrid.add(gBURFLabel,0,10);
		cIBGrid.add(gBURFrb1,1,10);
		cIBGrid.add(gBURFrb2,2,10);
		cIBGrid.add(gBURFrb3,3,10);
		
		cIBGrid.add(gBUFBLabel,0,11);
		cIBGrid.add(gBUFBrb1,1,11);
		cIBGrid.add(gBUFBrb2,2,11);
		cIBGrid.add(gBUFBrb3,3,11);
				
		cIBGrid.add(gBUSDLabel,0,12);
		cIBGrid.add(gBUSDrb1,1,12);
		cIBGrid.add(gBUSDrb2,2,12);
		cIBGrid.add(gBUSDrb3,3,12);
		
		cIBGrid.add(gBUHLabel,0,13);
		cIBGrid.add(gBUHrb1,1,13);
		cIBGrid.add(gBUHrb2,2,13);
		cIBGrid.add(gBUHrb3,3,13);
		
		cIBGrid.add(gBUFiLabel,0,14);
		cIBGrid.add(gBUFirb1,1,14);
		cIBGrid.add(gBUFirb2,2,14);
		cIBGrid.add(gBUFirb3,3,14);
			
		//Check Out Box
		Label checkOutLabel = new Label("Check Out: ");
		Label cOYLabel = new Label("Yes");
		Label cONLabel = new Label("No");
		Label cONewLabel = new Label("NEW    ");
		Label cOULabel = new Label("UPDATED");
		
		Label fWLRLabel = new Label("1. Fans working and left running ");
		Label rANFROLabel = new Label("2. Roof area near fan rinsed off ");
		Label hIWDLabel = new Label("3. Hood interior wiped dry ");
		Label kFCEWDLabel = new Label("4. Kitchen floor clean / Equipment wiped down ");
		Label oARCLabel = new Label("5. Outside area rinsed and clean ");
		Label hSFPWLabel = new Label("6. Hood, Stack, Fan pressure washed ");
		Label hDGLLabel = new Label("7. Any horizontal ductwork / give length ");
		Label aPGQLabel = new Label("8. Any access panels / give quantity ");
		Label sDWTLabel = new Label("9. Stack / Ductwork water tight ");
		Label pLRLabel = new Label("10. Pilot lights reignited ");
		Label hSRLabel = new Label("11. Hood Sticker replaced ");
		Label photoTLabel = new Label("12. Photos taken ");
		Label inaccessibleLabel = new Label("INACESSIBLE AREAS AND/OR FIRE CODE VIOLATIONS EXIST");
		
		RadioButton fWLRrb1 = new RadioButton();
		RadioButton fWLRrb2 = new RadioButton();
		RadioButton rANFROrb1 = new RadioButton();
		RadioButton rANFROrb2 = new RadioButton();
		RadioButton hIWDrb1 = new RadioButton();
		RadioButton hIWDrb2 = new RadioButton();
		RadioButton kFCEWDrb1 = new RadioButton();
		RadioButton kFCEWDrb2 = new RadioButton();
		RadioButton oARCrb1 = new RadioButton();
		RadioButton oARCrb2 = new RadioButton();
		RadioButton hSFPWrb1 = new RadioButton();
		RadioButton hSFPWrb2 = new RadioButton();
		RadioButton hDGLrb1 = new RadioButton();
		RadioButton hDGLrb2 = new RadioButton();
		RadioButton aPGQrb1 = new RadioButton();
		RadioButton aPGQrb2 = new RadioButton();
		RadioButton sDWTrb1 = new RadioButton();
		RadioButton sDWTrb2 = new RadioButton();
		RadioButton pLRrb1 = new RadioButton();
		RadioButton pLRrb2 = new RadioButton();
		RadioButton hSRrb1 = new RadioButton();
		RadioButton hSRrb2 = new RadioButton();
		RadioButton photoTrb1 = new RadioButton();
		RadioButton photoTrb2 = new RadioButton();
		
		GridPane cOBGrid = new GridPane();
		cOBGrid.add(checkOutLabel,0,0);
		cOBGrid.add(cOYLabel,1,0);
		cOBGrid.add(cONLabel,2,0);
		
		cOBGrid.add(fWLRLabel,0,1);
		cOBGrid.add(fWLRrb1,1,1);
		cOBGrid.add(fWLRrb2,2,1);
		
		cOBGrid.add(rANFROLabel,0,2);
		cOBGrid.add(rANFROrb1,1,2);
		cOBGrid.add(rANFROrb2,2,2);
		
		cOBGrid.add(hIWDLabel,0,3);
		cOBGrid.add(hIWDrb1,1,3);
		cOBGrid.add(hIWDrb2,2,3);
						
		cOBGrid.add(kFCEWDLabel,0,4);
		cOBGrid.add(kFCEWDrb1,1,4);
		cOBGrid.add(kFCEWDrb2,2,4);
		
		cOBGrid.add(oARCLabel,0,5);
		cOBGrid.add(oARCrb1,1,5);
		cOBGrid.add(oARCrb2,2,5);
		
		cOBGrid.add(hSFPWLabel,0,6);
		cOBGrid.add(hSFPWrb1,1,6);
		cOBGrid.add(hSFPWrb2,2,6);
		
		cOBGrid.add(hDGLLabel,0,7);
		cOBGrid.add(hDGLrb1,1,7);
		cOBGrid.add(hDGLrb2,2,7);
		
		cOBGrid.add(aPGQLabel,0,8);
		cOBGrid.add(aPGQrb1,1,8);
		cOBGrid.add(aPGQrb2,2,8);
		
		cOBGrid.add(sDWTLabel,0,9);
		cOBGrid.add(sDWTrb1,1,9);
		cOBGrid.add(sDWTrb2,2,9);
		
		cOBGrid.add(pLRLabel,0,10);
		cOBGrid.add(pLRrb1,1,10);
		cOBGrid.add(pLRrb2,2,10);
		
		cOBGrid.add(cONewLabel,1,11);
		cOBGrid.add(cOULabel,2,11);
		
		cOBGrid.add(hSRLabel,0,12);
		cOBGrid.add(hSRrb1,1,12);
		cOBGrid.add(hSRrb2,2,12);
		
		cOBGrid.add(photoTLabel,0,13);
		cOBGrid.add(photoTrb1,1,13);
		cOBGrid.add(photoTrb2,2,13);
		
		hb5.getChildren().addAll(cIBGrid, cOBGrid);
		
	/*
	Items that go in hb6 go here
		~ Time in Time out boxes 
	*/
	
		Label tILabel = new Label("TIME IN: ");
		Label tOLabel = new Label("TIME OUT: ");
		
		TextField tfTI = new TextField("10:00 PM");
		tfTI.setMaxWidth(80);
		TextField tfTO = new TextField();
		tfTO.setMaxWidth(80);
		
		hb6.getChildren().addAll(tILabel, tfTI, tOLabel, tfTO);
		
	/*
	Items that go in hb7 go here
		~ Misc notes text field
		~ Acknowledgement box
	*/
		Label miscNotLabel = new Label("Miscellaneous Notes:");
		Label techSigLabel = new Label("Technician: ");
		Label techSigDate = new Label("Date: ");
		
		TextArea miscNotTa = new TextArea("All Items Marked NO must have an Explaination");
		miscNotTa.setMaxHeight(80);
		
		vb4.getChildren().addAll(miscNotLabel, miscNotTa, techSigLabel, techSigDate);
		
		hb7.getChildren().addAll(vb4);
		
	/* END */
		
		mainVB.getChildren().addAll(hb1, hb2, vb2, hb3, vb3, hb5, hb6, hb7);
		
		//Create the misc Notes and Acknowledgment Boxes and place them in the grid
		
		
		Button btFinish = new Button("Submit");
		
		Scene scene = new Scene(mainVB , 775, 1000);
		
		primaryStage.setTitle("HCRGen");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args){
			Application.launch(args);
		}
}