package solution;
import com.sun.prism.Graphics;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.beans.property.*;
public class CheckerBoardHighlighter extends Application{
    Canvas canvas = new Canvas(400,400);

    public void start (Stage primaryStage){
        Pane root = new Pane(canvas);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        canvas.setOnMousePressed(evt->{
            drawClearBoard();
            highlightSquare(evt);
        });

        drawClearBoard();
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void highlightSquare(MouseEvent evt){
        int leftEdge = ((int)evt.getX())/50;
        int topEdge = ((int)evt.getY())/50;


        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.DEEPSKYBLUE);
        graphicsContext.setLineWidth(3.0);
        graphicsContext.strokeRect(leftEdge*50, topEdge*50, 50,50);
    }


    private void drawClearBoard (){
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        for(int i = 0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        graphicsContext.setFill(Color.RED);
                    } else {
                        graphicsContext.setFill(Color.BLACK);
                    }
                    graphicsContext.fillRect(i * 50, j * 50, 50, 50);
                } else {
                    if (j % 2 == 0) {
                        graphicsContext.setFill(Color.BLACK);
                    } else {
                        graphicsContext.setFill(Color.RED);
                    }
                    graphicsContext.fillRect(i * 50, j * 50, 50, 50);
                }
            }
        }
    }

    public static void main (String[] Args){
        launch(Args);
    }
}
