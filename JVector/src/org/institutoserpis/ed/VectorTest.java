package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class VectorTest {

	// @Test
	// public void indexOf(){
	//
	// int[] v= new int[]{12, 15, 30, 55 ,75};
	// int value = 9;
	// int index = Vector.indexOf(v, value);
	// Assert.assertArrayEquals(3,index);
	// }

	@Test
	public void indexOf() {
		assertEquals(0, Vector.indexOf(new int[] { 32, 15, 7, 9, 12 }, 32));
		assertEquals(2, Vector.indexOf(new int[] { 32, 15, 7, 9, 12 }, 7));
		assertEquals(3, Vector.indexOf(new int[] { 32, 15, 7, 9, 12 }, 9));
		assertEquals(4, Vector.indexOf(new int[] { 32, 15, 7, 9, 12 }, 12));
		assertEquals(-1, Vector.indexOf(new int[] { 32, 15, 7, 9, 12 }, 99));
	}

	@Test
	public void indexOfEmpty() {
		assertEquals(-1, Vector.indexOf(new int[] {}, 123));
	}

	@Test
	public void min() {
		assertEquals(3, Vector.min(new int[] { 3, 15, 7, 9, 12 }));
		assertEquals(7, Vector.min(new int[] { 32, 15, 7, 9, 12 }));
		assertEquals(2, Vector.min(new int[] { 32, 15, 7, 9, 2 }));
	}

	@Test
	public void selectionsort() {
		int[] v = new int[] { 32, 15, 12, 9, 7 };
		Vector.selectionSort(v);
		assertArrayEquals(new int[] { 7, 9, 12, 15, 32 }, v);
	}

}
