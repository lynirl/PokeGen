package com.example.pokegen;

import com.github.oscar0812.pokeapi.models.pokemon.Pokemon;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

//gère les éléments de l'ui et les fonctions qu'ils exécutent
public class catController {
    @FXML
    private Label pokeName;
    @FXML
    private Button buttonReady;
    @FXML
    private ImageView pokeSprite;
    @FXML
    private Label labelBelow;
    @FXML
    private TextField nameField;

    @FXML
    protected void onButtonClick() {
       if(nameField.getText().isEmpty()){
           nameField.setStyle("-fx-background-color : #fcd4d4");
       }else{
           nameField.setStyle("-fx-background-color : white");
           //on set le text au nom du pokémon
           pokeName.setText(catModele.pokeGen());
           //et on récupère son sprite.
           pokeSprite.setImage(new Image(Pokemon.getByName(pokeName.getText().toLowerCase()).getSprites().getFrontDefault()));
           labelBelow.setText("(Si vous n'aimez pas, vous pouvez toujours recommencer...)");
       }
    }
}