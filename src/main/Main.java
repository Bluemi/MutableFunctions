package main;

import java.util.ArrayList;

import functions.Function;
import functions.SimpleFunction;
import functions.elemental.Print;
import functions.elemental.Addition;
import data.Data;

public class Main {
	public static void main(String[] args) {
		Function f = new SimpleFunction();
		f.func(new Data(new int[] {2, 4}));

		f.addFunction(new Addition());

		f.func(new Data(new int[] {2, 4}));
	}
}
