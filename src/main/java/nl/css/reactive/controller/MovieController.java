package nl.css.reactive.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import nl.css.reactive.model.MovieDTO;
import nl.css.reactive.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.UUID;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/all")
    public Flux<MovieDTO> getAll() {
        return movieService.getAll().log();
    }

}
