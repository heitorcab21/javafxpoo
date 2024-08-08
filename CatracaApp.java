import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;

public class CatracaApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carregar o arquivo FXML
            File fxmlFile = new File("C:\\Users\\HEITOR\\MVC\\Projeto-copy\\View\\Catraca.fxml");
            if (!fxmlFile.exists()) {
                System.err.println("Arquivo FXML não encontrado no caminho especificado.");
                return;
            }
            FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
            Parent root = loader.load();

            // Criar a cena com tamanho fixo
            Scene scene = new Scene(root, 400, 300);

            // Configurar o palco
            primaryStage.setTitle("Catraca Inteligente");
            primaryStage.setScene(scene);
            primaryStage.show();  // Forçar a exibição da janela
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
