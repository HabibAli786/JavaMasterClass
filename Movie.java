public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default ->  new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Pleasent Scene", "Scary movie", "Something bad happens");

    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure movie");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Something funny", "Something funny again", "Happy Ending");
    }

    public void watchComedy() {
        System.out.println("Watching an Comedy movie");
    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Bad Aliens do bad stuff", "Aliens are here", "Aliens are dead");
    }

    public void watchScienceFiction() {
        System.out.println("Watching an science fiction movie");
    }
}
