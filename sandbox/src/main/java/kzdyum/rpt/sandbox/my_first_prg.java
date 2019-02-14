package kzdyum.rpt.sandbox;

public class my_first_prg {

	public static void main(String[] args){
		hello("world");
		hello("user");
		hello("Kate");

		Square s = new Square (5);
		System.out.println("Площадь квадрата со стороной "+s.l+" = "+s.area());

		Rectangle r = new Rectangle(5,2);
		System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" = "+r.area());

}
public static void hello(String somebody){
		System.out.println("Hello, "+somebody+"!");
}

}