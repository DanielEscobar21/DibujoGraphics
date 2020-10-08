package TrazoFigura;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras extends JPanel {

    // ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;
// inicializar la ventana

    public Figuras() {
        ventana = new JFrame("Dibujando Formas Básicas");
        // definir tamaño a ventana
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);

        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        
        g.setColor(Color.darkGray);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);
        
        g.setColor(Color.blue);
        g.drawRect(280,50,100,50);
        g.fillRect(280,110,100,50);
        
        g.setColor(Color.black);
        g.drawRoundRect(450, 50, 100, 50, 50, 50);
        g.fillRoundRect(450, 110, 100, 50, 20, 20);
        
        g.setColor(Color.ORANGE);
        g.drawOval(100, 200, 80, 80);
        g.fillOval(100, 290, 50, 50);
        
        g.setColor(Color.GREEN);
        g.drawOval(280, 200, 80, 40);
        g.fillOval(280, 290, 40, 80);
        
        g.setColor(Color.pink);
        g.drawLine(450, 300, 550, 300);
        g.drawLine(450, 300, 500, 250);
        g.drawLine(550, 300, 500, 250); 
        
        g.setColor(Color.black);
        g.drawString("Ejemplo de Trazo de Figuras Básicas", 200, 400);
        
        //TRAZO ARCO
        g.setColor(Color.magenta);
        g.drawArc(200, 420, 500, 250, 50, 50);
        g.fillArc(200, 450, 500, 250, 50, 50);
    }

    
}
