public class Direccion {
    private String direccion;
    private String ciudad;
    private String numero;

    @Override
    public String toString() {
        return "Direccion{" +
                "direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    public Direccion(String direccion, String ciudad, String numero) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}