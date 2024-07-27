package nl.css.reactive.service;

import nl.css.reactive.model.MovieDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import java.util.function.Function;


@SpringBootTest
class MovieServiceTest {

    @Autowired
    private MovieService movieService;

    Function<MovieDTO, String> mapper = s -> {
        System.out.println("s => " + s.getId());
        return s.getId().toLowerCase();
    };

    @Test
    public void shouldReturnMovieByID() {
        String movieId = "TTTTTTT";
        Mono<MovieDTO> movieDTO = movieService.getMovieById(movieId).log();
        movieDTO.map(mapper).subscribe(s -> System.out.println("s => " + s));

    }

}