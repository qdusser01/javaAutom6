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
	
	IEmployeEcole ie;

	@Before
	public void SetUp(){
		
		
	}
	@Test
	public void test() {

		boolean jdd_absence=true;
		System.out.println("TEST 1");
		Eleve eleve = new Eleve("Bern", "Jean-Charles", "2016");
		eleve.setAbsent(jdd_absence);
		System.out.println(eleve.isAbsent());
		assertEquals(jdd_absence, eleve.isAbsent());
		assertTrue(eleve.isAbsent());

	}
	
	@Test
	
	public void test2() {
		//jeux de données:
		System.out.println("TEST n°2");
		ie = new Enseignant(jdd_nom,jdd_prenom);
		System.out.println(ie.getPoste().toUpperCase());
		ie.setSalaires(jdd_salaire);
		ie.setPoste(jdd_poste);
		ie.sePresenter();
		assertEquals(jdd_salaire,ie.getSalaires(),0);
		assertEquals(jdd_poste,ie.getPoste());
	
	}
	
	@Test
	
	public void test3() {
		System.out.println("TEST n°3");
		ie= new PersonnelAdministratif(jdd_nom,jdd_prenom);
		System.out.println(ie.getPoste().toUpperCase());
		int jdd_taux=10;
		float jdd_expected_new_salaire= jdd_salaire+jdd_salaire*jdd_taux/100;
	
		ie.setSalaires(jdd_salaire);
		Ecole.augmentation(ie, jdd_taux);
		assertTrue(ie.getSalaires()>jdd_salaire);
		assertEquals(jdd_expected_new_salaire, ie.getSalaires(),0.0f);
		
		
	}


}
