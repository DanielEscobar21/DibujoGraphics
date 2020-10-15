
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Dibujos extends JPanel {

    // ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;
// inicializar la ventana

    public Dibujos() {
        ventana = new JFrame("Dibujando Formas Básicas");
        // definir tamaño a ventana
        ventana.setSize(1040, 730);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);

        contenedor = ventana.getContentPane();
        contenedor.setSize(1040, 730);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //Rectangulo Base
        g.setColor(Color.black);
        g.drawRoundRect(10, 10, 1000, 670, 20, 20);
        
        //Primer Cuadro
        g.setColor(Color.black);
        g.drawRect(30,30,300,300);
        
        g.setColor(Color.red);
        g.drawLine(150, 200, 300, 200);
        g.drawLine(150, 200, 150, 100);
        g.drawLine(300, 200, 300, 100);
        g.drawLine(150, 100, 300, 100);
            
        g.drawLine(150, 100, 225, 50);
        g.drawLine(300, 100, 225, 50);
        
        g.drawLine(170,200,170,150);
        g.drawLine(200,200,200,150);
        g.drawLine(170,150,200,150);
        
        g.drawLine(170,200,100,250);
        g.drawLine(200,200,130,250);
        
        g.setColor(Color.black);
        g.drawString("Dibujo con Líneas", 130, 300);
        
        
        //Segundo Cuadro
        g.setColor(Color.black);
        g.drawRect(360,30,300,300);
        g.setColor(Color.red);
        g.drawRect(380, 80, 30, 200);
        g.drawRect(440, 130, 30, 150);
        g.drawRect(500, 180, 30, 100);
        g.drawRect(560, 230, 30, 50);
        g.drawRect(620, 260, 30, 20);
        
        g.setColor(Color.black);
        g.drawString("Dibujo con Rectangulos", 460, 300);
        
        //Tercer Cuadro
        g.setColor(Color.black);
        g.drawRect(690,30,300,300);
        
        g.setColor(Color.red);
        g.drawRoundRect(820, 60, 50, 200, 200, 200);
        g.drawRoundRect(750, 130, 200, 50, 200, 200);
        g.drawRoundRect(795, 90, 100, 50, 100, 100);
        
        g.setColor(Color.black);
        g.drawString("Dibujo Óvalos con Rectángulos", 730, 300);
        
        //Cuarto Cuadro
        g.setColor(Color.black);
        g.drawRect(30,360,300,300);
        
        g.setColor(Color.red);
        g.drawOval(75, 400, 220, 220);
        g.drawOval(110, 450, 50, 50);
        g.drawOval(200, 450, 50, 50);
        g.fillOval(130, 470, 10, 10);
        g.fillOval(220, 470, 10, 10);
        g.drawOval(150, 525, 70, 70);
        
        g.setColor(Color.black);
        g.drawString("Dibujado con Circulos", 130, 650);
        
        //Quinto Cuadro
        g.setColor(Color.black);
        g.drawRect(360,360,300,300);
        
        g.setColor(Color.red);
        g.drawOval(490, 390, 50, 200);
        g.drawOval(420, 460, 200, 50);
        g.drawOval(465, 420, 100, 50);
        
        g.setColor(Color.black);
        g.drawString("Dibujo Óvalos con Circulos", 400, 630);
        
        
        //Sexto Cuadro
        g.setColor(Color.black);
        g.drawRect(690,360,300,300);
        
        g.setColor(Color.red);
        g.drawLine(720, 500, 800, 500);
        g.drawLine(720,500,760,400);
        g.drawLine(800,500,760,400);
        
        g.drawLine(850,500,900,500);
        g.drawLine(850,500,900,480);
        g.drawLine(900,500,900,480);
        
        g.setColor(Color.black);
        g.drawString("Triangulos con Líneas", 730, 630);
        
        
        
        
        
      
    }

    
}


