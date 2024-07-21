package nl.css.reactive.model;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class MovieDTO {

    private String id;
    private String originalLanguage;
    private String posterPath;
    private Boolean video;
    private String title;
    private String overview;
    private Instant releaseDate;
    private Long voteCount;
    private Boolean adult;
    private String backdropPath;
    private Double voteAverage;
    private String originalTitle;
    private Double popularity;
    private String mediaType;
}
