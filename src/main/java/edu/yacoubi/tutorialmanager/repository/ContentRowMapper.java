package edu.yacoubi.tutorialmanager.repository;

import edu.yacoubi.tutorialmanager.model.Content;
import edu.yacoubi.tutorialmanager.model.ItLayerType;
import edu.yacoubi.tutorialmanager.model.Status;
import edu.yacoubi.tutorialmanager.model.TutorialType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class ContentRowMapper implements RowMapper<Content> {
    @Override
    public Content mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Content(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("description"),
                Status.valueOf(rs.getString("status")),
                TutorialType.valueOf(rs.getString("tutorial_type")),
                ItLayerType.valueOf(rs.getString("it_layer_type")),
                rs.getObject("date_created", LocalDateTime.class),
                rs.getObject("date_updated",LocalDateTime.class),
                rs.getString("url"),
                rs.getString("git_hub_url")
        );
    }
}
