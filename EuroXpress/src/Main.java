import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static ArrayList<Producto> listadoProductos = new ArrayList<>();
    static ArrayList<Cliente> listadoClientes = new ArrayList<>();
    static ArrayList<Reserva> listadoReservas = new ArrayList<>();

    public static void Menu() {
        System.out.println("EuroXpress");
        String menu = """
            1. Añadir Producto
            2. Listar Productos
            3. Número Productos almacén
            4. Número productos stock del almacén
            5. Añadir cliente
            6. Listar Clientes
            7. Buscar cliente por documento identidad
            8. Realizar Reserva
            """;
        System.out.println(menu);
    }

    public static int Eleccion() {
        Menu();

        Scanner opciones = new Scanner(System.in);
        System.out.print("Selecciona una opción: ");
        return opciones.nextInt();
    }

    public static void LimpiarConsola() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) throws IOException {
        int eleccion = Eleccion();
        LimpiarConsola();

        do {
            switch (eleccion) {
                case 1 -> {
                    int idProducto;
                    String nombreProducto;
                    String descripcionProducto;
                    String precio;
                    int porcentajeOferta;
                    String pesoGramos;
                    String color;
                    String tipo;
                    String oferta;
                    boolean ofertaB;

                    System.out.println("ALTA NUEVO PRODUCTO");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                    System.out.println("Escriba el tipo de producto - Mueble o electrodoméstico");
                    tipo = br.readLine();
                    System.out.println("Escriba el nombre del producto");
                    nombreProducto = br.readLine();
                    System.out.println("Escriba la descripción del producto");
                    descripcionProducto = br.readLine();
                    System.out.println("Escriba el precio");
                    precio = br.readLine();
                    System.out.println("Escriba el peso en gramos");
                    pesoGramos = br.readLine();
                    System.out.println("Escriba el color");
                    color = br.readLine();
                    System.out.println("Escriba si el producto está o no en oferta (S o N)");
                    oferta = br.readLine();
                    if (oferta.equalsIgnoreCase("S")) {
                        System.out.println("Escriba el porcentaje de oferta");
                        porcentajeOferta = Integer.parseInt(br.readLine());
                        ofertaB = true;
                    } else {
                        porcentajeOferta = 0;
                        ofertaB = false;
                    }

                    idProducto = listadoProductos.size() + 1;
                    Producto p1 = new Producto(idProducto, nombreProducto, descripcionProducto,
                            Double.parseDouble(precio), ofertaB, porcentajeOferta, Integer.parseInt(pesoGramos), color,
                            tipo);

                    listadoProductos.add(p1);

                    System.out.println("\nProducto añadido con éxito!");
                }
                case 2 -> {
                    System.out.println("LISTADO PRODUCTOS ALMACÉN EUROXPRESS");

                    for (int i = 0; i < listadoProductos.size(); i++) {
                        System.out.println("\nProducto número " + (i + 1));
                        System.out.println("Tipo producto: " + listadoProductos.get(i).getTipo());
                        System.out.println("Nombre producto: " + listadoProductos.get(i).getNombreProducto());
                        System.out.println("Descripción producto: " + listadoProductos.get(i).getDescripcionProducto());
                        System.out.println("Precio: " + listadoProductos.get(i).getPrecio());
                        System.out.println("Peso en gramos: " + listadoProductos.get(i).getPesoGramos());
                        System.out.println("Color: " + listadoProductos.get(i).getColor());
                        System.out.println("En oferta: " + (listadoProductos.get(i).getOferta() ? "Sí" : "No"));
                        System.out.println("Porcentaje de oferta: " + listadoProductos.get(i).getPorcentajeOferta() + "%");
                    }
                }
                case 3 -> {
                    System.out.println("NÚMERO PRODUCTOS ALMACÉN");
                    System.out.println("\nTotal productos almacén: " + listadoProductos.size());
                }
                case 4 -> {
                    System.out.println("NÚMERO PRODUCTOS ALMACÉN EN STOCK");
                    int numProdsStock = 0;
                    for (Producto producto : listadoProductos) {
                        if (producto.getOferta()) {
                            numProdsStock++;
                        }
                    }

                    System.out.println("\nTotal productos en stock: " + numProdsStock);
                }
                case 5 -> {
                    System.out.println("ALTA NUEVO CLIENTE");
                    String nombre;
                    String apellidos;
                    String DNI;
                    int telefono;
                    String direccionCompleta;

                    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

                    System.out.println("Escriba nombre del cliente");
                    nombre = br2.readLine();
                    System.out.println("Escriba los apellidos del cliente");
                    apellidos = br2.readLine();
                    System.out.println("Escriba el documento identificativo del cliente");
                    DNI = br2.readLine();
                    System.out.println("Escriba el número de teléfono del cliente");
                    telefono = Integer.parseInt(br2.readLine());
                    System.out.println("Escriba la dirección completa del cliente");
                    direccionCompleta = br2.readLine();

                    Cliente c1 = new Cliente(nombre, apellidos, DNI, telefono, direccionCompleta);
                    listadoClientes.add(c1);
                }
                case 6 -> {
                    System.out.println("LISTADO CLIENTES ALMACÉN EUROXPRESS");
                    for (int i = 0; i < listadoClientes.size(); i++) {
                        System.out.println("\nCliente número " + (i + 1));
                        System.out.println("Nombre y apellidos del cliente: " + listadoClientes.get(i).getNombre() + " " + listadoClientes.get(i).getApellidos());
                        System.out.println("Documento identificativo del cliente: " + listadoClientes.get(i).getDNI());
                        System.out.println("Teléfono del cliente: " + listadoClientes.get(i).getTelefono());
                    }
                }
                case 7 -> {
                    System.out.println("BUSCADOR CLIENTE POR DOCUMENTO IDENTIFICATIVO");
                    BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
                    String nif;

                    System.out.println("Escriba el documento identidad del cliente");
                    nif = br3.readLine();

                    for (Cliente cliente : listadoClientes) {
                        if (cliente.getDNI().equalsIgnoreCase(nif)) {
                            System.out.println("Datos del cliente con identificador " + nif);
                            System.out.println("Nombre y apellidos: " + cliente.getNombre() + " " + cliente.getApellidos());
                            System.out.println("Teléfono: " + cliente.getTelefono());
                            System.out.println("Dirección: " + cliente.getDireccionCompleta());
                            break;
                        }
                    }
                }
                case 8 -> {
                    System.out.println("REALIZAR RESERVA");
                    BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));

                    System.out.println("Introduzca el identificador del cliente");
                    int idCliente = Integer.parseInt(br4.readLine());

                    Cliente clienteReserva = listadoClientes.get(idCliente - 1);

                    System.out.println("Introduzca el identificador del producto a reservar");
                    int idProductoReserva = Integer.parseInt(br4.readLine());

                    Producto productoReserva = listadoProductos.get(idProductoReserva - 1);

                    Date fechaReserva = new Date();

                    int idReserva = listadoReservas.size() + 1;
                    Reserva reserva = new Reserva(idReserva, clienteReserva, productoReserva, fechaReserva);
                    listadoReservas.add(reserva);


                    System.out.println("\nReserva realizada con éxito!");
                }
                default -> System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

            eleccion = Eleccion();
            LimpiarConsola();

        } while (eleccion != 0);
    }
}
