package functions.elemental;

import functions.ElementalFunction;
import data.Data;
import data.DataSubset;

public class Addition extends ElementalFunction
{
	public Addition()
	{
		super();
	}

	@Override public void func(Data d)
	{
		int a = d.getInt(0);
		int b = d.getInt(1);
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	@Override protected DataSubset initializeSubset() {
		return new DataSubset(new int[] {0, 1});
	}
}
