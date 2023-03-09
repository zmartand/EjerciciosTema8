package Ejercicio2;

public abstract class Obra {
    private String titulo;
    private String autor;

    public Obra(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }



    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public abstract void mostrarInformacion();
}

