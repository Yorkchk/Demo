


import java.util.Scanner;
public class MyHelloWorld{
	
	public static int inc(int a){
		a = a + 1;
		return a;
	}

	public static void main(String [] args){
	
		int a = 1;
		System.out.println(a);
		a = inc(a);
		System.out.println(a);


	/*	
		MyInteger i, alias;
		i = new MyInteger(33);
		alias = i;
		alias.value ++;
		System.out.println(i.value);
		System.out.println(alias.value);

	
		Integer i = Integer.valueOf(3);
		System.out.println(i);
		
		// Data types
		byte x = 100;
		short y = 1000;
		int z = 100000;
		long a = x*y;
		String s = "This is a string";
		char c = 'A';
		double f = 3.5;
		double d = 10238.463;
		boolean e = true;

		x = 3;
		y = 2;
		double r;
		r = (double) x/y;
		System.out.println(r);
		System.out.println("2^10 is: " + (int) Math.pow(2, 10));
		System.out.println(Math.abs(-22));

		// arrays
		int[] A = new int[7];
		System.out.println(A);
		System.out.println(A.length);

		int [] arr = {1, 2, 3, 4, 5, 6, 7};
		for(int item : arr){
			System.out.println(item);
		}
		for (int i=0; i<arr.length; i++){
			arr[i] = 0;
		}
		for(int item : arr){
			System.out.println(item);
		}
		for(int item : A){
			System.out.println(item);
		}

		System.out.println(A == arr);


		// Strings
		s = "This is a string!";
		System.out.println(s);

		System.out.println(s.charAt(3));
		
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Enter the base");
		double b = Keyboard.nextDouble();
		System.out.println("Enter the height");
		double h = Keyboard.nextDouble();
		double area = AreaOfTriangle(b, h);
		System.out.println("The area of the triangle is " + area);


		for (int item : s_to_hms(90)){
			System.out.println(item);
		}
	}
	
	public static double AreaOfTriangle(double base, double height){
			double area = base*height/2;
			return area;
	}

	public static int [] s_to_hms(int s){
		int h = s/3600;
		s = s%3600;
		int m = s/60;
		s = s%60;
		int [] L = new int [3];
		L[0] = h;
		L[1] = m;
		L[2] = s;
		return L;
		
	*/

		}

	}



