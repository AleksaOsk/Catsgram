package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Data
@ToString
@EqualsAndHashCode (of = {"id"})
@Getter
@Setter
public class Post {
    Long id;
    long authorId;
    String description;
    Instant postDate;
}
