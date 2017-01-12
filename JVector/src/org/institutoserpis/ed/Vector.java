package org.institutoserpis.ed;

import java.util.Random;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int index = 0;
		// while (index < 25){
		// System.out.println("index= " +index);
		// index++;
		// }
		// System.out.println(index);
		// ---------------------------------------------------------------
		// for (int index = 0; index < 5 ; index++) {
		// System.out.println("index= " +index);
		// ---------------------------------------------------------------

		// int [] v = new int [] {32, 15, 7, 9, 12};
		// for (int index = 0; index < 5; index++) {
		// for (int index = 0; index < v.length; index++) { en caso de que
		// puedas poner mas o menos numeros que te los reconozca.
		// System.out.println(v[index]);
		// System.out.println("fin...");
		// }
		// -----------------------------------------------------------------

		// int [] v = new int [100];
		// for (int index = 0; index < v.length; index++){
		// v[index] = index *2;
		// System.out.println(v[index]);
		// }
		// System.out.println("fin...");
		// ------------------------------------------------------------------
		int[] v = new int[] { 12, 15, 30, 55, 75 };
		for (int index = 0; index < v.length; index++) {
			v[index] = index * 2;
			System.out.println(v[index]);
		}
		System.out.println("indexOF=" + indexOf(v, 9));
	}

	public static int indexOf(int[] v, int item) {
		int index = 0;
		while (index < v.length && v[index] != item)
			index++;
		if (index == v.length)
			return -1;
		return index;
	}

	public static int min(int[] v) {
		return 0;
	}

	public static void selectionSortUgly(int[] v) {
		for (int itemIndex = 0; itemIndex < v.length - 1; itemIndex++) {
			int indexOfMin = itemIndex;
			for (int index = itemIndex + 1; index < v.length; index++)
				if (v[index] < v[indexOfMin])
					indexOfMin = index;
			int aux = v[itemIndex];
			v[itemIndex] = v[indexOfMin];
			v[indexOfMin] = aux;
		}
	}

	private static int indexOfMin(int[] v, int initialIndex) {
		int indexOfMin = initialIndex;
		for (int index = initialIndex + 1; index < v.length; index++)
			if (v[index] < v[indexOfMin])
				indexOfMin = index;
		return indexOfMin;
	}

	private static void swap(int[] v, int indexOne, int indexTwo) {
		int aux = v[indexOne];
		v[indexOne] = v[indexTwo];
		v[indexTwo] = aux;
	}

	public static void selectionSort(int[] v) {
		for (int itemIndex = 0; itemIndex < v.length - 1; itemIndex++) {
			int indexOfMin = indexOfMin(v, itemIndex);
			swap(v, itemIndex, indexOfMin);
		}
	}
}
