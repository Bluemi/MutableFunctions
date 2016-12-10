package functions;

import java.util.List;
import java.util.ArrayList;

import data.DataSubset;

public class SimpleFunction extends Function {
	public SimpleFunction(List<Function> f) {
		super(f);
	}

	public SimpleFunction() {
		super(new ArrayList<Function>());
	}

	@Override public DataSubset initializeSubset() {
		return new DataSubset();
	}
}
