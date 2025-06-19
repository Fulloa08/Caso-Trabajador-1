package App;

import Modelo.Trabajador;
import Vista.VistaTrabajadorCLI;
import Controlador.ControladorTrabajador;

public class Principal {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Juan", "Pérez", "12.345.678-9", "Colmena", "Habitat");
        ControladorTrabajador controlador = new ControladorTrabajador();
        VistaTrabajadorCLI vista = new VistaTrabajadorCLI();
        vista.mostrarMenu(trabajador, controlador);
    }
}
