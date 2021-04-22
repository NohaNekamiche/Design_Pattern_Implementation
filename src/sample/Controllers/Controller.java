package sample.Controllers;
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.ListView;

import javafx.stage.Stage;
import sample.Model.*;

public class Controller implements Initializable {
@FXML
    Button addObjet_btn;
@FXML
private Button btn;

@FXML
private ListView<String> listAnimal;
    private ObservableList<String> animals;
    public void goToSecondScene(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        URL    url  = null;
        if(event.getSource()==btn){
            stage = (Stage) btn.getScene().getWindow();
            //root = FXMLLoader.load(getClass().getResource("secondpage.fxml"));
            url=getClass().getResource("../Views/secondpage.fxml");
            root = FXMLLoader.load(url);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();}
    }

    public  void creerSol(ActionEvent event){
        AnimalFactory animalFactory1=new AnimalFactory("cat","3ans","ciamo",1500);
        AnimalFactory animalFactory2=new AnimalFactory("chien","2ans","police",1800);
        chat c = (chat) animalFactory1.create("chat");
     //   System.out.println(c.getNom()+c.toString());
        chien dog=(chien)animalFactory2.create("chien");
        System.out.println(dog.toString());
        ColorFactory colorFactory1=new ColorFactory("marron");
        ColorFactory colorFactory2=new ColorFactory("blanc");
        marron m=(marron) colorFactory1.create("marron");
        blanc b=(blanc) colorFactory2.create("blanc");
        animals.add(c.toString()+m.toString());
        animals.add(dog.toString()+b.toString());
        listAnimal.setItems(animals);


    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        animals = FXCollections.observableArrayList();

    }
}
