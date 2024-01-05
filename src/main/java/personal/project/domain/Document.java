package personal.project.domain;

import jakarta.persistence.*;
import personal.project.domain.enums.DocumentType;

@Entity
public class Document {
    public Document(Long id, Long document, DocumentType type, Creator creator) {
        this.id = id;
        this.document = document;
        this.type = type;
    }

    public Document() {
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


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long document;

    private DocumentType type;


    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", document=" + document +
                ", type=" + type +
                '}';
    }

    @OneToOne(mappedBy = "document")
    @JoinColumn(name = "creator_id")
    private Creator creator;
}