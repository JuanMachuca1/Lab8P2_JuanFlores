/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_juanflores;

import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author JD
 */
public class BarraUno extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;

    public BarraUno(JProgressBar barra, boolean avanzar, boolean vive) {
        this.barra = barra;
        avanzar = true;
        vive=true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
         while (vive) {
            if (avanzar) {
                Random ra= new Random();
                int num = 1+ra.nextInt(100); 
                barra.setValue(barra.getValue() + num);
                //activar y modificar propiedad stringPainted para que esto funciones
                barra.setString(Integer.toString(barra.getValue()));

            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
    
}
