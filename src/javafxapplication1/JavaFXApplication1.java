
package javafxapplication1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class JavaFXApplication1 extends Application {
    private VBox principal;
    private HBox lineaAbajo;
    private GridPane grid1;
    private GridPane grid2;
    @Override
    public void start(Stage stage)  {
        
        grid1 = new GridPane();
        grid1.setVgap(5);
        grid1.setHgap(5);
        grid1.add(new Button("7"), 0, 0);
        grid1.add(new Button("4"), 0, 1 );
        grid1.add(new Button("1"), 0, 2);
        grid1.add(new Button("8"), 1, 0);
        grid1.add(new Button("5"), 1, 1);
        grid1.add(new Button("2"), 1, 2);
        grid1.add(new Button("9"), 2, 0);
        grid1.add(new Button("6"), 2, 1);
        grid1.add(new Button("3"), 2, 2);
        grid1.add(new Button("0"), 1, 3);
        
        
        
        grid2 = new GridPane();
        grid2.setVgap(5);
        grid2.setHgap(5);
        grid2.add(new Button("^½"), 0, 0);
        grid2.add(new Button("%"), 0, 1);
        
        Button botonIgual = new Button("=");
        botonIgual.setPrefSize(25,55);
        grid2.add(botonIgual,0,2);
        
        
        
        principal = new VBox(10);
        principal.setPadding(new Insets(20));
        Label label = new Label("NUMEROS");
       
        HBox lineaAbajo=new HBox(10);
        
        lineaAbajo.getChildren().add(grid1);
        lineaAbajo.getChildren().add(grid2);
        principal.getChildren().add(label);
        principal.getChildren().add(lineaAbajo);
        principal.alignmentProperty();
        Scene escena = new Scene(principal,300,300);
       
        stage.setScene(escena);
        stage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
