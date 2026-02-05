CREATE TABLE categories(
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE books(
    id SERIAL PRIMARY KEY,
    name VARCHAR(200),
    type VARCHAR(50),
    category_id INT REFERENCES categories(id)
);