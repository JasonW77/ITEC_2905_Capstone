# ITEC_2905_Capstone

# **Javafx HCRGen application**

## Synopsis
This is an application to Generate reports for Tong's Fire Extinguisher Sales and Service, the user can add to the inventory by entering the Item name, Item Quantity, item Row location, Item Column location, item expiration date.
the user can also search the inventory to see what is infact inside the pantry before say buying something at the store.

## Motivation
This is a program for the Algorithms and Data structures CSCI-1115 class at Southwest Tech. 
I created this program for my final project in that clas as it encompasses the requirements of the assignment.

## How to use
This program is utilized via a javafx GUI.

The program starts empty and the user can enter new items by clicking on the "Enter New Item" button. 
[Main Menu Example](https://github.com/JasonW77/CSCI_1115_DataStructures_Coursework/blob/master/FinalProject/Screen%20Shot%202020-07-08%20at%2011.07.47%20AM.png)

The user will then enter an "Item Name", "Quantity", "Expiration", "Row Location", and "Column Loaction" in the respective fields.
when the user finishes with the data entry, they will click the "Finish" button and the entry will be saved in the inventory.
[Item Entry Exaample] (https://github.com/JasonW77/CSCI_1115_DataStructures_Coursework/blob/master/FinalProject/Screen%20Shot%202020-07-08%20at%2011.10.19%20AM.png)

To search for an item already in the inventory, the user will click the "Item Search" button. then enter the name of the item to be searched and hit the enter key, if the item is in the database the information will be returned.
[Item Search Example](https://github.com/JasonW77/CSCI_1115_DataStructures_Coursework/blob/master/FinalProject/Screen%20Shot%202020-07-08%20at%2011.09.46%20AM.png)
[Search Result/Cancel Entry Example](https://github.com/JasonW77/CSCI_1115_DataStructures_Coursework/blob/master/FinalProject/Screen%20Shot%202020-07-08%20at%2011.10.41%20AM.png)

At any point in a data entry if a mistake has been made or the user wishes to cancel thier input or task they can click the "Clear Entry" button to return to the previous menu.






## Code Example
here is a code example of the user adding an item to the database.

```
		btFinish.setOnAction(e -> {
			//Enter new item Pantry() constructor and add to map
			SimpleDateFormat eDate = new SimpleDateFormat("dd/mm/yy");
			String iN = itemName.getText().trim();
			int iQ = Integer.parseInt(itemQuan.getText().trim());
			java.util.Date iE = new java.util.Date();
			try {
				iE = eDate.parse(itemExp.getText().trim());
			} catch (ParseException parseEx) {
				parseEx.printStackTrace();
			}
			int iRL = Integer.parseInt(itemRLoc.getText().trim());
			int iCL = Integer.parseInt(itemCLoc.getText().trim());
			
			Pantry pan = new Pantry(iN, iQ, iE, iRL, iCL);
			map.put(pan.getIn(), pan);
			
			System.out.println(pan.myToString() + "\n");
```
## Code Example
here is a code example of the user search function.

```
		itemName.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER){
				if (itemQuan.isVisible() != true){
				String seaItem;
				
				itemName.setVisible(false);
				itemQuan.setVisible(false);
				itemExp.setVisible(false);
				itemRLoc.setVisible(false);
				itemCLoc.setVisible(false);
				
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				label5.setVisible(true);
				
				btFinish.setVisible(false);
				btNewItem.setVisible(false);
				btItemSearch.setVisible(false);
				btClearEntry.setVisible(true);
				
				seaItem = itemName.getText().trim();
				System.out.println("Search Item Detected: " + seaItem);
				System.out.println(map.get(seaItem));
				
				label1.setText("Item Name: " + ((Pantry) map.get(seaItem)).getIn());
				label2.setText("Quantity: " + ((Pantry) map.get(seaItem)).getQuantity());
				label3.setText("Expiration: " + ((Pantry) map.get(seaItem)).getExpiration());
				label4.setText("Row Location: " + ((Pantry) map.get(seaItem)).getRow());
				label5.setText("Column Location: " + ((Pantry) map.get(seaItem)).getColumn());
				}
			}
		});
```

## Tests
there are no value returning methods.
