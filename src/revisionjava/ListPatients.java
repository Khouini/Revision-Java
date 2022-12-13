/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Trunks
 */
public class ListPatients implements InterfacePatient {
    
    private ArrayList<Patient> listP;
    
    public ListPatients() {
        listP = new ArrayList<Patient>();
    }
    
    @Override
    public void ajouterPatient(Patient p) {
        listP.add(p);
    }
    
    @Override
    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

    /* Avec l’api Stream */
    @Override
    public boolean rechercherPatient(Patient p) {
        boolean res = false;
        if (listP.contains(p)) {
            res = false;
        }
        return res;
    }

    /* Avec l’api Stream */
    @Override
    public boolean rechercherPatient(int cin) {
        boolean res = false;
        for (Patient e : listP) {
            if (e.getCin() == cin) {
                res = true;
            }
        }
        return res;
    }
    
    public void afficherPatients() {
        // /*à completer*/(9) (1 point

    }

    /* Avec l’api Stream */
    @Override
    public void trierPatientsParNom() {
        Collections.sort(listP);
    }

    /* Avec l&#39;api stream */
    public void PatientSansRedondance() {
        listP.stream().collect(Collectors.toSet()).forEach(el -> System.out.println(el));
    }
}
