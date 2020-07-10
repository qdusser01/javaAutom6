package org.eql;

public final class Ecole {

	public static void augmentation(IEmployeEcole ie, int taux) {
		
		ie.setSalaires(ie.getSalaires()+(ie.getSalaires()*taux/100));
	}
	

}
