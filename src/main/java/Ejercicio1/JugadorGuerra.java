package Ejercicio1;

public class JugadorGuerra {
private String nombre;
private int puntos;
public JugadorGuerra(String nombre) {
    this.nombre = nombre;
    this.puntos = 10;
}
public String getNombre() {
    return nombre;
}
public int getPuntos() {
    return puntos;
}
public int tirarDado() {
    return (int) (Math.random() * 6 + 1);
}
public void setPuntos(int puntos) {
    this.puntos = puntos;
}

}
