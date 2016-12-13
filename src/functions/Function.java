package functions;

import java.util.List;
import java.util.ArrayList;

import data.Data;
import data.DataController;
import data.DataPattern;

public abstract class Function {
	private List<DataController> units; // Liste aller Funktionen, die in dieser Funktion aufgerufen werden
	private Data stack;

	public Function() {
		units = new ArrayList<DataController>();
		stack = new Data();
	}

	// geht alle Funktionen durch und führt diese aus
	public void func(Data parameters) {
		evaluateParameters(parameters);
		Data data = Data.merge(stack, parameters);
		for (DataController unit : units) {
			unit.func(data);
		}
	}

	// Gibt an, welche Parameter von der Funktion erwartet werden
	public abstract DataPattern getDataPattern();

	public void addFunction(DataController c, int index) {
		units.add(index, c);
	}

	public void addFunction(DataController c) {
		units.add(c);
	}

	public void removeFunction(int index) {
		units.remove(index);
	}

	protected void evaluateParameters(Data params) {
		if (! getDataPattern().matches(params)) {
			System.out.println("[WARN ]: Function.evaluateParameters(): Illegal Parameters");
			System.out.println("\t[EXPLA]: Function expected IntsSize == " + getDataPattern().getIntsSize());
			System.out.println("\t[EXPLA]: but data.getIntsSize == " + params.getIntsSize());
		}
	}
}
