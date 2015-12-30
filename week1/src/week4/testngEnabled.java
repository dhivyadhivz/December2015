package week4;

public class testngEnabled {

	package testng;

	import org.testng.annotations.*;

	public class AnnotationEnabled {

		@Test
		public void splendor() {
			System.out.println("Splendor bike Comes out");
		}


		@Test
		public void ford() {
			System.out.println("Ford car Come out");
		}

		@Test(/*enabled = false*/)
		public void bsa() {
			System.out.println("bsa bicycle Come out");
		}

	}

}
