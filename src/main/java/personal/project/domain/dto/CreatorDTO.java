package personal.project.domain.dto;

import personal.project.domain.Creator;

import java.time.LocalDateTime;

public record CreatorDTO(
        String username,
        String email,
        String password,
        String about,
        LocalDateTime birthday,
        DocumentDTO document
) {
    public CreatorDTO(String username, String email, String password, String about, LocalDateTime birthday, DocumentDTO document) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.about = about;
        this.birthday = birthday;
        this.document = document;
    }
}
