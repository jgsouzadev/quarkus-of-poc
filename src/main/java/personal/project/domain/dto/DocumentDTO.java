package personal.project.domain.dto;

import personal.project.domain.enums.DocumentType;

public record DocumentDTO(
        Long documentValue,
        DocumentType type,
        Long creatorId
) {
    public DocumentDTO(Long documentValue, DocumentType type, Long creatorId) {
        this.documentValue = documentValue;
        this.type = type;
        this.creatorId = creatorId;
    }
}
