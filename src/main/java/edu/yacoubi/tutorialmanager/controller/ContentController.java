package edu.yacoubi.tutorialmanager.controller;

import edu.yacoubi.tutorialmanager.model.Content;
import edu.yacoubi.tutorialmanager.repository.ContentCollectionRepository;
import edu.yacoubi.tutorialmanager.repository.ContentJdbcTemplateRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/contents")
// TODO create, read, update and delete | filter, paging and sorting
public class ContentController {

    private final ContentCollectionRepository repository;
    private final ContentJdbcTemplateRepository contentJdbcTemplateRepository;

    public ContentController(ContentCollectionRepository repository,
                             ContentJdbcTemplateRepository contentJdbcTemplateRepository) {
        this.repository = repository;
        this.contentJdbcTemplateRepository = contentJdbcTemplateRepository;
    }

    @GetMapping("")
    public List<Content> getAll() {
        return contentJdbcTemplateRepository.findAll();
        //return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Content> getById(@PathVariable Integer id) {
        return Optional.ofNullable(
                repository.findById(id)
                        .orElseThrow(() -> {
                            throw new ResponseStatusException(
                                    HttpStatus.NOT_FOUND,
                                    "content not found."
                            );
                        }
                        )
        );
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@Valid @RequestBody Content content) {
        repository.create(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(
            @RequestBody Content content,
            @PathVariable Integer id) {

        if(!repository.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "content not found."
            );
        }
        repository.update(content, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
