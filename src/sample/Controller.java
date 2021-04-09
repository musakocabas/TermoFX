package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private TextField ax1;

    @FXML
    private TextField bx1;

    @FXML
    private TextField ax2;

    @FXML
    private TextField ax3;

    @FXML
    private TextField bx3;

    @FXML
    private Label bx2;

    @FXML
    private Button btn;

    @FXML
    void Click(MouseEvent event) {
        double numax1 = Double.parseDouble(ax1.getText());
        double numax2 = Double.parseDouble(ax2.getText());
        double numax3 = Double.parseDouble(ax3.getText());
        double numbx1 = Double.parseDouble(bx1.getText());
        double numbx3 = Double.parseDouble(bx3.getText());

        double val = ((numbx1-numbx3)*(numax2-numax3)) / (numax1-numax3) + numbx3;
        bx2.setText("deger = "+val);
    }

}
