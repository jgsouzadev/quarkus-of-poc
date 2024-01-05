-- Add the column to the creator table
ALTER TABLE creator
ADD COLUMN document_id BIGINT;

-- Add the foreign key constraint to the newly added column
ALTER TABLE creator
ADD CONSTRAINT fk_document
    FOREIGN KEY (document_id)
    REFERENCES document(id);