package functions.elemental;

import functions.ElementalFunction;
import data.Data;
import data.DataSubset;

public class Print extends ElementalFunction {
	private String text;

	public Print(String t) {
		super();
		text = t;
	}

	@Override public void func(Data d) {
		System.out.print(text);
	}

	@Override protected DataSubset initializeSubset() {
		return new DataSubset();
	}
}
