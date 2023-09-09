/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_juanflores;

import java.io.Serializable;


public class Nadador implements Serializable{
    private String nombre;
    private String nacionalidad;
    private int edad;
    private double estatura; //metros;
    private String estiloNatacion;
    private int distanciaCompetir;
    private int timepoRapido;
    private int medallasConseguidas;

    public Nadador(String nombre, String nacionalidad, int edad, double estatura, String estiloNatacion, int distanciaCompetir, int timepoRapido, int medallasConseguidas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estatura = estatura;
        this.estiloNatacion = estiloNatacion;
        this.distanciaCompetir = distanciaCompetir;
        this.timepoRapido = timepoRapido;
        this.medallasConseguidas = medallasConseguidas;
    }

    public Nadador() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getEstiloNatacion() {
        return estiloNatacion;
    }

    public void setEstiloNatacion(String estiloNatacion) {
        this.estiloNatacion = estiloNatacion;
    }

    public int getDistanciaCompetir() {
        return distanciaCompetir;
    }

    public void setDistanciaCompetir(int distanciaCompetir) {
        this.distanciaCompetir = distanciaCompetir;
    }

    public int getTimepoRapido() {
        return timepoRapido;
    }

    public void setTimepoRapido(int timepoRapido) {
        this.timepoRapido = timepoRapido;
    }

    public int getMedallasConseguidas() {
        return medallasConseguidas;
    }

    public void setMedallasConseguidas(int medallasConseguidas) {
        this.medallasConseguidas = medallasConseguidas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
