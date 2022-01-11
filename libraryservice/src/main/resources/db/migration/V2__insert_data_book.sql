INSERT INTO author (id, name) VALUES (1, 'Mihai Eminescu') ;

INSERT INTO category (id, name) VALUES (1, 'Poezie');

INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (1, 1, 1, 'Somnoroase Pasarele', '', 5, 10.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (2, 1, 1, 'Luceafarul', '', 7, 12.5);
