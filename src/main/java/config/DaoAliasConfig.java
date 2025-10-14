package config;

import dao.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoAliasConfig {

    // 🔁 Alias "dao" qui renvoie une implémentation précise
    @Bean(name = "dao")
    public IDao daoAlias(DaoApi target) {
        return target; // alias "dao" → "daoApi"
    }

    /*
     * 🧠 Pour changer d’implémentation :
     * - DaoFile target  → retourne 180.0
     * - DaoImpl2 target → retourne 150.0
     * - DaoImpl target  → retourne 100.0
     */
}
