package functions;

import java.util.List;
import java.util.ArrayList;

import data.DataPattern;

public class MutableFunction extends Function {
	private DataPattern pattern;

	public MutableFunction(DataPattern p) {
		super();
		pattern = p;
	}

	@Override public DataPattern getDataPattern() {
		return pattern;
	}
}
