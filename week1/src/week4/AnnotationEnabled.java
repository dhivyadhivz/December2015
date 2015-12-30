package week4;

import org.testng.annotations.Test;


import org.testng.annotations.*;

public class AnnotationEnabled {

	@Test
	public void splendor() {
		System.out.println("Splendor bike Comes out");
	}


	@Test(enabled = true)
	public void ford() {
		System.out.println("Ford car Come out");
	}

	@Test
	public void bsa() {
		System.out.println("bsa bicycle Come out");
	}

}

