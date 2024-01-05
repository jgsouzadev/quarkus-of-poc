CREATE TABLE IF NOT EXISTS document (
    id BIGINT PRIMARY KEY,
    document BIGINT,
    type SMALLINT,
    creator_id BIGINT REFERENCES creator(id)
);
