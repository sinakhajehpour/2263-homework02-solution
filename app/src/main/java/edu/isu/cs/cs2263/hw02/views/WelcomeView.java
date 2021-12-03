package edu.isu.cs.cs2263.hw02.views;

import edu.isu.cs.cs2263.hw02.App;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class WelcomeView extends AppView {

    public WelcomeView(App parent) {
        super(parent);
    }

    @Override
    public void initView() {
        Label message = new Label("Welcome to Course List");

        message.setFont(Font.font("Roboto", FontWeight.BOLD, 16));
        message.setTextAlignment(TextAlignment.CENTER);

        BorderPane bp = new BorderPane();
        bp.setCenter(message);
        BorderPane.setAlignment(message, Pos.CENTER);

        view = bp;
    }

    @Override
    public void updateData() {

    }
}