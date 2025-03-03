package Présentation;

import IDao.DaoImpl;
import Metier.MetierImpl;
import ext.DaoImplV2;

public class PresentationV1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println("RES = "+metier.calcul());
    }
}
