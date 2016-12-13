package data;

public class DataMask {
	private int[] intIndexes;

	public DataMask(int[] intIndexes_arg) {
		if (intIndexes_arg == null) {
			intIndexes = new int[0];
		} else {
			intIndexes = intIndexes_arg;
		}
	}

	public DataMask() {
		intIndexes = new int[0];
	}

	public int[] getIntIndexes() {
		return intIndexes;
	}
}
