package model;

import molinos.IMolino;

public class CafeteraMolinillo extends CafeteraNormal{
    private IMolino molino;
    public CafeteraMolinillo(int capacidadMaxima, int capacidadActual, TipoCafe tipoCafe, IMolino molino){
        super(capacidadMaxima,capacidadActual, tipoCafe);
        this.molino = molino;
    }

    @Override
    public TipoCafe servirTaza(int cantidad) {
        molino.molerCafe();
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
            System.out.println("Se ha servido una taza de café de tipo: " + tipoCafe);
        } else {
            System.out.println("No hay suficiente café en la cafetera para servir una taza con el tipo: " + tipoCafe);
        }
        return tipoCafe;
    }

}
