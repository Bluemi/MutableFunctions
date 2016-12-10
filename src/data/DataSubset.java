package data;

public class DataSubset {
	private int[] intIndexes;

	public DataSubset(int[] intIndexes_arg) {
		if (intIndexes_arg == null) {
			intIndexes = new int[0];
			return;
		}
		intIndexes = intIndexes_arg;
	}

	public DataSubset() {
		intIndexes = new int[0];
	}

	public int[] getIntIndexes() {
		return intIndexes;
	}
}
