package data;

// Wird von Funktionen benutzt, um anzugeben, welche Parameter sie erwartet

public class DataPattern {
	private int intsSize;

	public DataPattern(int intsSize_arg) {
		intsSize = intsSize_arg;
	}

	public int getIntsSize() {
		return intsSize;
	}

	public boolean matches(Data d) {
		return this.getIntsSize() == d.getIntsSize();
	}
}
