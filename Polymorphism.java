import java.util.Scanner;

public class Polymorphism {

    public static void main(String[] args) {
        Movie movie = new Movie("Starwars");
        movie.watchMovie();

        Adventure adventure = new Adventure("Ha Ha Ha");
        adventure.watchMovie();

        Comedy comedy = new Comedy("Chimps");
        comedy.watchMovie();

        Movie getTypeOfMovie = Movie.getMovie("Adventure", "Welcome");
        getTypeOfMovie.watchMovie();

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, S for Science Fiction or Q for quit");
            String type = s.nextLine();

            if("Qq".contains(type)) {
                break;
            }

            System.out.println("Enter Movie Title");
            String title = s.nextLine();
            Movie userMovie = Movie.getMovie(type, title);
            userMovie.watchMovie();
        }
    }


}
