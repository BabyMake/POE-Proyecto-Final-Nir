/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author BDsce
 */
public class ImagenFondo extends JPanel {
    private Image imagen;
    
    private ImageIcon imageIcon;
    
  public ImagenFondo (String ruta){
      imageIcon = new ImageIcon(ruta);
      
  }
  
 public void paint(Graphics g){
     imagen = imageIcon.getImage();
     g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
     setOpaque(false);
     super.paint(g);
 }
 
}
