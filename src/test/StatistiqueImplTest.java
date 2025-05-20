import org.testng.annotations.Test;
import org.testng.Assert;

public class StatistiqueImplTest {

    @Test
    public void testAjouter() {
        StatistiqueImpl statistique = new StatistiqueImpl();
        Voiture voiture = new Voiture("Toyota", 10000);
        statistique.ajouter(voiture);

        Assert.assertEquals(1, statistique.listeVoiture.size());
    }

    @Test
    public void testPrixAucunVoiture() {
        StatistiqueImpl statistique = new StatistiqueImpl();

        try {
            statistique.prix();
            Assert.fail("Une exception ArithmeticException aurait dû être lancée.");
        } catch (ArithmeticException e) {
        }
    }

    @Test
    public void testPrixAvecRemise() {
        StatistiqueImpl statistique = new StatistiqueImpl();

        statistique.ajouter(new Voiture("Peugeot", 10000));
        statistique.ajouter(new Voiture("Renault", 10000));
        statistique.ajouter(new Voiture("BMW", 10000));
        statistique.ajouter(new Voiture("Audi", 10000));
        statistique.ajouter(new Voiture("Mercedes", 10000));

        try {
            float prixFinal = statistique.prix();
            Assert.assertTrue(prixFinal >= 0, "Le prix final ne doit pas être inférieur à 0");
        } catch (ArithmeticException e) {
            // Si l'exception est lancée, le test échoue
            Assert.fail("Une exception ne devrait pas être lancée");
        }
    }
    @Test
    public void testPrixAvecRemiseMaximale() {
        StatistiqueImpl statistique = new StatistiqueImpl();

        statistique.ajouter(new Voiture("Toyota", 50000));
        statistique.ajouter(new Voiture("Honda", 50000));
        statistique.ajouter(new Voiture("Ford", 50000));
        statistique.ajouter(new Voiture("Nissan", 50000));
        statistique.ajouter(new Voiture("Chevrolet", 50000));
        statistique.ajouter(new Voiture("BMW", 50000));
        statistique.ajouter(new Voiture("Audi", 50000));
        statistique.ajouter(new Voiture("Mercedes", 50000));
        statistique.ajouter(new Voiture("Porsche", 50000));
        statistique.ajouter(new Voiture("Lexus", 50000));

        float prixFinal = statistique.prix();

        float prixTotal = 50000 * 10;
        float remiseTotal = 0;

        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 5 == 0) {
                remiseTotal += 50000 * 0.05f;
            }
        }

        if (remiseTotal > 20000) {
            remiseTotal = 20000;
        }

        float prixAttendu = prixTotal - remiseTotal;

        Assert.assertEquals(prixAttendu, prixFinal, 0.01);
    }


}
