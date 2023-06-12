import java.util.Date;

public class Reserva {
    private int idReserva;
    private Cliente cliente;
    private Producto producto;
    private Date fecha;

    public Reserva(int idReserva, Cliente cliente, Producto producto, Date fecha) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
