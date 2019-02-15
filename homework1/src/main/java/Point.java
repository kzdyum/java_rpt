public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  //Point pt1 = new Point(x, y);
  //Point pt2 = new Point(x, y);


 // public double distance(double x, double y) {

   // return Math.sqrt(((this.x-x) * (this.x-x)) + ((this.y-y) * (this.y-y)));
 // }
  public double distance (Point p){
    return Math.sqrt(((p.x-x) * (p.x-x)) + ((p.y-y) * (p.y-y)));
  }
}