CREATE SEQUENCE order_seq;

CREATE TABLE orders(
    id int PRIMARY KEY default nextval('order_seq'),
    adresa text,
    name text,
    email text,
    telefon text,
    books text
);
