package nl.css.reactive.test;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxTest {

    // b2b384b390dfe50dcf9c612c439b9a6c
    @Test
    public void fluxTest() {

        Flux<String> stringFlux  = Flux.just("Spring", "Spring boot", "Reactive Spring boot")
                //.concatWith(Flux.error(new RuntimeException("Error Occurred")))
                .concatWith(Flux.just("After Error"))
                .log();

        stringFlux.map(name -> name.concat(" Reactive"))
                .subscribe(System.out::println, this::exceptionHandle, this::print);
    }

    private void exceptionHandle(Throwable e) {
        System.out.println("ERROOOOOOOR: " + e.getMessage());
    }

    private void print() {
        System.out.println("Completed !!!");
    }

}
