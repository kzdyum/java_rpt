public class Homework1j {
  public static void main (String [] args) {

    Point p1= new Point (2,3);
    System.out.println("Координаты точки " + "p1: " + p1.x + " ; " + p1.y);

    Point p2= new Point (4,5);
    System.out.println("Координаты точки " + "p2: " + p2.x + " ; " + p2.y);

    System.out.println("Расстояние между точками "+distance(p1,p2));

  }

   public static Point p1=new Point (2.0,3.0);
   public static Point p2=new Point (4.0,5.0);
    public static double distance(Point p1,Point p2){
  return Math.sqrt(((p2.x-p1.x)*(p2.x-p1.x))+((p2.y-p1.y)*(p2.y-p1.y)));

  }

}
