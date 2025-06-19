package Vista;

import Modelo.Trabajador;
import Controlador.ControladorTrabajador;
import java.util.Scanner;

public class VistaTrabajadorCLI {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu(Trabajador t, ControladorTrabajador controlador) {
        int opcion;
        do {
            System.out.println("\n--- Menú Trabajador ---");
            System.out.println("1. Ver datos");
            System.out.println("2. Editar Isapre");
            System.out.println("3. Editar AFP");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n" + t);
                    break;
                case 2:
                    System.out.print("Nueva Isapre: ");
                    String nuevaIsapre = scanner.nextLine();
                    controlador.editarIsapre(t, nuevaIsapre);
                    break;
                case 3:
                    System.out.print("Nueva AFP: ");
                    String nuevaAfp = scanner.nextLine();
                    controlador.editarAfp(t, nuevaAfp);
                    break;
            }
        } while (opcion != 0);
    }
}
