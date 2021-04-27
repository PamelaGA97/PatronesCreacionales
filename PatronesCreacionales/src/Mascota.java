import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Mascota {
    private String nombre;
    private int edad;
    private Direccion direccion;
    private List<Telefono> telefonos;
    private List<Contacto> contactosDeEmergencia;

    public Mascota(String nombre, int age, Direccion direccion, List<Telefono> telefonos, List<Contacto> contactosDeEmergencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.contactosDeEmergencia = contactosDeEmergencia;
    }

    public Mascota(){
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public List<Contacto> getContactosDeEmergencia() {
        return contactosDeEmergencia;
    }

    public void setContactosDeEmergencia(List<Contacto> duenhos) {
        this.contactosDeEmergencia = duenhos;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion=" + direccion +
                ", telefonos=" + telefonos.toString() +
                ", contactosDeEmergencia=" + contactosDeEmergencia.toString() +
                '}';
    }

    public static class ConstructorMascota implements IConstructor<Mascota>{
        private String nombre;
        private int edad;
        private Direccion direccion;
        private List<Telefono> telefonos = new ArrayList<>();
        private List<Contacto> contactosDeEmergencia = new ArrayList<>();

        public ConstructorMascota(){
        }

        public ConstructorMascota setNombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public ConstructorMascota setEdad (int edad){
            this.edad = edad;
            return this;
        }

        public ConstructorMascota setDireccion(String direccion, String ciudad, String numero){
            direccion = new Direccion(direccion, ciudad, numero);
            return this;
        }

        public ConstructorMascota addTelefono(String numeroTelefonico, String extension){
            telefonos.add(new Telefono(numeroTelefonico, extension));
            return this;
        }

        public  ConstructorMascota addContacto(String nombre, String numeroTelefonico, String extension, String direccion, String ciudad, String numero){
            contactosDeEmergencia.add(new Contacto(nombre, new Telefono(numeroTelefonico, extension), new Direccion(direccion, ciudad, numero)));
            return this;
        }

        public ConstructorMascota agregarContactos(String nombre, String numeroTelefonico, String extension){
            contactosDeEmergencia.add(new Contacto(nombre, new Telefono(numeroTelefonico, extension)));
            return this;
        }

        @Override
        public Mascota construir(){
            return new Mascota(nombre, edad, direccion, telefonos, contactosDeEmergencia);
        }
    }
}