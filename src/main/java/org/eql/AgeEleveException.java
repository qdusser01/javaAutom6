package org.eql;

public class AgeEleveException extends Exception{

	public AgeEleveException(String m) {
		super(m);
		System.out.println(m);
	}

}
