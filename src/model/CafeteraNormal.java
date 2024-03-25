package model;

public class CafeteraNormal implements Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public CafeteraNormal(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.min(capacidadMaxima, cantidadActual);
    }

    public void llenar() {
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera ha sido llenada.");
    }

    public void servirTaza(int cantidad) {
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
            System.out.println("Se ha servido una taza de café.");
        } else {
            System.out.println("No hay suficiente café en la cafetera para servir una taza.");
        }
    }

    public void vaciar() {
        cantidadActual = 0;
        System.out.println("La cafetera ha sido vaciada.");
    }

    public void agregarCafe(int cantidad) {
        cantidadActual = Math.min(capacidadMaxima, cantidadActual + cantidad); // Aseguramos que la cantidad no exceda la capacidad máxima
        System.out.println("Se ha agregado café a la cafetera.");
    }

    // Getters y setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
