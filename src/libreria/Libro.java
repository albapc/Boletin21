package libreria;

import java.util.Objects;

public class Libro implements Comparable {

    private String titulo, autor, isbn;
    private float precio;
    private int nUnidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, float precio, int nUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.nUnidades = nUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades = nUnidades;
    }

    @Override
    public String toString() {
        return "Libro: " + "titulo => " + titulo + ", autor => " + autor
                + ", isbn => " + isbn + ", precio => " + precio
                + ", unidades => " + nUnidades;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object t) {
        Libro li = (Libro) t;
        if (this.titulo.compareToIgnoreCase(li.titulo) == 0) {
            return 0;
        } else if (this.titulo.compareToIgnoreCase(li.titulo) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
