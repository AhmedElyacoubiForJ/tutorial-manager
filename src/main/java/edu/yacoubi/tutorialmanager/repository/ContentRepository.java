package edu.yacoubi.tutorialmanager.repository;

import edu.yacoubi.tutorialmanager.model.Content;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    List<Content> findByTitleContainingIgnoreCase(String keyword);
    List<Content> findByTitleContaining(String keyword);
}
