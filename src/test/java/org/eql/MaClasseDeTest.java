package org.eql;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MaClasseDeTest {

	String jdd_nom = "Abel";
	String jdd_prenom = "Alain";
	String jdd_poste = "Mathématiques";
	float jdd_salaire = 50000;

	IEmployeEcole ie;

	@Before
	public void SetUp() {

	}

	@Ignore
	public void test() {

		boolean jdd_absence = true;
		System.out.println("TEST 1");
		Eleve eleve = new Eleve("Bern", "Jean-Charles", "2016");
		eleve.setAbsent(jdd_absence);
		System.out.println(eleve.isAbsent());
		assertEquals(jdd_absence, eleve.isAbsent());
		assertTrue(eleve.isAbsent());

	}

	@Ignore

	public void test2() {
		// jeux de données:
		System.out.println("TEST n°2");
		ie = new Enseignant(jdd_nom, jdd_prenom);
		System.out.println(ie.getPoste().toUpperCase());
		ie.setSalaires(jdd_salaire);
		ie.setPoste(jdd_poste);
		ie.sePresenter();
		assertEquals(jdd_salaire, ie.getSalaires(), 0);
		assertEquals(jdd_poste, ie.getPoste());

	}

	@Ignore

	public void test3() {
		System.out.println("TEST n°3");
		ie = new PersonnelAdministratif(jdd_nom, jdd_prenom);
		System.out.println(ie.getPoste().toUpperCase());
		int jdd_taux = 10;
		float jdd_expected_new_salaire = jdd_salaire + jdd_salaire * jdd_taux / 100;

		ie.setSalaires(jdd_salaire);
		Ecole.augmentation(ie, jdd_taux);
		assertTrue(ie.getSalaires() > jdd_salaire);
		assertEquals(jdd_expected_new_salaire, ie.getSalaires(), 0.0f);

	}

	@Ignore

	public void test4() {
		Eleve eleve1 = new Eleve("Jean", "Testeur", "1990");
		eleve1.setNiveau_classe(NiveauClasse.CE2);
		assertEquals("CE2", eleve1.getNiveau_classe().toString());

	}

	@Ignore
	public void testDemandeAugmentationValide() {
		ie = new PersonnelAdministratif(jdd_nom, jdd_prenom);
		ie.setNb_absences_mois_en_cours(3);
		ie.setSalaires(7000);
		do {
			ie.demanderAugmentation(5);
			System.out.println(ie.getSalaires());
		} while (ie.getSalaires() < 20000);
		assertTrue(ie.getSalaires() > 6000);
	}

	@Ignore
	public void testDemandeAugmentationNonValide() {
		ie = new PersonnelAdministratif(jdd_nom, jdd_prenom);
		ie.setNb_absences_mois_en_cours(6);
		ie.setSalaires(2000);

		ie.demanderAugmentation(5);

		assertTrue(ie.getSalaires() == 2000);
	}

	
	@Ignore
	public void testAssignerClasseEleveValide() throws AgeEleveException {
			Eleve e = new Eleve(jdd_nom, jdd_prenom, 6);
			Ecole.assignerClasseEleve(e);
			assertEquals(NiveauClasse.CP, e.getNiveau_classe());
	}
	
	@Ignore
	public void testAssignerClasseEleveValide2() throws AgeEleveException {
		int i;
		for (i = 0; i < 4; i++) {
			Eleve e = new Eleve(jdd_nom, jdd_prenom, 6);
			Ecole.assignerClasseEleve(e);
			assertEquals(NiveauClasse.CP, e.getNiveau_classe());
		}
	}

	@Ignore
	public void testAssignerClasseEleveInvalideInf() throws AgeEleveException {
		Eleve e = new Eleve(jdd_nom, jdd_prenom, 5);
		Ecole.assignerClasseEleve(e);
		assertEquals(null, e.getNiveau_classe());
	}

	@Ignore
	public void testAssignerClasseEleveInvalideSup() throws AgeEleveException {
		Eleve e = new Eleve(jdd_nom, jdd_prenom, 11);
		Ecole.assignerClasseEleve(e);
		try {
			assertEquals(NiveauClasse.CP, e.getNiveau_classe());
		}
		catch(AssertionError er) {
			System.out.println("ERREURE FATALE!!");
			throw er;
		}
	}
	
	@Ignore
	public void testPresentationEmploye() {
		
		Enseignant ens1 = new Enseignant("Bon", "Jean");
		Enseignant ens2 = new Enseignant("BonBeure", "Jean");
		Enseignant ens3 = new Enseignant("Neymar", "Jean");
		Enseignant ens4 = new Enseignant("Peuxplus", "Jean");
		
		ens1.setSalaires(5000);
		
		PersonnelAdministratif pa1 = new PersonnelAdministratif("MacouvertureMeGratte", "Sandra");
		PersonnelAdministratif pa2 = new PersonnelAdministratif("Titegoutte", "Justine");
		PersonnelAdministratif pa3 = new PersonnelAdministratif("Nom", "Justine");
		
		List<IEmployeEcole> liste_employe= new ArrayList<IEmployeEcole>();
		
		liste_employe.add(ens1);
		liste_employe.add(ens2);
		liste_employe.add(ens3);
		liste_employe.add(ens4);
		liste_employe.add(pa1);
		liste_employe.add(pa2);
		liste_employe.add(pa3);
		
		System.out.println(liste_employe.size());
		
		for(IEmployeEcole ie : liste_employe) {
			ie.sePresenter();
			ie.demanderAugmentation(20);
		}
	}	
		
		@Ignore
		public void testPresentationEmployeMohamed() {
		
			List<IEmployeEcole> liste_employe= new ArrayList<IEmployeEcole>();
			for (int i=1;i<5;i++) {
				jdd_prenom = "Prenom_ens_"+i;
				jdd_nom = "Nom_ens_"+i;
				Enseignant ens1 = new Enseignant(jdd_prenom, jdd_nom);
				liste_employe.add(ens1);
			}
			for (int i=1;i<4;i++) {
				jdd_prenom = "Prenom_adm_"+i;
				jdd_nom = "Nom_adm_"+i;
				PersonnelAdministratif adm = new PersonnelAdministratif(jdd_prenom, jdd_nom);
				liste_employe.add(adm);
			}
			
			System.out.println(liste_employe.size());
			
			for(IEmployeEcole ie : liste_employe) {
				ie.sePresenter();
			}
	}
		
		@Test(expected=AgeEleveException.class, timeout=1000)
		
		public void testAgeEleveNonpassant() throws AgeEleveException{
			Eleve e= new Eleve(jdd_nom, jdd_prenom,3);
		}

}
