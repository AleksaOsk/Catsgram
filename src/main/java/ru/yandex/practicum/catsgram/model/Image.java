package ru.yandex.practicum.catsgram.model;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode (of = {"id"})
@Getter
@Setter
public class Image {
    Long id;
    long postId;
    String originalFileName;
    String filePath;
}


