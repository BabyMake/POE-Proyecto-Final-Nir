/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author BDsce
 */
public class Panaderia {
    
      private String nombreEmpleado;
    private String nombrePan;
    private float ganancias;
    //private Refacciones siguienteRef;

    public Panaderia() {
        this.nombreEmpleado = "";
        this.nombrePan = "";
        this.ganancias = 0;
        //this.siguienteRef = null;
    }

    public Panaderia(String nombreEmpleado, String nombrePan, float ganancias) {
        this.nombreEmpleado = nombreEmpleado;
        this.nombrePan = nombrePan;
        this.ganancias = ganancias;
        //this.siguienteRef = siguienteRef;
    }



    /*
    public Refacciones getSiguienteRef() {
        return siguienteRef;
    }

    public void setSiguienteRef(Refacciones siguienteRef) {
        this.siguienteRef = siguienteRef;
    }
    */

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreDoctor(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombrePan() {
        return nombrePan;
    }

    public void setNombrePan(String nombrePan) {
        this.nombrePan = nombrePan;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }
}
