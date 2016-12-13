package functions.elemental;

import functions.ElementalFunction;
import data.Data;
import data.DataPattern;

public class Print extends ElementalFunction {
	private String text;

	public Print(String t) {
		super();
		text = t;
	}

	@Override public DataPattern getDataPattern() {
		return new DataPattern(0); // Es werden keine Parameter erwartet
	}

	@Override public void func(Data d) {
		System.out.print(text);
	}
}
