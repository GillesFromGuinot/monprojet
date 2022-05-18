public class Cercle {
    public Point centre;
    public double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Cercle(double x, double y, double rayon) {
        this.centre=new Point(x,y);
        this.rayon=rayon;
    }

    @Override
    public String toString() {
        return "Cercle [centre=" + centre + ", rayon=" + rayon + "]";
    }
    
    
}
