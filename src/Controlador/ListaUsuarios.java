
package Controlador;

import Modelo.Usuario;

public class ListaUsuarios {
    private Usuario usuarios;
    
    public ListaUsuarios(){
        usuarios = null;
    }
    
    public void agregarUsuario(String nombre, String Usuario, String contraseña, int edad){
        Usuario nuevo = new Usuario();
        nuevo.setNombre(nombre);
        nuevo.setUsuario(Usuario);
        nuevo.setContraseña(contraseña);
        nuevo.setEdad(edad);
        
        if(usuarios == null){
            usuarios = nuevo;
        }else{
            Usuario aux = usuarios;
            while(aux.getUsuarioSiguiente() != null){
                aux = aux.getUsuarioSiguiente();
            }
            aux.setUsuarioSiguiente(nuevo);
        }
    }
    
    public int cantidadUsuarios(){
        int cantidad = 0;
        Usuario aux = usuarios;
        if(usuarios == null){
            return cantidad;
        }else{
            while(aux != null){
                cantidad++;
                aux = aux.getUsuarioSiguiente();
            }
        }
        
        return cantidad;
    }
    
    public boolean listaVacia(){
        if(usuarios == null){ //si no hay usuario regresa true
            return true;
        }else{
            return false;  //si hay usuarios, false
        }
    }
    public boolean buscarUsuario(String usuario, String pass){
        boolean valor = false;
        Usuario aux = usuarios;
        
        if(usuarios != null){
            while(aux != null){
                if(usuario.equals(aux.getUsuario()) && pass.equals(aux.getContraseña())){
                    valor = true;
                    break;
                }
                aux = aux.getUsuarioSiguiente();
            }
        }else{
            valor = false;
        }
        
        return valor;
    }
    public String recorrerUsuarios(){
        String valor = "valores:";
        Usuario aux = usuarios;
        
        if(usuarios != null){
            while(aux != null){
                    valor+=("\nNombre: "+aux.getNombre());
                    valor+=("\nEdad: "+aux.getEdad());
                    valor+=("\nCuenta: "+aux.getUsuario());
                    valor+=("\nPass: "+aux.getContraseña());
                
                aux = aux.getUsuarioSiguiente();
            }
        }else{
            valor += "...";
        }
        
        return valor;
    }
}
