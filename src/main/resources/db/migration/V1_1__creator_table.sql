CREATE TABLE IF NOT EXISTS creator (
    id BIGINT PRIMARY KEY,
    username VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    about TEXT,
    birthday TIMESTAMP
);