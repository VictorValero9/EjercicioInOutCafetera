import model.*;

public class Main {
    public static void main(String[] args) {

        CafeteraRistretto ristretto = new CafeteraRistretto(800,200);
        CafeteraEspresso espresso = new CafeteraEspresso(700,100);
        CafeteraMolinillo conMolinillo = new CafeteraMolinillo(500,20);
        CafeteraFiltro conFiltro = new CafeteraFiltro(100,20);

        ristretto.llenar();
        espresso.llenar();
        conMolinillo.llenar();
        conFiltro.llenar();

        ristretto.servirTaza(50, TipoCafe.RISTRETTO);
        espresso.servirTaza(30, TipoCafe.ESPRESSO);
        conMolinillo.servirTaza(40, TipoCafe.CON_MOLINILLO);
        conFiltro.servirTaza(60, TipoCafe.CON_FILTRO);

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