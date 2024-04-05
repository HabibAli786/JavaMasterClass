import java.util.Scanner;

public class MovieNextMain {
    public static void main(String[] args) {
        Movie userMovie = Movie.getMovie("Adventure", "Hello There");
        userMovie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "JAWS");

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("Comedy", "airplane");
        airplane.watchMovie();

        var plane = new Comedy("Plane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Airplace");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }

    }
}
