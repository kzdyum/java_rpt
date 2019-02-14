public class Homework1j {
  public static void main (String [] args) {
    Point pn1=new Point(2.0,5.0);
    Point pn2=new Point (10.0,12.0);

    System.out.println("Координаты точки " + "p1: " + pn1.x + " ; " + pn1.y);

    System.out.println("Координаты точки " + "p2: " + pn2.x + " ; " + pn2.y);

    System.out.println("Расстояние между точками "+ pn2.distance(pn1));

  }

  }

