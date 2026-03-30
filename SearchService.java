import java.util.List;

public interface SearchService {
    List<Movie> getMoviesByCity(String city);
    List<Theatre> getTheatresByCity(String city);
    List<Show> getShowsByMovie(String movieId);
}
