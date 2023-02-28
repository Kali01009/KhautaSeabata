package com.example.khautaseabata;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

import static javafx.scene.paint.Color.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Rectangle rec1,rec2,rec3;

    @FXML
    protected void onChangeColorLesotho(ActionEvent event){
        rec1.setFill(BLUE);
        rec2.setFill(WHITE);
        rec3.setFill(GREEN);

    }

    @FXML
    protected void onChangeColorRussia(ActionEvent event){
        rec1.setFill(WHITE);
        rec2.setFill(BLUE);
        rec3.setFill(RED);

    }

    @FXML
    protected void onChangeColorGermany(ActionEvent event){
        rec1.setFill(BLACK);
        rec2.setFill(RED);
        rec3.setFill(YELLOW);

    }

    @FXML
    protected void onChangeColorNetherlands(ActionEvent event){
        rec1.setFill(RED);
        rec2.setFill(WHITE);
        rec3.setFill(BLUE);

    }
    @FXML
    protected void clear(ActionEvent event){
        rec1.setFill(TRANSPARENT);
        rec2.setFill(TRANSPARENT);
        rec3.setFill(TRANSPARENT);

    }


}