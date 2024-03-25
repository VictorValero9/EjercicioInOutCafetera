import model.*;

public class Main {
    public static void main(String[] args) {

        Cafetera cafeteraNormal = new CafeteraNormal(1000, 500);
        Cafetera cafeteraRistretto = new CafeteraRistretto(800, 400);
        Cafetera cafeteraEspresso = new CafeteraEspresso(500, 200);
        Cafetera cafeteraMolinillo = new CafeteraMolinillo(1200, 600);

        cafeteraNormal.llenar();
        cafeteraRistretto.servirTaza(200);
        cafeteraEspresso.vaciar();
        cafeteraMolinillo.agregarCafe(300);
    }

}