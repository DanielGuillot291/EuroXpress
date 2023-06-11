import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    /*Listado productos*/
    static ArrayList<Producto> listadoProductos = new ArrayList<>();
    static ArrayList<Cliente> listadoClientes = new ArrayList<>();

    public static void Menu(){
        System.out.println("EuroXpress");
        String menu = "1. Añadir Producto \n2. Listar Productos \n3. Número Productos almacén \n4. Número productos stock del almacén " +
                "\n5. Añadir cliente \n6. Listar Clientes \n7. Buscar cliente por documento identidad";
        System.out.println(menu);
    }

    public static int Eleccion(){
        Menu();

        Scanner opciones = new Scanner(System.in);
        System.out.print("Selecciona una opción: ");
        int opcion = opciones.nextInt();

        return opcion;
    }

    public static void LimpiarConsola(){
        System.out.print("\033[H\033[2J");
        //System.out.flush();
    }


    public static void main(String[] args) throws IOException {
        int eleccion = Eleccion();
        LimpiarConsola();
        //menu
        do{
            switch(eleccion){
                case 1:
                    int idProducto;
                    String nombreProducto;
                    String descripcionProducto;
                    String precio;
                    Integer porcentajeOferta;
                    String pesoGramos;
                    String color;
                    String tipo;
                    String oferta;
                    Boolean ofertaB;

                    System.out.println("ALTA NUEVO PRODUCTO");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                    System.out.println("Escriba el tipo  de producto - Mueble o electrodoméstico");
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
                    if (oferta.equals("S")){
                        ofertaB = true;
                    }else{
                        ofertaB = false;
                    }

                    Producto p1 = new Producto(1,nombreProducto,descripcionProducto,Double.parseDouble(precio),ofertaB,0,Integer.parseInt(pesoGramos),color,tipo);

                    listadoProductos.add(p1);

                    System.out.println(" ");
                    System.out.println("Producto añadido con éxito!");
                    System.out.println(" ");


                    break;

                case 2:
                    System.out.println("LISTADO PRODUCTOS ALMACÉN EUROXPRESS");

                    for (int i=0; i<listadoProductos.size();i++){

                        System.out.println(" ");
                        System.out.println("Producto número "+i);
                        System.out.println("Tipo producto: "+listadoProductos.get(i).getTipo());
                        System.out.println("Nombre producto: "+listadoProductos.get(i).getNombreProducto());
                        System.out.println("Descripción producto: "+listadoProductos.get(i).getDescripcionProducto());
                        String estaEnOferta = "";
                        if (listadoProductos.get(i).getOferta()==true) estaEnOferta = "Sí"; else estaEnOferta="No";
                        System.out.println("Producto en stock "+estaEnOferta);
                        System.out.println(" ");

                    }

                    break;
                case 3:
                    System.out.println("NÚMERO PRODUCTOS ALMACÉN");

                    System.out.println(" ");
                    System.out.println("Total productos almacén "+listadoProductos.size());
                    System.out.println(" ");

                    break;

                case 4:
                    System.out.println("NÚMERO PRODUCTOS ALMACÉN EN STOCK");

                    int numProdsStock = 0;

                    for (int i=0; i<listadoProductos.size();i++){

                        if (listadoProductos.get(i).getOferta() == true){
                            numProdsStock++;
                        }

                    }

                    System.out.println(" ");
                    System.out.println("Total productos stock almacén " + numProdsStock);
                    System.out.println(" ");

                    break;

                case 5:
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

                    Cliente c1 = new Cliente(nombre,apellidos,DNI,telefono,direccionCompleta);

                    listadoClientes.add(c1);

                    break;

                case 6:
                    System.out.println("LISTADO CLIENTES ALMACÉN EUROXPRESS");

                    for (int i=0; i<listadoClientes.size();i++){

                        System.out.println(" ");
                        System.out.println("Cliente número "+i);
                        System.out.println("Nombre y apellidos del cliente "+listadoClientes.get(i).getNombre()
                                +" "+listadoClientes.get(i).getApellidos());
                        System.out.println("Documento identificativo del cliente "+listadoClientes.get(i).getDNI());
                        System.out.println("Teléfono del cliente "+listadoClientes.get(i).getTelefono());
                        System.out.println(" ");

                    }

                    break;
                case 7:
                    System.out.println("BUSCADOR CLIENTE POR DOCUMENTO IDENTIFICATIVO");
                    BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

                    String nif;

                    System.out.println("Escriba el documento identidad del cliente");
                    nif = br3.readLine();

                    for (int i=0; i<listadoClientes.size();i++){
                        if (listadoClientes.get(i).getDNI().equalsIgnoreCase(nif)){
                            System.out.println("Datos del cliente con identificador "+nif);
                            System.out.println("Nombre y apellidos del cliente "+listadoClientes.get(i).getNombre()
                                    +" "+listadoClientes.get(i).getApellidos());
                            System.out.println("Teléfono del cliente "+listadoClientes.get(i).getTelefono());
                            System.out.println(" ");
                        }
                    }

                default:
                    System.out.println("Opción imposible, vuelve a intentarlo");
                    break;
            }

            eleccion = Eleccion();
            LimpiarConsola();

        }while(eleccion != 8);
    }

}