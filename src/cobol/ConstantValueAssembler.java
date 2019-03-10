/*
 * @(#)DateAssembler.java	 0.0.1
 *
 * Copyright (c) 2019 Julian M. Bass
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */
 
package cobol;

import parse.*;
import parse.tokens.*;
public class ConstantValueAssembler extends Assembler {
/**
 * Pop a string, and set the target SectionName to this
 * string.
 *
 * @param   Assembly   the assembly to work on
 */
public void workOn(Assembly a) {
	Cobol c = new Cobol();
	Token t = (Token) a.pop();
	c.setConstantValue( t.nval() );
	System.out.println("Token string[4]: " + c.getConstantValue() );
	
	t = (Token) a.pop();
	String tokenString = t.sval();
	System.out.println("Token string[3]: " + tokenString );
	
	t = (Token) a.pop();
	c.setConstantName(t.sval() );
	System.out.println("Token string[2]: " + c.getConstantName() );
	
	t = (Token) a.pop();
	c.setLineNumber( t.nval() );
	System.out.println("Token string[2]: " + c.getLineNumber() );

	a.setTarget(c);
}
}