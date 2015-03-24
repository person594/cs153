/*
	PreIncrementExpression.java

    Small-C compiler - SJSU
	March-1-2015

	By Sean Papay, Matt Pleva, Luca Severini
*/

package retree.expression;

import static retree.RetreeUtils.*;
import retree.exceptions.*;
import retree.type.*;
import retree.intermediate.*;

public class PreIncrementExpression extends Expression
{
	private final LValue l;

	public PreIncrementExpression(LValue l) throws TypeMismatchException
	{
		super(l.getType());

		this.l = l;
	}

	public Expression collapse()
	{
		try
		{
			return new PreIncrementExpression(l.collapse());
		}
		catch (retree.exceptions.TypeMismatchException e)
		{
			return null;
		}
	}

	public String generateCode(boolean valueNeeded)
	{
		Optimizer.addInstruction("PreIncrement("+ this.toString() + ")", "","");
		String code = COM("PreIncrement("+ this.toString());
		code += l.generateAddress();
		// String code = l.generateCode(valueNeeded);

		code += POP(3, "X1");

		if (getType() instanceof PointerType)
		{
			PointerType pt = (PointerType) getType();
			Optimizer.addInstruction("PreIncrement pointer pointed by X1", "", "MA", ADDR_CONST(pt.getType().sizeof(), false), "0+X1");
			code += INS("PreIncrement pointer pointed by X1", null, "MA", ADDR_CONST(pt.getType().sizeof(), false), "0+X1");
		}
		else
		{
			Optimizer.addInstruction("PreIncrement variable pointed by X1", "", "A", NUM_CONST(1, false), "0+X1");
			code += INS("PreIncrement variable pointed by X1", null, "A", NUM_CONST(1, false), "0+X1");
		}

		if (valueNeeded)
		{
			code += PUSH(l.getType().sizeof(),"0+X1");
		}

		return code;
	}

	public String toString()
	{
		return "(" + "++" + l + ")";
	}
}
