package model;

public abstract class CafeteraNormal implements ICafetera {
    protected int capacidadMaxima;
    protected int cantidadActual;
    protected TipoCafe tipoCafe;

    public CafeteraNormal(int capacidadMaxima, int cantidadActual,TipoCafe tipoCafe) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.min(capacidadMaxima, cantidadActual);
        this.tipoCafe = tipoCafe;
    }

    public void llenar() {
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera ha sido llenada.");
    }

    public ICafetera servirTaza(int cantidad) {
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
            System.out.println("Se ha servido una taza de café de tipo: " + tipoCafe);
        } else {
            System.out.println("No hay suficiente café en la cafetera para servir una taza con el tipo: " + tipoCafe);
        }
        return this;
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
    public TipoCafe getTipoCafe() {
        return tipoCafe;
    }
    public void setTipoCafe(TipoCafe tipoCafe) {
        this.tipoCafe = tipoCafe;
    }
}
