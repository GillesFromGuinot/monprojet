public class Point {
    public double x;
    public double y;

    public Point(double a,double b) {
        this.x=a;
        this.y=b;
    }

    public String toString() {
        return "x : " + this.x + " y : " + this.y;
    }

    public static double distance(Point a, Point b) {                
        return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
    }
}
