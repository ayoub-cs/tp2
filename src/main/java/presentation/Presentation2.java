package presentation;

import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
public class Presentation2 {

    public static void main(String[] args) {
        // Création du contexte Spring sans config directe
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // Activation du profil "dev" ou "prod"
        context.getEnvironment().setActiveProfiles("prod");  // Change "dev" → "prod" si nécessaire

        // Enregistrer la configuration principale
        context.register(Presentation2.class);
        context.refresh();

        // Récupération du bean métier
        IMetier metier = context.getBean(IMetier.class);

        // Exécution et affichage
        System.out.println("Résultat = " + metier.calcul());
    }
}
