package personal.project.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Creator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    private String email;
    private String password;

    public Creator(Long id, String username, String email, String password, String about, LocalDateTime birthday, Document document) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.about = about;
        this.birthday = birthday;
    }

    public Creator() {}

    private String about;
    private LocalDateTime birthday;

    @OneToOne(cascade = CascadeType.ALL)
    private Document document;

}
