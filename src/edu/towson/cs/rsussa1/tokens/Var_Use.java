package edu.towson.cs.rsussa1.tokens;

/**
 * COSC455 - Programming Languages and Implementation
 * 
 * Richard Sussan
 */
import edu.towson.cosc.cosc455.interfaces.LegalToken;
import edu.towson.cs.rsussa1.compiler_implementation.Token;

public class Var_Use implements LegalToken {
	static Token t = new Token("$USE");
	
	@Override
	public boolean isLegal(String str){
		if(str.equalsIgnoreCase(t.getToken())){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public String getHTML(boolean openTag) {
		return "";
	}
}
