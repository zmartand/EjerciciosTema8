package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Obra> obras = new ArrayList<Obra>();
    static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("-- Menú --");
            System.out.println("1 - Mostrar clientes");
            System.out.println("2 - Crear clientes");
            System.out.println("3 - Crear una obra");
            System.out.println("4 - Crear un pedido");
            System.out.println("5 - Mostrar pedidos");
            System.out.println("6 - Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    mostrarClientes();
                    break;
                case 2:
                    crearCliente();
                    break;
                case 3:
                    crearObra();
                    break;
                case 4:
                    crearPedido();
                    break;
                case 5:
                    mostrarPedidos();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 6);
    }
    public static void crearObra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Tipo?");
        System.out.println("1 - Libro");
        System.out.println("2 - Vídeo");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("¿Título?");
        String titulo = scanner.nextLine();
        System.out.println("¿Autor?");
        String autor = scanner.nextLine();
        if (tipo == 1) {
            System.out.println("¿Número de páginas?");
            int numPaginas = scanner.nextInt();
            obras.add(new Libro(titulo, autor, numPaginas));
        } else if (tipo == 2) {
            System.out.println("¿Duración (minutos)?");
            int duracion = scanner.nextInt();
            obras.add(new Video(titulo, autor, duracion));
        } else {
            System.out.println("Tipo inválido");
        }
        System.out.println("Obra añadida");
    }
    public static void mostrarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados");
            return;
        }
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido para " + pedido.getCliente().getNombre());
            for (Obra obra : pedido.getObras()) {
                System.out.println("  - ");
                obra.mostrarInformacion();
            }
        }
    }
    public static void crearCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Nombre?");
        String nombre = scanner.nextLine();
        System.out.println("¿Apellido?");
        String apellido = scanner.nextLine();
        System.out.println("¿Email?");
        String email = scanner.nextLine();
        System.out.println("¿Dirección?");
        String direccion = scanner.nextLine();
        System.out.println("¿Teléfono?");
        String telefono = scanner.nextLine();
        clientes.add(new Cliente(nombre, email, direccion, telefono));
        System.out.println("Cliente creado");
    }
    public static void mostrarClientes() {
        System.out.println("-- Clientes --");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Cliente n°." + (i+1) + ": " + clientes.get(i).getNombre());
        }
    }
    public static void crearPedido() {
        Scanner scanner = new Scanner(System.in);
        int clienteIndex;
        do {
            System.out.println("¿Para qué cliente desea crear el pedido?");
            mostrarClientes();
            clienteIndex = scanner.nextInt() - 1;
            scanner.nextLine(); // Consumir la línea vacía
        } while (clienteIndex < 0 || clienteIndex >= clientes.size());
        Cliente cliente = clientes.get(clienteIndex);
        Pedido pedido = new Pedido(cliente);
        int obraIndex;
        do {
            System.out.println("¿Qué obra agregar al pedido?");
            mostrarObras();
            obraIndex = scanner.nextInt() - 1;
            scanner.nextLine(); // Consumir la línea vacía
            if (obraIndex >= 0 && obraIndex < obras.size()) {
                pedido.agregarObra(obras.get(obraIndex));
                System.out.println("Obra agregada al pedido.");
            }
        } while (obraIndex != obras.size());
        if (pedido.getObras().size() > 0) {
            pedidos.add(pedido);
            System.out.println("Pedido creado.");
        } else {
            System.out.println("El pedido está vacío y no se puede crear.");
        }
    }
    public static void mostrarObras() {
        if (obras.isEmpty()) {
            System.out.println("No hay obras registradas");
            return;
        }
        for (int i = 0; i < obras.size(); i++) {
            System.out.println("Obra n°." + (i+1) + ": " + obras.get(i).getTitulo());
        }
        System.out.println("Obra n°." + (obras.size()+1) + ": Salir");
    }
}
