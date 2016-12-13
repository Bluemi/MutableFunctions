package functions;

import java.util.ArrayList;

import data.DataController;
import data.Data;

public abstract class ElementalFunction extends Function {
	public ElementalFunction() {
		super(); // empty Function -> elemental
	}

	@Override public void addFunction(DataController c, int index) {
		System.out.println("ElementalFunction.addFunction(): should never be called");
	}

	@Override public void func(Data params) {
		evaluateParameters(params);
	}
}
