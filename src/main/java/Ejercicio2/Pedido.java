package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Obra> obras;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.obras = new ArrayList<Obra>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Obra> getObras() {
        return obras;
    }


    public void agregarObra(Obra obra) {
        obras.add(obra);
    }

    public void mostrarInformacion() {
        System.out.println("Pedido de: " + cliente.getNombre() + ":");

        for (Obra obra : obras) {
            obra.mostrarInformacion();
        }
    }

    public Obra getNumObras(int i){
        return obras.get(i);
    }
}

