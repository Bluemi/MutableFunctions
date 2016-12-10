package functions;

import java.util.List;

import data.Data;
import data.DataSubset;

public abstract class Function {
	private List<Function> functions; // Liste aller Funktionen, die in dieser Funktion aufgerufen werden
	private Data stack;
	private DataSubset subset;

	public Function(List<Function> f) {
		functions = f;
		stack = new Data();
		subset = initializeSubset();
	}

	public void func(Data parameters) { // geht alle Funktionen durch und führt diese aus
		Data data = Data.merge(stack, parameters);
		for (Function f : functions)
		{
			f.func(data.getDataBySubset(f.getSubset()));
		}
	}

	protected abstract DataSubset initializeSubset();

	protected DataSubset getSubset()
	{
		return subset;
	}
}
