package functions;

import java.util.ArrayList;

public abstract class ElementalFunction extends Function {
	public ElementalFunction() {
		super(new ArrayList<Function>()); // empty Function -> elemental
	}
}
