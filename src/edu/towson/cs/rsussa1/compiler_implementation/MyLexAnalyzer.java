package edu.towson.cs.rsussa1.compiler_implementation;

/*
 * COSC455 - Programming Languages and Implementation
 * 
 * Richard Sussan
 */

import edu.towson.cosc.cosc455.interfaces.LexicalAnalyzer;

public class MyLexAnalyzer implements LexicalAnalyzer {
	private String nextCharacter = "";
	private int currentPosition = 0;
	
	@Override
	public void getNextToken() {
		
	}

	@Override
	public void getCharacter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCharacter() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSpace(String c) {
		if(c.equals(" ")){
			return true;
		}
		return false;
	}

	@Override
	public boolean lookupToken() {
		// TODO Auto-generated method stub
		return false;
	}

}