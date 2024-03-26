package model;

public interface Cafetera {
    void llenar();
    TipoCafe servirTaza(int cantidad, TipoCafe tipoCafe);
    void vaciar();
    void agregarCafe(int cantidad);
}
