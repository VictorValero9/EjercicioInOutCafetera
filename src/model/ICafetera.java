package model;

public interface ICafetera {
    void llenar();
    ICafetera servirTaza(int cantidad);
    void vaciar();
    void agregarCafe(int cantidad);
}
