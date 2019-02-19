public class Homework1j {
  public static void main (String [] args) {
    Point pn1=new Point(6.0,7.0);
    Point pn2=new Point (12.0,18.0);

    System.out.println("Координаты точки " + "p1: " + pn1.x + " ; " + pn1.y);

    System.out.println("Координаты точки " + "p2: " + pn2.x + " ; " + pn2.y);

    System.out.println("Расстояние между точками "+ pn1.distance(pn2));

    System.out.println("Округленное расстояние "+ pn1.distanceFormat(pn2));

  }

  }

