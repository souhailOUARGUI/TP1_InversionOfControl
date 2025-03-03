package Présentation;

import IDao.IDao;
import Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PrésentationV2 {
    public static void main(String[] args)  {
        Scanner scn = null;
        try {
            scn = new Scanner(new File("config.txt"));
            String daoClassname = scn.nextLine();
            Class cDao = Class.forName(daoClassname);
            IDao dao =(IDao)  cDao.getConstructor().newInstance();
            //System.out.println(dao.getData());

            String metierClassname = scn.nextLine();
            Class cMetier = Class.forName(metierClassname);
            IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

            Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
            //metier.setDao(dao)
            setDao.invoke(metier,dao);


            System.out.println("RES=" + metier.calcul());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
