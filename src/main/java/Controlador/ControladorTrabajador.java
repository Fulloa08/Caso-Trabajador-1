package Controlador;

import Modelo.Trabajador;

public class ControladorTrabajador {
    public void editarIsapre(Trabajador t, String nuevaIsapre) {
        t.setIsapre(nuevaIsapre);
    }

    public void editarAfp(Trabajador t, String nuevaAfp) {
        t.setAfp(nuevaAfp);
    }
}
