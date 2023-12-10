package edu.yacoubi.tutorialmanager.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public final class Content {
        @Id
        private Integer id;
        private @NotBlank String title;
        private String description;
        private Status status;
        private TutorialType tutorialType;
        private ItLayerType itLayerType;
        private LocalDateTime dateCreated;
        private LocalDateTime dateUpdated;
        private String url;
        private String gitHubUrl;

        public Content() {
        }

//        public Content(
//                Integer id,
//                @NotBlank
//                String title,
//                String description,
//                Status status,
//                TutorialType tutorialType,
//                ItLayerType itLayerType,
//                LocalDateTime dateCreated,
//                LocalDateTime dateUpdated,
//                String url
//        ) {
//                this.id = id;
//                this.title = title;
//                this.description = description;
//                this.status = status;
//                this.tutorialType = tutorialType;
//                this.itLayerType = itLayerType;
//                this.dateCreated = dateCreated;
//                this.dateUpdated = dateUpdated;
//                this.url = url;
//        }

        public Content(
                Integer id,
                @NotBlank
                String title,
                String description,
                Status status,
                TutorialType tutorialType,
                ItLayerType itLayerType,
                LocalDateTime dateCreated,
                LocalDateTime dateUpdated,
                String url,
                String gitHubUrl
        ) {
                this.id = id;
                this.title = title;
                this.description = description;
                this.status = status;
                this.tutorialType = tutorialType;
                this.itLayerType = itLayerType;
                this.dateCreated = dateCreated;
                this.dateUpdated = dateUpdated;
                this.url = url;
                this.gitHubUrl = gitHubUrl;
        }

        public Integer getId() {
                return id;
        }

        public String getTitle() {
                return title;
        }

        public String getDescription() {
                return description;
        }

        public Status getStatus() {
                return status;
        }

        public TutorialType getTutorialType() {
                return tutorialType;
        }

        public ItLayerType getItLayerType() {
                return itLayerType;
        }

        public LocalDateTime getDateCreated() {
                return dateCreated;
        }

        public LocalDateTime getDateUpdated() {
                return dateUpdated;
        }

        public String getUrl() {
                return url;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public void setStatus(Status status) {
                this.status = status;
        }

        public void setTutorialType(TutorialType tutorialType) {
                this.tutorialType = tutorialType;
        }

        public void setItLayerType(ItLayerType itLayerType) {
                this.itLayerType = itLayerType;
        }

        public void setDateCreated(LocalDateTime dateCreated) {
                this.dateCreated = dateCreated;
        }

        public void setDateUpdated(LocalDateTime dateUpdated) {
                this.dateUpdated = dateUpdated;
        }

        public void setUrl(String url) {
                this.url = url;
        }

        public String getGitHubUrl() {
                return gitHubUrl;
        }

        public void setGitHubUrl(String gitHubUrl) {
                this.gitHubUrl = gitHubUrl;
        }

        @Override
        public String toString() {
                return "Content{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", description='" + description + '\'' +
                        ", status=" + status +
                        ", tutorialType=" + tutorialType +
                        ", itLayerType=" + itLayerType +
                        ", dateCreated=" + dateCreated +
                        ", dateUpdated=" + dateUpdated +
                        ", url='" + url + '\'' +
                        ", gitHubUrl='" + gitHubUrl + '\'' +
                        '}';
        }
}
