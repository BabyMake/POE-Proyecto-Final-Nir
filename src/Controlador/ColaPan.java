/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author BDsce
 */
public class ColaPan {
     public Panes colaPan;

    public ColaPan() {
        colaPan = null;
    }

 

    
    
    public void  encolar(String tipos, float costo, String nombrePan, String nombreTrabajador, float sueldo)
    {
        Panes nuevo = new Panes(tipos,costo,nombrePan,nombreTrabajador,sueldo);
        
        if(colaPan == null)
        {
            colaPan = nuevo;
        }
        else
        {
            Panes aux = colaPan;
            
            while(aux.getSiguienteAut() != null)
            {
                aux = aux.getSiguienteAut();
            }
            aux.setSiguienteAut(nuevo);
        }
    }
    
    public String recorrerCola()
    {
        String valor = "\n";
        Panes aux = colaPan;
        
        
        if(colaPan == null)
        {
            System.out.println("No hay nada en la pila ponle algo >:");
            return "Cola vacia";
        }
        else
        {
            while(aux != null)
            {
                valor += "Nombre de el pan:"+aux.getNombreEmpleado()+"\n";
                valor += "Nombre del empleadp:"+aux.getNombrePan()+"\n";
                valor += "Sueldo"+aux.getGanancias()+"\n";
                valor += "Tipo:"+aux.getPiezaDePan()+"\n";
                valor += "Costos:"+aux.getCosto()+"\n";
                aux = aux.getSiguienteAut();
            }   
        }
        return valor;
    }
    
     
}
