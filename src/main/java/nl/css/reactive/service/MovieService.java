package nl.css.reactive.service;

import lombok.RequiredArgsConstructor;
import nl.css.reactive.model.MovieDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MovieService {

    public Flux<MovieDTO> getAll() {
        return Flux.just(MovieDTO.builder().id(UUID.randomUUID().toString()).build(),
                MovieDTO.builder().id(UUID.randomUUID().toString()).build(),
                MovieDTO.builder().id(UUID.randomUUID().toString()).build());
    }

    public Mono<MovieDTO> getMovieById(String movieId) {
        return Mono.just(MovieDTO.builder().id(movieId).title("Terminator 1").build());
    }

}
