/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionjava;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Trunks
 */
public class Hopital {

    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
        this.medecinPatiens = new TreeMap<Medecin, ListPatients>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatiens.put(m, null);
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatiens.containsKey(m)) {
            ListPatients L = new ListPatients();
            L.ajouterPatient(p);
            medecinPatiens.put(m, L);
        } else {
            ajouterMedecin(m);
            ListPatients L = new ListPatients();
            L.ajouterPatient(p);
            medecinPatiens.put(m, L);
        }
    }

    /*Avec l&#39;api stream */
    public void afficherMap() {
        medecinPatiens.entrySet().stream().forEach(e -> System.out.println(e));
    }

    /* Afficher les patients d’un medecin dont le nom est &quot;mohamed&quot; */
    public void afficherMedcinPatients(Medecin m) {
        medecinPatiens.entrySet().stream()
                //.filter(e -> e.getKey().equals(m))
                .filter(e -> e.getKey().getNom().toLowerCase().equals("mohamed"))
                .map(e -> e.getValue()).limit(1)
                .forEach(res -> System.out.println(res));
    }

    /* Retourner les noms des patients dont le &quot; numSecuriteSociale = 1&quot; */
    public List<String> RetournerNomPatients() {
        // medecinPatiens.values().stream().filter(p->p.)
    }
}
