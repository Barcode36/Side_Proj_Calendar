/*
 * {Westfield State University}:Program Design 2
 * Zachary Hadjah
 * 
 */
package side_project_calendar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author zach
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label CalendarPane;
    @FXML
    private Label monthTitle;
    
    // individual dates or days (monday - sunday)
    @FXML
    private Label Label00, Label01, Label02, Label03, Label04,Label05,Label10,
            Label11, Label12, Label13, Label14, Label15, Label20, Label21,
            Label22, Label23, Label24, Label25, Label30, Label31, Label32,
            Label33, Label34, Label35, Label40, Label41, Label42, Label43,
            Label44, Label45, Label50, Label51, Label52, Label53, Label54,
            Label55, Label60, Label61, Label62, Label63, Label64, Label65;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
}