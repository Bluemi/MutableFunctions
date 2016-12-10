package main;

import java.util.ArrayList;

import functions.Function;
import functions.SimpleFunction;
import functions.elemental.Print;
import functions.elemental.Addition;
import data.Data;

public class Main {
	public static void main(String[] args) {
		ArrayList<Function> a = new ArrayList<Function>();
		//a.add(new Print("hello World"));
		a.add(new Addition());
		Function f = new SimpleFunction(a);
		f.func(new Data(new int[] {2, 4}));
	}
}
