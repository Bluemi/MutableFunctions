package data;

import java.util.List;

public class Data {
	private int[] ints;

	// creates a Data Object
	public Data(int[] ints_arg) {
		if (ints_arg == null) {
			System.out.println("[ERROR]: Data.Data(): ints_arg == null");
			ints = new int[] {};
		} else {
			ints = ints_arg;
		}
	}

	// creates an empty Data Object
	public Data() {
		ints = new int[0];
	}

	public static Data merge(Data data1, Data data2) {
		if (data1 == null) {
			System.out.println("[ERROR]: Data.merge(): data1 == null");
			return new Data();
		}

		if (data2 == null) {
			System.out.println("[ERROR]: Data.merge(): data2 == null");
			return new Data();
		}

		int [] tmp_ints = new int[data1.getIntsSize() + data2.getIntsSize()];

		for (int i = 0; i < data1.getIntsSize(); i++) {
			tmp_ints[i] = data1.getInt(i);
		}

		for (int i = data1.getIntsSize(); i < data1.getIntsSize() + data2.getIntsSize(); i++) {
			tmp_ints[i] = data2.getInt(i);
		}

		return new Data(tmp_ints);
	}

	public int getIntsSize() {
		return ints.length;
	}

	public void addInt(int n) {
		int[] tmp_ints = new int[ints.length + 1];
		for (int i = 0; i < ints.length; i++) {
			tmp_ints[i] = ints[i];
		}
		tmp_ints[tmp_ints.length-1] = n;
	}

	public int getInt(final int index) {
		if (index < 0 || index >= ints.length) {
			System.out.println("[ERROR]: Data.getInt(index = " + index + "): index out of range. ints.length = " + ints.length);
			return 0;
		}
		return ints[index];
	}

	public Data getDataBySubset(DataSubset sub) {
		int[] indexes = sub.getIntIndexes();
		int[] ints = new int[indexes.length];
		for (int i = 0; i < indexes.length; i++) {
			ints[i] = getInt(indexes[i]);
		}
		return new Data(ints);
	}
}
