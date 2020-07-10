package org.eql;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MaClasseDeTest {
	
	String jdd_nom="Abel";
	String jdd_prenom="Alain";
	String jdd_poste="Mathématiques";
	float jdd_salaire=50000;
	
	Enseignant enseignant;

	@Before
	public void SetUp(){
		
		
	}
	@Ignore
	public void test() {

		Eleve eleve = new Eleve("Bern", "Jean-Charles", "2016");
		eleve.setAbsent(false);
		System.out.println(eleve.isAbsent());
		assertEquals(true, eleve.isAbsent());
		assertTrue(eleve.isAbsent());

	}
	
	@Test
	
	public void test2() {
		//jeux de données:
		System.out.println("TEST n°2");
		enseignant = new Enseignant (jdd_nom,jdd_prenom);
		enseignant.setSalaires(jdd_salaire);
		enseignant.setPoste(jdd_poste);
		enseignant.sePresenter();
		assertEquals(jdd_salaire,enseignant.getSalaires(),0);
		assertEquals(jdd_poste,enseignant.getPoste());
	
	}
	
	@Test
	
	public void test3() {
		System.out.println("TEST n°3");
		enseignant= new Enseignant (jdd_nom,jdd_prenom);
		int jdd_taux=10;
		float jdd_expected_new_salaire= jdd_salaire+jdd_salaire*jdd_taux/100;
	
		enseignant.setSalaires(jdd_salaire);
		Ecole.augmentation(enseignant, jdd_taux);
		assertTrue(enseignant.getSalaires()>jdd_salaire);
		assertEquals(jdd_expected_new_salaire, enseignant.getSalaires(),0.0f);
		
		
	}


}
