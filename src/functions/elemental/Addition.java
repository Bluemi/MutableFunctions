package functions.elemental;

import functions.ElementalFunction;
import data.Data;
import data.DataPattern;

public class Addition extends ElementalFunction
{
	public Addition()
	{
		super();
	}

	@Override public DataPattern getDataPattern() {
		return new DataPattern(2); // Es werden zwei Int-Parameter erwartet
	}

	@Override public void func(Data d)
	{
		System.out.println(d.getInt(0) + " + " + d.getInt(1) + " = " + (d.getInt(0) + d.getInt(1)));
	}
}
