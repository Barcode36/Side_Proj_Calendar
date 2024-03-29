package side_project_calendar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URL;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.LoadException;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MonthController implements Initializable {
    
    
    //GUI variables*************************************************************
        @FXML
        private Pane topPane, bottomPane, holidayVbox, eventsVbox;
        @FXML
        private TextField eventDescription;
        @FXML
        private GridPane calendarPane;
        @FXML
        private TextArea eventsTextArea;
        
        // individual dates (1 - 31) or days (monday - sunday)
        @FXML
        private Label SUNDAY_LABEL, MONDAY_LABEL, TUESDAY_LABEL, WEDNESDAY_LABEL, THURSDAY_LABEL,
                      FRIDAY_LABEL, SATURDAY_LABEL, HOLIDAY_LABEL, EVENTS_LABEL, EVENTS_DESCRIPTION_LABEL,
                      EVENT_TEXTFIELD_LABEL, eventTextField,Label02, Label03, Label04,Label05, Label11, 
                      Label12, Label13, Label14, Label15,  Label21, Label22, Label23, Label24, Label25,  
                      Label31, Label32, Label33, Label34, Label35,  Label41, Label42,
                      Label43, Label44, Label45,  Label51, Label52, Label53, Label54, Label55,
                      Label61, Label62, Label63, Label64, Label65;
    
        @FXML
        private Label monthTitle, datePickerLabel;
        @FXML
        private DatePicker datePicker;
        @FXML
        private ComboBox comboBox;
    //**************************************************************************
    
    //Holidays put into HashMap  
    HashMap<String, String> map = new HashMap<String, String>();
    

    //Creating an observable list with all 12 months and setting it into the Combobox
    DateFormatSymbols dfs = new DateFormatSymbols();
    String[] monthsArray = dfs.getMonths();
    public ObservableList<String> list = FXCollections.observableList(Arrays.asList(monthsArray)); 
    public ObservableList<String> getList() {
        return list;
    }
    public void setList(ObservableList<String> list) {
        this.list = list;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox.setItems(list);
        
        map.put("January", "New Years Day");
        map.put("January", "Martin Luther King Day");
        map.put("February", "President's Day");
        map.put("March", "Martin Luther King");
        map.put("May", "Mother's Day");
        map.put("May", "Memorial Day");
        map.put("June", "Father's Day");
        map.put("July", "Independance Day");
        map.put("September", "Labor Day");
        map.put("October", "Columbus Day");
        map.put("November", "Veteran's Day");
        map.put("November", "Thanksgiving Day");
        map.put("December", "Christmas Eve");
        map.put("December", "Christmas Day");
        map.put("December", "New Years Eve");
    }    

    
    //when a month is chosen from the comboBox, the scene will show that specified month
    @FXML
    private void loadMonth(ActionEvent event) throws IOException, FileNotFoundException {
        
        //Events from the text area are saved to file***********
            String userEvents = eventsTextArea.getParagraphs().toString();
            File file = new File("out.txt");
            try{
                PrintWriter output = new PrintWriter(file);
                output.print(userEvents);
                output.close();   
            }
            catch (IOException ex){
            }
        //*******************************************************
        
        
                
        String chosenMonth = comboBox.getValue().toString();
        
        Parent chosenMonthPane = FXMLLoader.load(getClass().getResource(chosenMonth + ".fxml"));
        Scene ViewScene = new Scene(chosenMonthPane);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loadHolidays(chosenMonth);
        window.setScene(ViewScene);
        window.show();    
    }    
    
    
    
    
    //when a month is chosen from the comboBox, the loadMonth method will call on the 
    //loadHolidays method
    private void loadHolidays(String chosenMonth)
    {
        
    }
    
    private void writeEventsToFile() throws IOException
    {
                  
        

             
        
    }
    
}