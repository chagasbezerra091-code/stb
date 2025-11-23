/**
 * Copyright 2025 Chagas Inc.
 * Copyright 2025 Chagas LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/** example */
int r = 0,
int g = 0,
int b = 0,
int r1 = 1,
int g1 = 1,
int b1 = 1,
int r2 = 2,
int g2 = 2,
int b2 = 2;
/** MAIN */
int rgb = null; /** Modifique */
int srgb = null;
int 1d = null;
int 2d = null;
int 3d = null;
int null = null;
/** Render. */
import javax.swing.*;
import java.awt.*;

public class CorExemplo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Definir cor
        g.setColor(Color.RED);            // cores pré-definidas
        g.fillRect(50, 50, 100, 100);    // desenha retângulo preenchido

        g.setColor(new Color(0, 128, 255));  // cor personalizada RGB
        g.fillOval(200, 50, 100, 100);       // desenha círculo preenchido
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Cor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new CorExemplo());
        frame.setVisible(true);
    }
}
g.setColor(new Color(255, 0, 0, 128)); // vermelho semi-transparente
g.fillRect(100, 100, 150, 150);
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CorFX extends Application {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();

        // Retângulo vermelho
        Rectangle r1 = new Rectangle(50, 50, 100, 100);
        r1.setFill(Color.RED);

        // Retângulo azul semi-transparente
        Rectangle r2 = new Rectangle(100, 100, 100, 100);
        r2.setFill(Color.rgb(0, 128, 255, 0.5));

        root.getChildren().addAll(r1, r2);

        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Exemplo de Cor JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
