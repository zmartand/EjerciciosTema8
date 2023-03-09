package Ejercicio2;

public class Cliente {
    private String nombre;
    private String direccion;
    private String correoElectronico;
    private String numeroTelefono;


    public Cliente(String nombre, String direccion, String correoElectronico, String numeroTelefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }


    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Correo electrónico: " + correoElectronico);
        System.out.println("Número de teléfono: " + numeroTelefono);
    }
}




