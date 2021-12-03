package edu.isu.cs.cs2263.hw02.views;

import edu.isu.cs.cs2263.hw02.App;
import edu.isu.cs.cs2263.hw02.data.Course;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import lombok.Getter;

public abstract class AppView implements IAppView {

    protected @Getter Node view;
    protected App parent;

    public AppView(App parent) {
        this.parent = parent;
        initView();
    }


    public Node getView() {
        return view;
    }


}