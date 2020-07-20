package HCRGen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.*;





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
		Label invRefNum = new Label(" Invoice Reference #");
	
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
		HBox invHBox = new HBox();
		TextField tfInvoice = new TextField();
		invHBox.getChildren().addAll(invRefNum, tfInvoice);
		pane.add(invHBox, 2,0);
		
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
			
		pane.add(cIBGrid, 1,2);
		
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
		
		pane.add(cOBGrid, 2,2);
		
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