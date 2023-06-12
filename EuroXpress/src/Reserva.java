import java.util.Date;

public class Reserva {
    private static int ultimoIdReserva = 0;

    private int idReserva;
    private Cliente cliente;
    private Producto producto;
    private Date fechaInicio;
    private Date fechaFin;

    public Reserva(Cliente cliente, Producto producto, Date fechaInicio, Date fechaFin) {
        this.idReserva = ++ultimoIdReserva;
        this.cliente = cliente;
        this.producto = producto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
