/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenDI;

public class Usuario {

    private String nombre;
    private String apellidos;
    private String fecha;
    private String correo;
    private String codReserva;

    public Usuario() {
    }

    ;
    public Usuario(String nombre, String apellidos, String correo, String fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = correo;
        this.correo = correo;
        this.codReserva = codigoReserva();
    }

    public static String codigoReserva() {
        String cod_reserva = "";
        int caracteres = (int) (Math.random() * 4) + 4;
        for (int i = 0; i < caracteres; i++) {
            int codigoAscii = (int) Math.floor(Math.random() * (90 - 65) + 65);
            cod_reserva = cod_reserva + (char) codigoAscii;
        }

        return cod_reserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fecha=" + fecha + ", correo=" + correo + ", codReserva=" + codReserva + '}';
    }

}
