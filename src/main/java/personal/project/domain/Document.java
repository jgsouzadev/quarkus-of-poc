package personal.project.domain;

import jakarta.persistence.*;
import personal.project.domain.enums.DocumentType;

@Entity
public class Document {
    public Document(Long id, Long document, DocumentType type, Creator creator) {
        this.id = id;
        this.document = document;
        this.type = type;
        this.creator = creator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDocument() {
        return document;
    }

    public void setDocument(Long document) {
        this.document = document;
    }

    public DocumentType getType() {
        return type;
    }

    public void setType(DocumentType type) {
        this.type = type;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long document;

    private DocumentType type;

    @OneToOne(mappedBy = "document")
    @JoinColumn(name = "creator_id")
    private Creator creator;
}