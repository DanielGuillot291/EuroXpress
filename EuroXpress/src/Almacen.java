import java.util.ArrayList;
public class Almacen {
    private ArrayList<Producto> listadoProductos;

    public Almacen() {
        this.listadoProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listadoProductos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        listadoProductos.remove(producto);
    }

    public int obtenerStockProducto(Producto producto) {
        int stock = 0;
        for (Producto p : listadoProductos) {
            if (p.getIdProducto().equals(producto.getIdProducto())) {
                stock++;
            }
        }
        return stock;
    }

    public ArrayList<Producto> getListadoProductos() {
        return listadoProductos;
    }

    public void setListadoProductos(ArrayList<Producto> listadoProductos) {
        this.listadoProductos = listadoProductos;
    }
}
