import java.util.ArrayList;

public class StatistiqueImpl implements Statistique {

    ArrayList<Voiture> listeVoiture;

    public StatistiqueImpl() {
        this.listeVoiture = new ArrayList<>();
    }

    @Override
    public void ajouter(Voiture voiture) {
        this.listeVoiture.add(voiture);
    }

    @Override
    public float prix() throws ArithmeticException {
        if (listeVoiture.size() == 0) {
            throw new ArithmeticException("Aucune voiture ajoutée");
        }

        float prixTotal = 0;
        float remiseTotal = 0;

        // Calcul du prix total des voitures
        for (int i = 0; i < listeVoiture.size(); i++) {
            prixTotal += listeVoiture.get(i).getPrix();

            // Appliquer 5% de remise sur chaque voiture tous les 5 ajouts
            if ((i + 1) % 5 == 0) {
                remiseTotal += listeVoiture.get(i).getPrix() * 0.05f; // 5% de remise sur chaque voiture

                // Plafonner la remise à 20000
                if (remiseTotal > 20000) {
                    remiseTotal = 20000;
                }
            }
        }

        // Retourner le prix final après remise
        return prixTotal - remiseTotal;
    }


}