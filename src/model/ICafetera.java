package model;

public interface ICafetera {
    void llenar();
    TipoCafe servirTaza(int cantidad);
    void vaciar();
    void agregarCafe(int cantidad);
}
