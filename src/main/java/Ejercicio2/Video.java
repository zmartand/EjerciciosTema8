package Ejercicio2;

public class Video extends Obra {
    private int duracionMinutos;

    public Video(String titulo, String autor, int duracionMinutos) {
        super(titulo, autor);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Duración en minutos: " + duracionMinutos);
    }
}
