public class Cliente {

    String nombre;
    String apellidos;
    String DNI;
    Integer telefono;
    String direccionCompleta;

    public Cliente (String nombre, String apellidos, String DNI, int telefono, String direccionCompleta){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.telefono = telefono;
        this.direccionCompleta = direccionCompleta;
    }
    public String getDireccionCompleta() {
        return direccionCompleta;
    }

    public void setDireccionCompleta(String direccionCompleta) {
        this.direccionCompleta = direccionCompleta;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
