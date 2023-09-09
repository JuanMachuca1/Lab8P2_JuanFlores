/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_juanflores;

import java.io.Serializable;


public class Evento implements Serializable{
    private String estiloNatacion;
    private int distancia;
    private int recordActual;

    public Evento(String estiloNatacion, int distancia, int recordActual) {
        this.estiloNatacion = estiloNatacion;
        this.distancia = distancia;
        this.recordActual = recordActual;
    }

    public Evento() {
    }
    
    
    
    
    
    public String getEstiloNatacion() {
        return estiloNatacion;
    }

    public void setEstiloNatacion(String estiloNatacion) {
        this.estiloNatacion = estiloNatacion;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getRecordActual() {
        return recordActual;
    }

    public void setRecordActual(int recordActual) {
        this.recordActual = recordActual;
    }

    @Override
    public String toString() {
        return estiloNatacion;
    }
    
    
    
}
