package boletin21;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import libreria.*;

public class Boletin21 {

    public static void main(String[] args) {
        ArrayList<Libro> lista = new ArrayList<>();
        Metodos obx = new Metodos();

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "**********MENÚ**********\n"
                    + "Introduce una opción:\n"
                    + "1.- Agregar libros\n"
                    + "2.- Vender libros\n"
                    + "3.- Mostrar libros disponibles\n"
                    + "4.- Dar de baja libros no disponibles\n"
                    + "5.- Buscar un libro determinado"));

            try {
                switch (opcion) {
                    case 1:
                        obx.agregar(lista);
                        break;
                    case 2:
                        obx.vender(lista);
                        break;
                    case 3:
                        Collections.sort(lista);
                        obx.mostrar(lista);
                        break;
                    case 4:
                        obx.darDeBaja(0, lista);
                        break;
                    case 5:
                        obx.consultar(lista);
                        break;
                }
            } catch (Excepcion e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 0);
    }
}
