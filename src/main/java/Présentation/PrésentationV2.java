package Présentation;

import IDao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrésentationV2 {
    public static void main(String[] args)  {
        Scanner scn = null;
        try {
            scn = new Scanner(new File("config.txt"));
            String daoClassname = scn.nextLine();
            Class cDao = Class.forName(daoClassname);
            IDao dao =(IDao)  cDao.getConstructor().newInstance();
            System.out.println(dao.getData());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
