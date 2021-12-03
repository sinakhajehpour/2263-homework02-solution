package edu.isu.cs.cs2263.hw02.views;

import edu.isu.cs.cs2263.hw02.App;
import javafx.scene.Node;
import javafx.scene.Parent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppViewTest {
    private AppView appView;
    private App app;


    @Test
    void getView() {
        appView=new AppView(app) {
            @Override
            public void initView() {

            }

            @Override
            public void updateData() {

            }
        };
        Node node;
        node= appView.getView();
        assertEquals(node,appView.view);

    }

    @Test
    void setAppView(){
        appView=new AppView(app) {
            @Override
            public void initView() {

            }

            @Override
            public void updateData() {

            }
        };
        App parent;
        parent=appView.parent;
        assertEquals(parent,appView.parent);
    }


}