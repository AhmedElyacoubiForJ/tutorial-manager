package edu.yacoubi.tutorialmanager.model;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        @NotBlank
        String title,
        String description,
        Status status,
        TutorialType contentTutorialType,
        ItLayerType itLayerType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
