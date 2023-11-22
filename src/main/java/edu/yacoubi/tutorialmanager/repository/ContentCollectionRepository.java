package edu.yacoubi.tutorialmanager.repository;

import edu.yacoubi.tutorialmanager.model.Content;
import edu.yacoubi.tutorialmanager.model.ItLayerType;
import edu.yacoubi.tutorialmanager.model.Status;
import edu.yacoubi.tutorialmanager.model.TutorialType;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository implements DAO<Content, Integer>{

    private final List<Content> contents = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    @Override
    public List<Content> findAll() {
        return contents;
    }

    @Override
    public void create(Content content) {
        contents.add(content);
    }

    @Override
    public void update(Content content, Integer id) {
        contents.removeIf(c -> c.getId().equals(content.getId()));
        contents.add(content);
    }

    @Override
    public void delete(Integer id) {
        contents.removeIf(c -> c.getId().equals(id));
    }

    @Override
    public Optional<Content> findById(Integer id) {
        return contents.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    public boolean existsById(Integer id) {
        return contents.stream()
                .filter(c -> c.getId().equals(id)).count() == 1;
    }

    @PostConstruct
    private void init() {
        Content content = new Content(
                1,
                "Spring Boot Rest API",
                "simple repo, jdbc template, ListCrudRepository",
                Status.IDEA,
                TutorialType.VIDEO,
                ItLayerType.BACK_END,
                LocalDateTime.now(),
                null,
                "https://www.youtube.com/watch?v=UgX5lgv4uVM&t=3694s");
        contents.add(content);
    }
}
