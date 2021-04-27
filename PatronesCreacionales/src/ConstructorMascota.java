public class ConstructorMascota {
    public static void main(String[] args){
        Mascota mascota = new Mascota.ConstructorMascota()
                .setNombre("Pelusa")
                .setEdad(2)
                .setDireccion("America y Juan de la Rosa", "Cochabamba", "30")
                .addContacto("Laura Garcia", "77777777",
                        "591", "America y Juan de la Rosa", "Cochabamba", "30")
                .addContacto("Mario Garcia", "78888888", "591",
                        "Calle Jose Diaz Gainza", "Cochabamba", "1010")
                .addTelefono("77777777", "591")
                .addTelefono("4444444", "591")
                .construir();
        System.out.println(mascota.toString());
    }
}
