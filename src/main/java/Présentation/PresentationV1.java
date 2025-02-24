package Présentation;

import IDao.DaoImpl;
import Metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println("RES = "+metier.calcul());
    }
}
