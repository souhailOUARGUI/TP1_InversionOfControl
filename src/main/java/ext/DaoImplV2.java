package ext;

import IDao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web Service");
        double t = 11;
        return t;
    }
}
