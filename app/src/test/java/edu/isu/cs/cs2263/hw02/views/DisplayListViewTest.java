package edu.isu.cs.cs2263.hw02.views;
import edu.isu.cs.cs2263.hw02.App;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class DisplayListViewTest extends ApplicationTest {
    private App app;



    @Test
    public void whendisplaylistviewcalled(){
    DisplayListView displayListView= mock(DisplayListView.class);
    displayListView.initView();
    verify(displayListView,times(1)).initView();
}

    @Test
    void getView() {
    }


    @Test
    void initView() {


    }

    @Test
    void updateData() {
        DisplayListView d=new DisplayListView(app);


    }
}