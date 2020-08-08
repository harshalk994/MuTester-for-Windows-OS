/*
 * This is a program that takes as inputs 3 sides of a triangle and 
 * returns the type of triangle (Scalene, Equilateral or Isosceles) 
 */

public class Triangle {
	
	public static String classify(int a, int b, int c) {
		int trian;
		String invalid="INVALID";
		String scalene="SCALENE";
		String equilateral="EQUILATERAL";
		String isosceles="ISOSCELES";
		
		if (a <= 0 || b <= 0 || c <= 0)
			return invalid;
		trian = 0;
		if (a == b)
			trian = trian + 1;
		if (a == c)
			trian = trian + 2;
		if (b == c)
			trian = trian + 3;
		if (trian == 0)
			if (a + b <= c || a + c <= b || b + c <= a)
				return invalid;
			else
				return scalene;
		if (trian > 3)
			return equilateral;
		if (trian == 1 && a + b > c)
			return isosceles;
		else if (trian == 2 && a + c > b)
			return isosceles;
		else if (trian == 3 && b + c > a)
			return isosceles;
		return invalid;
	}
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		System.out.println(classify(5, 5, 3));
	}

}
