package dao;

import org.springframework.stereotype.Component;

@Component("daoApi")
public class DaoApi implements IDao {

    @Override
    public double getValue() {
        return 42; // valeur simulée pour test
    }
}
