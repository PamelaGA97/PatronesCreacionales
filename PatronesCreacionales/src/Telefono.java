public class Telefono {
    private String numeroTelefonico;
    private String extension;

    @Override
    public String toString() {
        return "Telefono{" +
                "numeroTelefonico='" + numeroTelefonico + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }

    public Telefono(String numeroTelefonico, String extension) {
        this.numeroTelefonico = numeroTelefonico;
        this.extension = extension;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
