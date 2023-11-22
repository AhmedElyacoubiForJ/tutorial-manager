package edu.yacoubi.tutorialmanager.repository;

import edu.yacoubi.tutorialmanager.model.Content;
import edu.yacoubi.tutorialmanager.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    List<Content> findByTitleContainingIgnoreCase(String keyword);
    List<Content> findByTitleContaining(String keyword);

    @Query("""
            SELECT * FROM Content
            WHERE status = :status
            """)
    List<Content> listByStatus(@Param("status") Status status);
    // is like listByStatus
    List<Content> findByStatus(Status status);

}
