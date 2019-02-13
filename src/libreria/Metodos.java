package libreria;

import java.util.ArrayList;
import utilidades.PedirDatos;

public class Metodos {

    public void agregar(ArrayList<Libro> biblio) {
        biblio.add(new Libro(PedirDatos.lerString("Introducir titulo"),
                PedirDatos.lerString("Introducir autor"),
                PedirDatos.lerString("Introducir isbn"),
                PedirDatos.decimal("Introducir precio"),
                PedirDatos.enteiro("Introducir número de unidades")));
    }

    public void vender(ArrayList<Libro> biblio) throws Excepcion {
        if (biblio.isEmpty() == true) {
            throw new Excepcion("No hay libros para vender");
        } else {
            String isbn = PedirDatos.lerString("Introducir isbn libro vendido");
            for (Libro li : biblio) {
                if (isbn.equalsIgnoreCase(li.getIsbn())) {
                    biblio.remove(li);
                }
            }
        }
    }

    public void mostrar(ArrayList<Libro> biblio) throws Excepcion {
        if (biblio.isEmpty() == true) {
            throw new Excepcion("No hay libros para mostrar");
        } else {
            for (Libro li : biblio) {
                System.out.println(li);
            }
        }
    }

    public void darDeBaja(int nUnidades, ArrayList<Libro> biblio) throws Excepcion {
        ArrayList<Integer> aux = new ArrayList();
        if (biblio.isEmpty() == true) {
            throw new Excepcion("No hay libros para dar de baja");
        } else {
            for (int i = 0; i < biblio.size(); i++) {
                if (biblio.get(i).getnUnidades() == nUnidades) {
                    aux.add(i);
                }
            }
            for (int i = aux.size() - 1; i >= 0; i--) {
                biblio.remove(biblio.get(aux.get(i)));
            }
        }
    }

    public void consultar(ArrayList<Libro> biblio) throws Excepcion {
        int atopado = 0;
        if (biblio.isEmpty() == true) {
            throw new Excepcion("No hay libros para buscar");
        } else {
            String titulo = PedirDatos.lerString("Introducir titulo para buscar");
            for (Libro li : biblio) {
                if (titulo.equalsIgnoreCase(li.getTitulo())) {
                    System.out.println(li);
                    atopado = 1;
                    break;
                }
            }
            if (atopado == 0) {
                System.out.println("No se encontro ningun libro con ese titulo");
            }
        }
    }
}
