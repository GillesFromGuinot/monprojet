import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        // nombre d'itération
        long iteration = 1000000000l;
        // cercle de rayon 1 et de centre 0,0
        Cercle c = new Cercle(0, 0, 1);
        // Nombre de points dans le cercle
        long dedans = 0;

        for (long i = 0; i < iteration; i++) {
            Point p = new Point(2 * Math.random() - 1, 2 * Math.random() - 1);
            if (Point.distance(c.centre, p) <= c.rayon)
                dedans++;
        }

        System.out.println("iteration : " + iteration + ", dedans : " + dedans);

        // dedans/iteration = surface du cercle/surface du carré = PI/4
        System.out.println("valeur de PI : " + (4.0 * dedans / iteration));

    }
}
