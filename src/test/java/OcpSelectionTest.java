import config.PropertyDrivenConfig;
import metier.IMetier;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OcpSelectionTest {

    @Test
    public void testMetier() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PropertyDrivenConfig.class);

        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat : " + metier.calcul());

        context.close();
    }
}
