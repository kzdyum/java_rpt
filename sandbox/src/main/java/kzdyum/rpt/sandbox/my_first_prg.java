package kzdyum.rpt.sandbox;

public class my_first_prg {

	public static void main(String[] args){
		hello("world");
		hello("user");
		hello("Kate");

		double l = 5;
		System.out.println("Площадь квадрата со стороной "+l+" = "+area(l));

		double a=5, b=2;
		System.out.println("Площадь прямоугольника со сторонами "+a+" и "+b+" = "+area(a,b));

}
public static void hello(String somebody){
		System.out.println("Hello, "+somebody+"!");
}
public static Double area (double len){
		return len*len;
	}
public static Double area (double a, double b){
	return	a*b;
}
}