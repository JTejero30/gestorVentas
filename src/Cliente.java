import java.util.Date;

public class Cliente {

    int id;
    String nombre;
    String dni;
    Date fechaNac;
    String empresa;

    public Cliente(int id, String nombre, String dni, Date fechaNac, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNac=" + fechaNac +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}
