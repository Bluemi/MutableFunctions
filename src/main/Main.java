package main;

import java.util.ArrayList;

import functions.Function;
import functions.MutableFunction;
import functions.elemental.Print;
import functions.elemental.Addition;
import data.Data;
import data.DataController;
import data.DataMask;
import data.DataPattern;

public class Main {
	public static void main(String[] args) {
		Function f = new MutableFunction(new DataPattern(2));

		f.addFunction(new DataController(new Addition(), new DataMask(new int[] {0, 1})));

		f.func(new Data(new int[] {2, 5}));
	}
}
