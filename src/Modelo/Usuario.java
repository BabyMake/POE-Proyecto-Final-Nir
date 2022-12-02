
package Modelo;

public class Usuario {
    private String nombre;
    private String usuario;
    private String contraseña;
    private int edad;
    
    private Usuario usuarioSiguiente;

    public Usuario() {
        this.nombre = "";
        this.usuario = "";
        this.contraseña = "";
        this.edad = 0;
        this.usuarioSiguiente  = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setUsuarioSiguiente(Usuario usuarioSiguiente) {
        this.usuarioSiguiente = usuarioSiguiente;
    }

    public Usuario getUsuarioSiguiente() {
        return usuarioSiguiente;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String Usuario) {
        this.usuario = Usuario;
    }

    public void setContraseña(String Contraseña) {
        this.contraseña = Contraseña;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
