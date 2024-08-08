import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CatracaController {

    @FXML
    private Button btnAbrir;

    @FXML
    private Button btnFechar;

    @FXML
    private Label lblStatus;

    @FXML
    private void initialize() {
        // Configura os eventos dos botões
        btnAbrir.setOnAction(e -> abrirCatraca());
        btnFechar.setOnAction(e -> fecharCatraca());
    }

    private void abrirCatraca() {
        lblStatus.setText("Catraca Aberta"); // Exibe a mensagem "Catraca Aberta"
    }

    private void fecharCatraca() {
        lblStatus.setText("Catraca Fechada"); // Exibe a mensagem "Catraca Fechada"
    }
}
