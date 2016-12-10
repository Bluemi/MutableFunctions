package functions;

import java.util.List;

import data.DataSubset;

public class SimpleFunction extends Function {
	public SimpleFunction(List<Function> f) {
		super(f);
	}

	@Override public DataSubset initializeSubset() {
		return new DataSubset();
	}
}
