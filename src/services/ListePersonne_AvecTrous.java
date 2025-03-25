package services;

import models.Personne;

public class ListePersonne_AvecTrous {

    public final static int NBRE_MAX_PERSONNES = 6;

    private Personne[] personnes;

    public ListePersonne_AvecTrous() {
        personnes = new Personne[NBRE_MAX_PERSONNES];
    }

    public int getNombre() {
        int count = 0;
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] != null) {
                count++;
            }
        }
        return count;

    }

    public void vider() {
        for (int i = 0; i < personnes.length; i++) {
            personnes[i] = null;
        }
    }

    public boolean ajouter(Personne p) {
        boolean ajoutReussi = false;
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] == null) {
                personnes[i] = p;
                ajoutReussi = true;
                break;
            }
        }
        return ajoutReussi;
    }

    public boolean supprimer(Personne p) {
        boolean SupressionReussie = false;
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] == p) {
                personnes[i] = null;
                SupressionReussie = true;
                break;
            }
        }
        return SupressionReussie;
    }

    public void afficher() {
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] == null) {
                continue;
            }
            System.out.println(personnes[i]);
        }
    }
}
