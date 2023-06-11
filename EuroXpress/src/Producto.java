public class Producto {
    private Integer idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private Double precio;
    private Boolean oferta;
    private Integer porcentajeOferta;
    private Integer pesoGramos;
    private String color;

    private String tipo;

    public Producto (Integer idProducto, String nombreProducto, String descripcionProducto,
                          Double precio, Boolean oferta, Integer porcentajeOferta, Integer pesoGramos,
                          String color, String tipo){
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
        this.oferta = oferta;
        this.porcentajeOferta = porcentajeOferta;
        this.pesoGramos = pesoGramos;
        this.color = color;
        this.tipo = tipo;
    }

    public void caracteristicasProducto (){

        System.out.println("Id producto: "+idProducto);
        System.out.println("Tipo: "+tipo);
        System.out.println("Nombre producto: "+nombreProducto);
        System.out.println("Descripción producto: "+descripcionProducto);
        System.out.println("Color: "+color);
        System.out.println("Precio: "+precio);
        System.out.println("Oferta: "+oferta);
        System.out.println("Porcentaje oferta: "+porcentajeOferta);
        System.out.println("Peso en gramos: "+pesoGramos);

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Boolean getOferta() {
        return oferta;
    }

    public void setOferta(Boolean oferta) {
        this.oferta = oferta;
    }

    public Integer getPorcentajeOferta() {
        return porcentajeOferta;
    }

    public void setPorcentajeOferta(Integer porcentajeOferta) {
        this.porcentajeOferta = porcentajeOferta;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(Integer pesoGramos) {
        this
                .pesoGramos = pesoGramos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
