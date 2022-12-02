/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author BDsce
 */
public class Panes extends Panaderia
{
    private String PiezaDePan;
    private float costo;
    private Panes siguientePan;


    public Panes(String PiezaDePan, float costo, String nombreEmpleado, String nombrePan, float ganancias) {
        super(nombreEmpleado, nombrePan, ganancias);
        this.PiezaDePan = PiezaDePan;
        this.costo = costo;
    }

    public Panes() {
        
        this.PiezaDePan = "";
        this.costo = 0;
        this.siguientePan = null;
    }

    public String getPiezaDePan() {
        return PiezaDePan;
    }

    public void setPiezaDePan(String PiezaDePan) {
        this.PiezaDePan = PiezaDePan;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Panes getSiguienteAut() {
        return siguientePan;
    }

    public void setSiguienteAut(Panes siguienteAut) {
        this.siguientePan = siguienteAut;
    }
}
