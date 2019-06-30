package side_project_calendar;

import java.io.IOException;
import java.net.URL;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author zach
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Pane top, bottom, leftPane;
    
    @FXML
    private GridPane CalendarPane;
    
    @FXML
    private Label monthTitle, eventsListLabel, createEventsLabel, createdEventsLabels;
    
    @FXML 
    private TextArea bottomTextArea;
    
    @FXML
    private DatePicker datePicker;
    
    @FXML
    private ComboBox chooseMonth;
    
    
    
    //Creating an observable list to populate comboBox will all months
    DateFormatSymbols dfs = new DateFormatSymbols();
    String[] months = dfs.getMonths();
            
    public ObservableList<String> list = FXCollections.observableList(Arrays.asList(months)); //only testing
    public ObservableList<String> getList() {
        return list;
    }
    public void setList(ObservableList<String> list) {
        this.list = list;
    }

    
    
    
    // individual dates (1 - 31) or days (monday - sunday)
    @FXML
    private Label Label00, Label02, Label03, Label04,Label05,Label10,
            Label11, Label12, Label13, Label14, Label15, Label20, Label21,
            Label22, Label23, Label24, Label25, Label30, Label31, Label32,
            Label33, Label34, Label35, Label40, Label41, Label42, Label43,
            Label44, Label45, Label50, Label51, Label52, Label53, Label54,
            Label55, Label60, Label61, Label62, Label63, Label64, Label65;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        chooseMonth.setItems(list);
    }    

    //when a month is chosen from the comboBox, the scene will show that specified month
    @FXML
    private void loadMonth(ActionEvent event) throws IOException {   
        
        
        
        Parent registerPane = FXMLLoader.load(getClass().getResource("February.fxml"));
        Scene ViewScene = new Scene(registerPane);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    } 
}