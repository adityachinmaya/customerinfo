package midterm2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class infoController {
		String STATE;
		Customer customer = new Customer();
		
	    @FXML
	    private Button save;
	    @FXML
	    private TextField firstname;
	    @FXML
	    private TextField middleinital;
	    @FXML
	    private TextField lastname;
	    @FXML
	    private TextField address;
	    @FXML
	    private TextField city;
	    @FXML
	    private TextField zipcode;
	    @FXML
	    private RadioButton male;
	    @FXML
	    private RadioButton female;
	    @FXML
	    private MenuButton state;
	    @FXML
	    private void handleButtonClickSave(ActionEvent event){
	    	boolean Male;
	    	
	    	if (male.isSelected() == true) {
	    		Male = true;
	    	}
	    	else { 
	    		Male = false;
	    	}
	    	
	    	customer.setFirstName(firstname.getText());
	    	customer.setMiddleInit(middleinital.getText());
	    	customer.setLastName(lastname.getText());
	    	customer.setGender(Male);
	    	customer.setAddress(address.getText());
	    	customer.setCity(city.getText());
	    	customer.setState(STATE);
	    	customer.setZip(zipcode.getText());
	    	System.out.println(customer.getFirstName()+" "+customer.getMiddleInit()+" "+customer.getLastName() + customer.getAddress()+" "+customer.getZip()+" "+customer.getCity()+" "+customer.getState());
	    	System.out.println("Are they Male?" + customer.isGender());
	    }
	    
	    @FXML
	    private void handleButtonClickClear(ActionEvent event){
	    	
	    	firstname.setText(null);
	    	middleinital.setText(null);
	    	lastname.setText(null);
	    	address.setText(null);
	    	city.setText(null);
	    	state.setText("State");
	    	STATE = " ";
	    	zipcode.setText(null);
	    	male.setSelected(false);
	    	female.setSelected(false);
	    	System.out.println("In Progress");
	    }
	    @FXML
	    private void handleStateSelectionAL(ActionEvent event){
	    	STATE = "Alabama";
	    }
	    @FXML
	    private void handleStateSelectionAK(ActionEvent event){
	    	STATE = "Alaska";
	    }
	    @FXML
	    private void handleStateSelectionAZ(ActionEvent event){
	    	STATE = "Arizona";
	    }
	    @FXML
	    private void handleStateSelectionAR(ActionEvent event){
	    	STATE = "Arkansas";
	    }
	    @FXML
	    private void handleStateSelectionCA(ActionEvent event){
	    	STATE = "California";
	    }
	    @FXML
	    private void handleStateSelectionCO(ActionEvent event){
	    	STATE = "Colorado";
	    }
	    @FXML
	    private void handleStateSelectionCT(ActionEvent event){
	    	STATE = "Connecticut";
	    }
	    @FXML
	    private void handleStateSelectionDE(ActionEvent event){
	    	STATE = "Delaware";
	    }
	    @FXML
	    private void handleStateSelectionFL(ActionEvent event){
	    	STATE = "Florida";
	    }
	    @FXML
	    private void handleStateSelectionGA(ActionEvent event){
	    	STATE = "Georgia";
	    }
	    @FXML
	    private void handleStateSelectionHI(ActionEvent event){
	    	STATE = "Hawaii";
	    }
	    @FXML
	    private void handleStateSelectionID(ActionEvent event){
	    	STATE = "Idaho";
	    }
	    @FXML
	    private void handleStateSelectionIL(ActionEvent event){
	    	STATE = "Illinois";
	    }
	    @FXML
	    private void handleStateSelectionIN(ActionEvent event){
	    	STATE = "Indiana";
	    }
	    @FXML
	    private void handleStateSelectionIA(ActionEvent event){
	    	STATE = "Iowa";
	    }
	    @FXML
	    private void handleStateSelectionKS(ActionEvent event){
	    	STATE = "Kansas";
	    }
	    @FXML
	    private void handleStateSelectionKY(ActionEvent event){
	    	STATE = "Kentucky";
	    }
	    @FXML
	    private void handleStateSelectionLA(ActionEvent event){
	    	STATE = "Louisiana";
	    }
	    @FXML
	    private void handleStateSelectionME(ActionEvent event){
	    	STATE = "Maine";
	    }
	    @FXML
	    private void handleStateSelectionMD(ActionEvent event){
	    	STATE = "Maryland";
	    }
	    @FXML
	    private void handleStateSelectionMA(ActionEvent event){
	    	STATE = "Massachusetts";
	    }
	    @FXML
	    private void handleStateSelectionMI(ActionEvent event){
	    	STATE = "Michigan";
	    }
	    @FXML
	    private void handleStateSelectionMN(ActionEvent event){
	    	STATE = "Minnesota";
	    }
	    @FXML
	    private void handleStateSelectionMS(ActionEvent event){
	    	STATE = "Mississippi";
	    }
	    @FXML
	    private void handleStateSelectionMO(ActionEvent event){
	    	STATE = "Missouri";
	    }
	    @FXML
	    private void handleStateSelectionMT(ActionEvent event){
	    	STATE = "Montana";
	    }
	    @FXML
	    private void handleStateSelectionNE(ActionEvent event){
	    	STATE = "Nebraska";
	    }
	    @FXML
	    private void handleStateSelectionNV(ActionEvent event){
	    	STATE = "Nevada";
	    }
	    @FXML
	    private void handleStateSelectionNH(ActionEvent event){
	    	STATE = "New Hampshire";
	    }
	    @FXML
	    private void handleStateSelectionNJ(ActionEvent event){
	    	STATE = "New Jersey";
	    }
	    @FXML
	    private void handleStateSelectionNM(ActionEvent event){
	    	STATE = "New Mexico";
	    }
	    @FXML
	    private void handleStateSelectionNY(ActionEvent event){
	    	STATE = "New York";
	    }
	    @FXML
	    private void handleStateSelectionNC(ActionEvent event){
	    	STATE = "North Carolina";
	    }
	    @FXML
	    private void handleStateSelectionND(ActionEvent event){
	    	STATE = "North Dakota";
	    }
	    @FXML
	    private void handleStateSelectionOH(ActionEvent event){
	    	STATE = "Ohio";
	    }
	    @FXML
	    private void handleStateSelectionOK(ActionEvent event){
	    	STATE = "Oklahoma";
	    }
	    @FXML
	    private void handleStateSelectionOR(ActionEvent event){
	    	STATE = "Oregon";
	    }
	    @FXML
	    private void handleStateSelectionPA(ActionEvent event){
	    	STATE = "Pennsylvania";
	    }
	    @FXML
	    private void handleStateSelectionRI(ActionEvent event){
	    	STATE = "Rhode Island";
	    }
	    @FXML
	    private void handleStateSelectionSC(ActionEvent event){
	    	STATE = "South Carolina";
	    }
	    @FXML
	    private void handleStateSelectionSD(ActionEvent event){
	    	STATE = "South Dakota";
	    }
	    @FXML
	    private void handleStateSelectionTN(ActionEvent event){
	    	STATE = "Tennessee";
	    }
	    @FXML
	    private void handleStateSelectionTX(ActionEvent event){
	    	STATE = "Texas";
	    }
	    @FXML
	    private void handleStateSelectionVT(ActionEvent event){
	    	STATE = "Vermont";
	    }
	    @FXML
	    private void handleStateSelectionVA(ActionEvent event){
	    	STATE = "Virginia";
	    }
	    @FXML
	    private void handleStateSelectionWA(ActionEvent event){
	    	STATE = "Washington";
	    }
	    @FXML
	    private void handleStateSelectionWV(ActionEvent event){
	    	STATE = "West Virginia";
	    }
	    @FXML
	    private void handleStateSelectionWI(ActionEvent event){
	    	STATE = "Wisconsin";
	    }
	    @FXML
	    private void handleStateSelectionWY(ActionEvent event){
	    	STATE = "Wyoming";
	    }
	 
}