package Array;

public class ArrayDemo {

	public static void main(String[] args) {
		int a = 5;
//		System.out.println(+a);   // 5
//		System.out.println(-a);   // -5
		System.out.println(a++);  // 5 (then a becomes 6)
		System.out.println(++a);  // 7 (a becomes 7, then prints 7)
		System.out.println(a--);  // 7 (then a becomes 6)
		System.out.println(--a);  // 5

		

		
		/*
		int a = 5;
//		System.out.println(+a);   // 5
//		System.out.println(-a);   // -5
		System.out.println(a++);  // 5 (then a becomes 6)
		System.out.println(++a);  // 7 (a becomes 7, then prints 7)
		System.out.println(a--);  // 7 (then a becomes 6)
		System.out.println(--a);  // 5

		
		
//		How to create an array
		int[] arr1 = new int[5]; // size = 5
		
//		Single Dimensional Array
		int[] arr = {10, 20, 30, 40, 50};
		
//		Multidimensional Array (2D)
		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6 } };
		
//		Print Array
		for (int i = 0; i < arr.length; i++) {
		    System.out.println(arr[i]);
		}
		
		for (int num : arr) {
		    System.out.println(num);
		}
		
		for (int i = 0; i < arr2D.length; i++) {
		    for (int j = 0; j < arr2D[i].length; j++) {
		        System.out.print(arr2D[i][j] + " ");
		    }
		    System.out.println();
		}
		*/
		
///////////////////////////////////////////////////////////////////////////

		
		int[][] arr5 = {
			    {1, 2, 3, 4},
			    {5, 6, 7, 8},
			    {9, 10, 11, 12}
			};

		    //sd not use hardcoaded
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < arr5[i].length; j++) {
					System.out.print(arr5[i][j] + " ");
				}
				System.out.println();
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(arr5[i][j] + " ");
				}
				System.out.println();
			}
		
	

	}

}
