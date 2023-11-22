package edu.yacoubi.tutorialmanager.repository;

import edu.yacoubi.tutorialmanager.model.Content;
import edu.yacoubi.tutorialmanager.model.ItLayerType;
import edu.yacoubi.tutorialmanager.model.Status;
import edu.yacoubi.tutorialmanager.model.TutorialType;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentJdbcTemplateRepository implements DAO<Content, Integer> {

    private final JdbcTemplate jdbcTemplate;

    public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Content> findAll() {
        String sql = "SELECT * FROM Content";
//        BeanPropertyRowMapper propertyRowMapper =
//                new BeanPropertyRowMapper<>(Content.class);
//
//        List<Content> contents = jdbcTemplate.query(
//                sql,
//                propertyRowMapper
//        );
//        return contents;

//        return jdbcTemplate.query(
//                sql,
//                (rs, rowNum) ->
//                        new Content(
//                                rs.getInt("id"),
//                                rs.getString("title"),
//                                rs.getString("description"),
//                                Status.valueOf(rs.getString("status")),
//                                TutorialType.valueOf(rs.getString("tutorial_type")),
//                                ItLayerType.valueOf(rs.getString("it_layer_type")),
//                                rs.getObject("date_created", LocalDateTime.class),
//                                rs.getObject("date_updated",LocalDateTime.class),
//                                rs.getString("url")
//                        )
//        );

        return jdbcTemplate.query(
                sql,
                new ContentRowMapper()
        );
    }

    @Override
    public void create(Content content) {

    }

    @Override
    public Optional<Content> findById(Integer id) {
        String sql = "SELECT * FROM Content WHERE ID = ?";
        return Optional.ofNullable(
                jdbcTemplate.queryForObject(
                        sql,
                        new Object[]{id},
                        new ContentRowMapper()
                )
        );
    }

    @Override
    public void update(Content content, Integer id) {

    }

    @Override
    public void delete(Integer id) {

    }
}
