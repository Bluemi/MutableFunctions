package data;

import functions.Function;

public class DataController {
	private Function function;
	private DataMask mask;

	public DataController(Function f, DataMask m) {
		function = f;
		mask = m;
	}

	public void func(Data d) {
		Data parameters = d.getDataByMask(mask);
		function.func(parameters);
	}
}
