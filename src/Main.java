import model.*;
import molinos.MolinoMuelasCirculares;

public class Main {
    public static void main(String[] args) {

        CafeteraRistretto ristretto = new CafeteraRistretto(800,200, TipoCafe.RISTRETTO);
        CafeteraEspresso espresso = new CafeteraEspresso(700,100, TipoCafe.ESPRESSO);
        CafeteraMolinillo conMolinillo = new CafeteraMolinillo(500,20, TipoCafe.CON_MOLINILLO, new MolinoMuelasCirculares());
        CafeteraFiltro conFiltro = new CafeteraFiltro(100,20, TipoCafe.CON_FILTRO);

        ristretto.llenar();
        espresso.llenar();
        conMolinillo.llenar();
        conFiltro.llenar();

        ristretto.servirTaza(50);
        espresso.servirTaza(30);
        conMolinillo.servirTaza(40);
        conFiltro.servirTaza(60);

        ristretto.agregarCafe(100);
        espresso.agregarCafe(150);
        conMolinillo.agregarCafe(120);
        conFiltro.agregarCafe(80);

        ristretto.vaciar();
        espresso.vaciar();
        conMolinillo.vaciar();
        conFiltro.vaciar();
    }

}