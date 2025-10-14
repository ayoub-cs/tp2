package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {

    @Autowired
    private IDao dao;  // Spring injectera le DAO correspondant au profil actif

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }

    // Setter optionnel pour tests unitaires
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
