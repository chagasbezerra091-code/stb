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
package cchagas.llc.stb.my.ui
import java.awt.Graphics;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;


public void desenharTexto(Graphics g, String texto, int x, int y) {
    g.drawString(texto, x, y); // desenha o texto na posição x,y
}

public void desenharImagem(Graphics g, String caminhoImagem, int x, int y) {
    Image img = new ImageIcon(caminhoImagem).getImage(); // carrega a imagem
    g.drawImage(img, x, y, null); // desenha na posição x,y
}

public class MeuPainel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        desenharTexto(g, "Olá Java!", 50, 50);
        desenharImagem(g, "res/minhaImagem.png", 100, 100);
    }

    public void desenharTexto(Graphics g, String texto, int x, int y) {
        g.drawString(texto, x, y);
    }

    public void desenharImagem(Graphics g, String caminhoImagem, int x, int y) {
        Image img = new ImageIcon(caminhoImagem).getImage();
        g.drawImage(img, x, y, null);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("UI Simples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new MeuPainel());
        frame.setVisible(true);
    }
}
