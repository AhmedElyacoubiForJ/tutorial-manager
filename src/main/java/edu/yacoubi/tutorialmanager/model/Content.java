package edu.yacoubi.tutorialmanager.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        TutorialType contentTutorialType,
        ItLayerType itLayerType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
