CREATE SEQUENCE author_seq;
CREATE SEQUENCE category_seq;
CREATE SEQUENCE book_seq;

CREATE TABLE author(
    id int PRIMARY KEY default nextval('author_seq'),
    name text
);

CREATE TABLE category(
    id int PRIMARY KEY default nextval('category_seq'),
    name text
);

CREATE TABLE book(
    id int PRIMARY KEY default nextval('book_seq'),
    author_id int references author(id),
    category_id int references category(id),
    name text,
    image_url text,
    stock int,
    sale_price double precision
);
