/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionjava;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author Trunks
 */
public class SetMedecins {

    private Set<Medecin> setM;

    public SetMedecins() {
        setM = new HashSet<Medecin>();
    }

    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }

    /* Avec l’api Stream */
    public boolean rechercherMedecin(int cin) {
        if (setM.stream().filter(p -> p.getCin() == cin).count() == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* Avec l’api Stream */
    public void afficherMedecins() {
        setM.stream().forEach(p -> System.out.println(p));
    }

    public long nombreMedecins() {
        return setM.stream().count();
    }

    /* Avec l’api Stream */
    public TreeSet<Medecin> trierMedecins() {
        return setM.stream().collect(Collectors.toCollection(() -> new TreeSet<>((m1, m2) -> m1.getCin() - m2.getCin())));
    }
}
