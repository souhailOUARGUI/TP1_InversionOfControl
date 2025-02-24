package Metier;

import IDao.IDao;

public class MetierImpl implements  IMetier {
    private IDao dao;

    @Override
    public double calcul() {
        return 0;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

}