package HCRGen;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.control.ScrollPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.*;
import javafx.scene.layout.StackPane;
import java.awt.ActiveEvent;
import javax.swing.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.acl.*;
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.*;



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
		ScrollPane sp = new ScrollPane();
		VBox mainVB = new VBox();
		mainVB.setVgrow(sp, Priority.ALWAYS);
		sp.setContent(mainVB);

		mainVB.setMinSize(400, 400);
		mainVB.setPadding(new Insets(10,10,10,10));
		mainVB.setAlignment(Pos.TOP_CENTER);

		//Create the main page HBoxs, VBoxs and set thier atributes
		HBox hb1 = new HBox();
		hb1.setAlignment(Pos.TOP_CENTER);
		hb1.setPadding(new Insets(10,10,10,10));
		hb1.setSpacing(10);
		
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
		hb6.setAlignment(Pos.TOP_LEFT);
		hb6.setPadding(new Insets(10,10,10,10));
		hb6.setSpacing(10);
		
		HBox hb7 = new HBox();
		hb7.setAlignment(Pos.TOP_LEFT);
		hb7.setPadding(new Insets(10,10,10,10));
		hb7.setSpacing(10);
		
		HBox hb8 = new HBox();
		hb8.setAlignment(Pos.TOP_LEFT);
		hb8.setPadding(new Insets(10,10,10,10));
		hb8.setSpacing(10);
		
		HBox hb9 = new HBox();
		hb9.setAlignment(Pos.TOP_LEFT);
		hb9.setPadding(new Insets(10,10,10,10));
		hb9.setSpacing(10);
		
		HBox hb10 = new HBox();
		hb10.setAlignment(Pos.TOP_LEFT);
		hb10.setPadding(new Insets(10,10,10,10));
		hb10.setSpacing(10);
		
		HBox hb11 = new HBox();
		hb11.setAlignment(Pos.TOP_LEFT);
		hb11.setPadding(new Insets(10,10,10,10));
		hb11.setSpacing(10);
		
		HBox hb12 = new HBox();
		hb12.setAlignment(Pos.TOP_LEFT);
		hb12.setPadding(new Insets(10,10,10,10));
		hb12.setSpacing(10);
			
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
		
		VBox vb5 = new VBox();
		vb5.setAlignment(Pos.TOP_LEFT);
		vb5.setMinWidth(100);
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
		TextField tfInvoice = new TextField("fake number");
		tfInvoice.setFont(new Font("Cambria", 10));
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
		
		TextField tfServ1 = new TextField("Fake Name 1");
		tfServ1.setMinWidth(205);
		tfServ1.setFont(new Font("Cambria", 10));
		TextField tfServ2 = new TextField("Fake Name 2");
		tfServ2.setFont(new Font("Cambria", 10));
		tfServ2.setMaxWidth(275);
		TextField tfServ3 = new TextField("Fake Date 1");
		tfServ3.setFont(new Font("Cambria", 10));
		tfServ3.setMaxWidth(75);
		TextField tfServ4 = new TextField("Fake Date 2");
		tfServ4.setFont(new Font("Cambria", 10));
		tfServ4.setMaxWidth(75);
		TextField tfServ5 = new TextField("Fake Time");
		tfServ5.setFont(new Font("Cambria", 10));
		tfServ5.setMaxWidth(75);
		TextField tfServ6 = new TextField("Fake Date 3");
		tfServ6.setFont(new Font("Cambria", 10));
		tfServ6.setMaxWidth(75);
		
		GridPane servGrid = new GridPane();
		servGrid.setMinSize(400, 100);
				
		servGrid.add(servLabel1,0,0);
		servGrid.add(tfServ1,1,0);
		servGrid.add(servLabel2,0,1);
		servGrid.add(tfServ2,1,1);
		servGrid.add(servLabel3,0,2);
		servGrid.add(tfServ3,1,2);
		servGrid.add(servLabel5,0,3);
		servGrid.add(tfServ5,1,3);
		servGrid.add(servLabel4,0,4);
		servGrid.add(tfServ4,1,4);
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
		
		TextField tfcustPhone = new TextField("Fake Phone Number");
		tfcustPhone.setFont(new Font("Cambria", 10));
		tfcustPhone.setMaxWidth(115);
		TextField tfcustName = new TextField("Fake Name 1");
		tfcustName.setFont(new Font("Cambria", 10));
		tfcustName.setMinWidth(205);
		TextField tfcustAdr = new TextField("Fake address");
		tfcustAdr.setFont(new Font("Cambria", 10));
		tfcustAdr.setMaxWidth(275);
		TextField tfcustAdrCity = new TextField("Fake City");
		tfcustAdrCity.setFont(new Font("Cambria", 10));
		tfcustAdrCity.setMaxWidth(115);
		TextField tfcustAdrState = new TextField("Fake State");
		tfcustAdrState.setFont(new Font("Cambria", 10));
		tfcustAdrState.setMaxWidth(115);
		TextField tfcustAdrZip = new TextField("Fake Zipcode");
		tfcustAdrZip.setFont(new Font("Cambria", 10));
		tfcustAdrZip.setMaxWidth(115);
		
		GridPane custGrid = new GridPane();
		custGrid.add(custNameLabel,0,0);
		custGrid.add(tfcustName,1,0);
		
		custGrid.add(custAdrLabel,0,1);
		custGrid.add(tfcustAdr,1,1);
		
		custGrid.add(custAdrCityLabel,0,2);
		custGrid.add(tfcustAdrCity,1,2);
		
		custGrid.add(custAdrStateLabel,0,3);
		custGrid.add(tfcustAdrState,1,3);
		
		custGrid.add(custAdrZipLabel,0,4);
		custGrid.add(tfcustAdrZip,1,4);
		
		custGrid.add(custPhoneLabel,0,5);
		custGrid.add(tfcustPhone,1,5);
		
		hb2.setAlignment(Pos.TOP_LEFT);
		
		hb2.getChildren().addAll(servGrid, custGrid);
		
	/*
	Items that go in vb2 go here
		~ Notes to technitians *servLabel7*
		~ TextArea *taServ1*
	*/
		
		//Create cleaning notes text rea and label
		TextArea taServ1 = new TextArea("Fake cleaning Notes");
		taServ1.setPrefHeight(50);
		taServ1.setMaxWidth(750);

		Label servLabel7 = new Label(" Notes for Cleaning Technicians: ");
		
		vb2.getChildren().addAll(servLabel7, taServ1);
		
		/*
		Items that go in hb3 go here
			~ cleaning notice label *cLNOLabel*
		*/
		//Create the cleaning notice and place it in the grid
		Label clNoLabel = new Label("All cleaning is in accordance with the local fire codes and/or NFPA Standard Code #96. This courtesy follow-up report is provided as a free customer service only; it is not a paid consultation. The inspection of the exhaust system is limited to the possible need for improved access and cleaning only. Other deficiencies, wether reported or not, are beyond the scope of our cleaning crew's knowledge. it is the owner of the exhaust system's responsibility to take appropriate action to modify any deficiencies noted herein or elsewhere.");
		clNoLabel.setFont(new Font("Cambria", 10));
		clNoLabel.setMaxWidth(750);
		clNoLabel.setWrapText(true);
		hb3.getChildren().add(clNoLabel);
		

	/*
	Items that go in vb3 go here
		~ Kitchen Exhaust Cleaning Service Report Title bar
		~ Initial service check boxes
	*/
		
		//Create the kitchen cleaning service report boxes and place them in the grid
		Label kECSRLabel = new Label("KITCHEN EXHAUST CLEANING SERVICE REPORT");
		
		ToggleGroup kECSR = new ToggleGroup();
		RadioButton iScb = new RadioButton("INITIAL SERVICE ");
		iScb.setToggleGroup(kECSR);
		RadioButton rScb = new RadioButton("REGULAR SERVICE ");
		rScb.setToggleGroup(kECSR);
		RadioButton iNcb = new RadioButton("INSPECTION ");
		iNcb.setToggleGroup(kECSR);
		
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
		cIYLabel.setFont(new Font("Cambria", 10));
		Label cINLabel = new Label("No");
		cINLabel.setFont(new Font("Cambria", 10));
		Label lightLabel = new Label("Light ");
		lightLabel.setFont(new Font("Cambria", 10));
		Label mediumLabel = new Label("Med ");
		mediumLabel.setFont(new Font("Cambria", 10));
		Label heavyLabel = new Label("Heavy");
		heavyLabel.setFont(new Font("Cambria", 10));
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
		
		ToggleGroup dkW = new ToggleGroup();
		RadioButton dKWrb1 = new RadioButton();
		dKWrb1.setToggleGroup(dkW);
		RadioButton dKWrb2 = new RadioButton();
		dKWrb2.setToggleGroup(dkW);
		
		ToggleGroup fWP = new ToggleGroup();
		RadioButton fWPrb1 = new RadioButton();
		fWPrb1.setToggleGroup(fWP);
		RadioButton fWPrb2 = new RadioButton();
		fWPrb2.setToggleGroup(fWP);
		
		ToggleGroup dIF = new ToggleGroup();
		RadioButton dIFrb1 = new RadioButton();
		dIFrb1.setToggleGroup(dIF);
		RadioButton dIFrb2 = new RadioButton();
		dIFrb2.setToggleGroup(dIF);
		
		ToggleGroup aFH = new ToggleGroup();
		RadioButton aFHrb1 = new RadioButton();
		aFHrb1.setToggleGroup(aFH);
		RadioButton aFHrb2 = new RadioButton();
		aFHrb2.setToggleGroup(aFH);
		
		ToggleGroup fDW = new ToggleGroup();
		RadioButton fDWrb1 = new RadioButton();
		fDWrb1.setToggleGroup(fDW);
		RadioButton fDWrb2 = new RadioButton();
		fDWrb2.setToggleGroup(fDW);
		
		ToggleGroup hLW = new ToggleGroup();
		RadioButton hLWrb1 = new RadioButton();
		hLWrb1.setToggleGroup(hLW);
		RadioButton hLWrb2 = new RadioButton();
		hLWrb2.setToggleGroup(hLW);
		
		ToggleGroup hGP = new ToggleGroup();
		RadioButton hGPrb1 = new RadioButton();
		hGPrb1.setToggleGroup(hGP);
		RadioButton hGPrb2 = new RadioButton();
		hGPrb2.setToggleGroup(hGP);
		
		ToggleGroup rTCS = new ToggleGroup();
		RadioButton rTCSrb1 = new RadioButton();
		rTCSrb1.setToggleGroup(rTCS);
		RadioButton rTCSrb2 = new RadioButton();
		rTCSrb2.setToggleGroup(rTCS);
		
		ToggleGroup gBURF = new ToggleGroup();
		RadioButton gBURFrb1 = new RadioButton();
		gBURFrb1.setToggleGroup(gBURF);
		RadioButton gBURFrb2 = new RadioButton();
		gBURFrb2.setToggleGroup(gBURF);
		RadioButton gBURFrb3 = new RadioButton();
		gBURFrb3.setToggleGroup(gBURF);
		
		ToggleGroup gBUFB = new ToggleGroup();
		RadioButton gBUFBrb1 = new RadioButton();
		gBUFBrb1.setToggleGroup(gBUFB);
		RadioButton gBUFBrb2 = new RadioButton();
		gBUFBrb2.setToggleGroup(gBUFB);
		RadioButton gBUFBrb3 = new RadioButton();
		gBUFBrb3.setToggleGroup(gBUFB);
		
		ToggleGroup gBUSD = new ToggleGroup();
		RadioButton gBUSDrb1 = new RadioButton();
		gBUSDrb1.setToggleGroup(gBUSD);
		RadioButton gBUSDrb2 = new RadioButton();
		gBUSDrb2.setToggleGroup(gBUSD);
		RadioButton gBUSDrb3 = new RadioButton();
		gBUSDrb3.setToggleGroup(gBUSD);
		
		ToggleGroup gBUH = new ToggleGroup();
		RadioButton gBUHrb1 = new RadioButton();
		gBUHrb1.setToggleGroup(gBUH);
		RadioButton gBUHrb2 = new RadioButton();
		gBUHrb2.setToggleGroup(gBUH);
		RadioButton gBUHrb3 = new RadioButton();
		gBUHrb3.setToggleGroup(gBUH);
		
		ToggleGroup gBUFi = new ToggleGroup();
		RadioButton gBUFirb1 = new RadioButton();
		gBUFirb1.setToggleGroup(gBUFi);
		RadioButton gBUFirb2 = new RadioButton();
		gBUFirb2.setToggleGroup(gBUFi);
		RadioButton gBUFirb3 = new RadioButton();
		gBUFirb3.setToggleGroup(gBUFi);

		
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
		cOYLabel.setFont(new Font("Cambria", 10));
		Label cONLabel = new Label("No");
		cONLabel.setFont(new Font("Cambria", 10));
		Label cONewLabel = new Label("NEW    ");
		cONewLabel.setFont(new Font("Cambria", 10));
		Label cOULabel = new Label("UPDATE");
		cOULabel.setFont(new Font("Cambria", 10));		
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
		Label photoTLabel = new Label("11. Photos taken ");
		Label hSRLabel = new Label("12. Hood Sticker replaced ");

		CheckBox inAccCB = new CheckBox("INACESSIBLE AREAS AND/OR FIRE CODE VIOLATIONS EXIST");
		inAccCB.setFont(new Font("Cambria", 10));
		
		ToggleGroup fWLR = new ToggleGroup();
		RadioButton fWLRrb1 = new RadioButton();
		fWLRrb1.setToggleGroup(fWLR);
		RadioButton fWLRrb2 = new RadioButton();
		fWLRrb2.setToggleGroup(fWLR);
		
		ToggleGroup rANFRO = new ToggleGroup();
		RadioButton rANFROrb1 = new RadioButton();
		rANFROrb1.setToggleGroup(rANFRO);
		RadioButton rANFROrb2 = new RadioButton();
		rANFROrb2.setToggleGroup(rANFRO);
		
		
		ToggleGroup hIWD = new ToggleGroup();
		RadioButton hIWDrb1 = new RadioButton();
		hIWDrb1.setToggleGroup(hIWD);
		RadioButton hIWDrb2 = new RadioButton();
		hIWDrb2.setToggleGroup(hIWD);
		
		ToggleGroup kFCEWD = new ToggleGroup();
		RadioButton kFCEWDrb1 = new RadioButton();
		kFCEWDrb1.setToggleGroup(kFCEWD);
		RadioButton kFCEWDrb2 = new RadioButton();
		kFCEWDrb2.setToggleGroup(kFCEWD);
		
		ToggleGroup oARC = new ToggleGroup();
		RadioButton oARCrb1 = new RadioButton();
		oARCrb1.setToggleGroup(oARC);
		RadioButton oARCrb2 = new RadioButton();
		oARCrb2.setToggleGroup(oARC);
		
		ToggleGroup hSFPW = new ToggleGroup();
		RadioButton hSFPWrb1 = new RadioButton();
		hSFPWrb1.setToggleGroup(hSFPW);
		RadioButton hSFPWrb2 = new RadioButton();
		hSFPWrb2.setToggleGroup(hSFPW);
		
		ToggleGroup hDGL = new ToggleGroup();
		RadioButton hDGLrb1 = new RadioButton();
		hDGLrb1.setToggleGroup(hDGL);
		RadioButton hDGLrb2 = new RadioButton();
		hDGLrb2.setToggleGroup(hDGL);
		
		ToggleGroup aPGQ = new ToggleGroup();
		RadioButton aPGQrb1 = new RadioButton();
		aPGQrb1.setToggleGroup(aPGQ);
		RadioButton aPGQrb2 = new RadioButton();
		aPGQrb2.setToggleGroup(aPGQ);
		
		ToggleGroup sDWT = new ToggleGroup();
		RadioButton sDWTrb1 = new RadioButton();
		sDWTrb1.setToggleGroup(sDWT);
		RadioButton sDWTrb2 = new RadioButton();
		sDWTrb2.setToggleGroup(sDWT);
		
		ToggleGroup pLR = new ToggleGroup();
		RadioButton pLRrb1 = new RadioButton();
		pLRrb1.setToggleGroup(pLR);
		RadioButton pLRrb2 = new RadioButton();
		pLRrb2.setToggleGroup(pLR);
		
		ToggleGroup hSR = new ToggleGroup();
		RadioButton hSRrb1 = new RadioButton();
		hSRrb1.setToggleGroup(hSR);
		RadioButton hSRrb2 = new RadioButton();
		hSRrb2.setToggleGroup(hSR);
		
		ToggleGroup photoT = new ToggleGroup();
		RadioButton photoTrb1 = new RadioButton();
		photoTrb1.setToggleGroup(photoT);
		RadioButton photoTrb2 = new RadioButton();
		photoTrb2.setToggleGroup(photoT);
		
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
		
		cOBGrid.add(photoTLabel,0,11);
		cOBGrid.add(photoTrb1,1,11);
		cOBGrid.add(photoTrb2,2,11);
		
		cOBGrid.add(cONewLabel,1,12);
		cOBGrid.add(cOULabel,2,12);
		
		cOBGrid.add(hSRLabel,0,13);
		cOBGrid.add(hSRrb1,1,13);
		cOBGrid.add(hSRrb2,2,13);
		
		cOBGrid.add(inAccCB,0,14);
		
		hb5.getChildren().addAll(cIBGrid, cOBGrid);
		
	/*
	Items that go in hb6 go here
		~ Time in Time out boxes 
	*/
	
		Label tILabel = new Label("TIME IN: ");
		Label tOLabel = new Label("TIME OUT: ");
		
		TextField tfTI = new TextField("Fake Time in");
		tfTI.setFont(new Font("Cambria", 10));
		tfTI.setMaxWidth(80);
		TextField tfTO = new TextField("Fake Time out");
		tfTO.setFont(new Font("Cambria", 10));
		tfTO.setMaxWidth(80);
		
		hb6.getChildren().addAll(tILabel, tfTI, tOLabel, tfTO);
		
	/*
	Items that go in hb7 go here
		~ Misc notes text field
		~ Acknowledgement box
	*/
		//Create the misc Notes and Acknowledgment Boxes and place them in the grid
		Label miscNotLabel = new Label("Misc. Notes: All Items Marked NO must have an Explaination");
		Label techSigLabel = new Label("Technician:");
		Label techSigDate = new Label("Date:    	");
		Label claimLabel = new Label("\nClaims of unsatisfactory workmanship must be made within 48 hours. Invoices are subject to an intrest charge of the lesser of 1.5% per month(18% per year) or the maximum rate allowed by law on any unpaid invoices outstanding after 30 days from date of service. The Customer herby waives thier rights of subrogation by thier insurance carrier against Tong's Fire Extinguisher under any fire or liability insurance policy.");
		claimLabel.setMaxWidth(375);
		claimLabel.setFont(new Font("Cambria", 10));
		claimLabel.setWrapText(true);

		Label eventLabel = new Label("IN THE EVENT OF DEFAULT, TONG'S FIRE EXTINGUISHER SHALL BE ENTITLED TO RECOVER COST OF COLLECTION, INCLUDING REASONABLE ATTORNEY FEES.");
		eventLabel.setMaxWidth(375);
		eventLabel.setWrapText(true);
		Label ackLabel = new Label("ACKNOWLEDGMENT OF KITCHEN CONDITION & KEC SERVICE COMPLETED. BY SIGNING BELOW THE CUSTOMER ACKNOWLEDGES SERVICE WAS COMPLETED AND THE KITCHEN WAS LEFT CLEAN AND IN SATISFACTORY CONDITION.");
		ackLabel.setFont(new Font("Cambria", 10));
		ackLabel.setWrapText(true);
		ackLabel.setMaxWidth(375);
		Label custSignLabel = new Label("Customer Name: ");
		
		TextArea miscNotTa = new TextArea("Fake Misc notes");
		miscNotTa.setFont(new Font("Cambria", 10));
		miscNotTa.setWrapText(true);
		miscNotTa.setMaxWidth(375);

		TextField techtf = new TextField();
		techtf.setFont(new Font("Cambria", 10));
		TextField techDatetf = new TextField();
		techDatetf.setFont(new Font("Cambria", 10));
		TextField custSigntf = new TextField();
		custSigntf.setFont(new Font("Cambria", 10));
		Button btFinish = new Button("Submit");
		Button btPrint = new Button("Print");
		
		hb9.getChildren().addAll(techSigLabel,techtf);
		hb10.getChildren().addAll(techSigDate, techDatetf);
		
		vb4.getChildren().addAll(miscNotLabel, miscNotTa, hb9, hb10, btFinish, btPrint);
		
		//send image of GUI to file.
		btFinish.setOnAction(e -> {
				Label printLabel = new Label("HCRGen Report");
				
				StackPane printStage = new StackPane();
				TextArea printTa = new TextArea();
				printTa.setEditable(false);
			
				printTa.appendText("Tong's Fire Extinguisher Sales and Service\t\t\t\t\tInvoice Number: \t" + tfInvoice.getText() + "\n"
				+ " P.O. Box 135 Elsinore, UT 84724\t\t\t\t\t\t\t" + tfcustName.getText() + "\n"
				+ " P.O. Box 3101 Cedar City, UT 84721\t\t\t\t\t\t" +  tfcustAdr.getText() + "\n"
				+ " (435) 201-2182\t\t\t\t\t\t\t\t\t\t" + tfcustAdrCity.getText() + ", " + tfcustAdrState.getText() + ", " +tfcustAdrZip.getText()+ "\n"
				+ "Lic. #'s KE82431, "+ "KE113954\t\t\t\t\t\t\t\t" + tfcustPhone.getText() + "\n" 
				+ "\n"
				+ " Service Scheduled with:\t" + tfServ1.getText() + "\n"
				+ " Store Closing Manager:\t" + tfServ2.getText()+ "\n"
				+ " Date of Service:\t\t\t" + tfServ3.getText()+ "\n"
				+ " Service Every:\t\t\t" + tfServ4.getText()+ "\n"
				+ " Time of Service:\t\t\t" + tfServ5.getText()+ "\n"
				+ " Next Service Due:\t\t\t" + tfServ6.getText()+ "\n"
				+ "\n"
				+ "Notes to cleaning Technicians:\n"
				+ taServ1.getText() + "\n"
				+ "\n"
				+ "All cleaning is in accordance with the local fire codes and/or NFPA Standard Code #96. This courtesy follow-up report is \nprovided as a free customer service only; it is not a paid consultation. The inspection of the exhaust system is limited to the \npossible need for improved access and cleaning only. Other deficiencies, wether reported or not, are beyond the scope of our \ncleaning crew's knowledge. it is the owner of the exhaust system's responsibility to take appropriate action to modify any \ndeficiencies noted herein or elsewhere.\n"
				+ "\n"
				+ "KITCHEN EXHAUST CLEANING SERVICE REPORT\n"
				+ "Type of Service completed:\t" + "\n"
				+ "Check in: \t\t\t\t\t\t\t\t\t\t Check Out: " + "\n"
				+ "1. Key works: \t\t\t\t\t\t\t\t\t\t" + "1. Fans working and left running: " + "\n"
				+ "2. Fans working propperly: \t\t\t\t\t\t\t" + "2. Roof area near fan rised off: " + "\n"
				+ "3. Defects in fan wiring: \t\t\t\t\t\t\t" + "3. Hood interior wiped dry: " + "\n"
				+ "4. Fans hinged: \t\t\t\t\t\t\t\t\t" + "4. Kitchen floor clean/Equipment wiped down: " + "\n"
				+ "5. Floor drains working: \t\t\t\t\t\t\t" + "5. Outside area rinsed and clean: " + "\n"
				+ "6. Hood lights working: \t\t\t\t\t\t\t\t" + "6. Hood, Stack, Fan pressure washed: " + "\n"
				+ "7. Hood globes present: \t\t\t\t\t\t\t" + "7. Any horizontal ductwork: " + "\n"
				+ "8. Rooftop grease containment system: \t\t\t\t" + "8. any acess panels: " + "\n"
				+ "9. Grease buildup around roof fan: \t\t\t\t\t" + "9. Stack/Ductwork water tight: " + "\n"
				+ "10. Grease build up on fan blades: \t\t\t\t\t" + "10. Pilot lights reignited: " + "\n"
				+ "11. Grease build up on Stacks/Ductwork: \t\t\t\t" + "11. Photos taken: " + "\n"
				+ "12. Grease build up on Hoods: \t\t\t\t\t\t" + "12. Hood Sticker replaced: " + "\n"
				+ "13. Grease build up on Filter: \t\t\t\t\t\t" + "Inaccessible areas?: " + "\n"
				+ "Time In:\t" + tfTI.getText()+ " \t\t\t\t\t\t\t\tTime Out:\t" + tfTO.getText()+ "\n"
				+ "Miscellaneous Notes:\n"
				+ miscNotTa.getText() + "\n"
				+ "Cleaning Technician that performed service: " + techtf.getText() + "\t\t\t\t\t\t Date Completed: " + techDatetf.getText() +"\n"
				+ "\nClaims of unsatisfactory workmanship must be made within 48 hours. Invoices are subject to an intrest charge of the lesser of \n1.5% per month(18% per year) or the maximum rate allowed by law on any unpaid invoices outstanding after 30 days from date \nof service. The Customer herby waives thier rights of subrogation by thier insurance carrier against Tong's Fire Extinguisher \nunder any fire or liability insurance policy.\n"
				+ "IN THE EVENT OF DEFAULT, TONG'S FIRE EXTINGUISHER SHALL BE ENTITLED TO RECOVER COST OF COLLECTION, \nINCLUDING REASONABLE ATTORNEY FEES. \nACKNOWLEDGMENT OF KITCHEN CONDITION & KEC SERVICE COMPLETED. BY SIGNING BELOW THE CUSTOMER \nACKNOWLEDGES SERVICE WAS COMPLETED AND THE KITCHEN WAS LEFT CLEAN AND IN SATISFACTORY CONDITION.\n"

				
				);
				/*				

				*/
				printStage.getChildren().addAll(printLabel,printTa);

				Scene printScene = new Scene(printStage , 800, 1000);
				
				Stage printWindow = new Stage();
				printWindow.setTitle("HCRGen Report");
				printWindow.setScene(printScene);
				
				printWindow.setX(100);
				printWindow.setY(100);
				
				printWindow.show();
			//}

		});
		
		btPrint.setOnAction(e -> {
			
			try (
				FileOutputStream oos = new FileOutputStream("Tongs_Report", true);
				){
				captureScreen("Tongs_Report");
				System.out.println("Image saved to file!");
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
		});
		
		CheckBox keyCB = new CheckBox("Key ");
		CheckBox noAvailCB = new CheckBox("No one available to sign ");
		
		hb8.getChildren().addAll(keyCB, noAvailCB);
		hb11.getChildren().addAll(custSignLabel,custSigntf);
		
		vb5.getChildren().addAll(claimLabel, eventLabel, hb8, ackLabel, hb11);
		
		hb7.getChildren().addAll(vb4, vb5);
		
	/* END */
		
		mainVB.getChildren().addAll(hb1, hb2, vb2, hb3, vb3, hb5, hb6, hb7);
		
		Scene scene = new Scene(sp , 800, 1000);
		
		primaryStage.setTitle("HCRGen");
		primaryStage.setX(0);
		primaryStage.setY(0);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public void captureScreen(String fileName) throws Exception {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(10, 45, 775, 944);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		ImageIO.write(image, "png", new File(fileName));
	}
	public static void main(String[] args){
			Application.launch(args);
		}
}