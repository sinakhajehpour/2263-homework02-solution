import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/*

@ExtendWith(ApplicationExtension.class)
class sample {

    private Button button;


    @Start
    private void start(Stage stage) {
        button = new Button("click me!");
        button.setId("myButton");
        button.setOnAction(actionEvent -> button.setText("clicked!"));
        stage.setScene(new Scene(new StackPane(button), 100, 100));
        stage.show();
    }


    @Test
    void should_contain_button_with_text(FxRobot robot) {
        FxAssert.verifyThat(button, LabeledMatchers.hasText("click me!"));
        // or (lookup by css id):

    }


    @Test
    void when_button_is_clicked_text_changes(FxRobot robot) {
        // when:
        robot.clickOn(".button");

        // then:
        FxAssert.verifyThat(button, LabeledMatchers.hasText("clicked!"));

        }
}

 */
