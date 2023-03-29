public class Producto {

    int id;
    String nombre;
    String categoria;
    int precioCoste;
    int precioVenta;
    int stock;

    public Producto() {
    }

    public Producto(int id, String nombre, String categoria, int precioCoste, int precioVenta, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioCoste = precioCoste;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPrecioCoste() {
        return precioCoste;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecioCoste(int precioCoste) {
        this.precioCoste = precioCoste;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precioCoste=" + precioCoste +
                ", precioVenta=" + precioVenta +
                ", stock=" + stock +
                '}';
    }
}
