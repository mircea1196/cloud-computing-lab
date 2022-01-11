truncate table book, author, category CASCADE ;

INSERT INTO author (id, name) VALUES (1, 'MIHAI EMINESCU') ;
INSERT INTO author (id, name) VALUES (2, 'NIKOS KAZANTZAKIS') ;
INSERT INTO author (id, name) VALUES (3, 'LUCY FOLEY') ;
INSERT INTO author (id, name) VALUES (4, 'MIEKO KAWAKAMI') ;
INSERT INTO author (id, name) VALUES (5, 'ANURADHA ROY') ;
INSERT INTO author (id, name) VALUES (6, 'ALEX MICHAELIDES') ;
INSERT INTO author (id, name) VALUES (7, 'MADELEINE MILLER') ;
INSERT INTO author (id, name) VALUES (8, 'MARIA SEMPLE') ;
INSERT INTO author (id, name) VALUES (9, 'EVGHENI VODOLAZKIN') ;
INSERT INTO author (id, name) VALUES (10, 'SALLY ROONEY') ;
INSERT INTO author (id, name) VALUES (11, 'ELIZABETH MACNEAL') ;
INSERT INTO author (id, name) VALUES (12, 'OCEAN VUONG') ;
INSERT INTO author (id, name) VALUES (13, 'DELIA OWENS') ;
INSERT INTO author (id, name) VALUES (14, 'MARLON JAMES') ;
INSERT INTO author (id, name) VALUES (15, 'BILL BRYSON') ;
INSERT INTO author (id, name) VALUES (16, 'FREDRIK BACKMAN') ;
INSERT INTO author (id, name) VALUES (17, 'PETER FRANKOPAN') ;
INSERT INTO author (id, name) VALUES (18, 'CLAUDIA HAMMOND') ;
INSERT INTO author (id, name) VALUES (19, 'KASSIA ST. CLAIR') ;

INSERT INTO category (id, name) VALUES (1, 'Poezie');
INSERT INTO category (id, name) VALUES (2, 'Dezvoltare Personala');
INSERT INTO category (id, name) VALUES (3, 'Thriller');
INSERT INTO category (id, name) VALUES (4, 'Psihologie');
INSERT INTO category (id, name) VALUES (5, 'Comedie');




INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (1, 1, 1, 'Somnoroase Pasarele', '', 5, 10.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (2, 2, 2, 'ASCENSIUNEA', 'https://carturesti.ro/blog/wp-content/uploads/2021/07/carti-de-citit-in-vacanta.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (3, 3, 3, 'LISTA DE INVITAȚI ', 'https://carturesti.ro/blog/wp-content/uploads/2021/07/carti-de-citit-in-concediu.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (4, 4, 4, 'POVEȘTI DE VARĂ', 'https://carturesti.ro/blog/wp-content/uploads/2021/07/carti-in-vacanta.jpg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (5, 5, 5, 'TOATE VIEȚILE PE CARE NU LE-AM TRĂIT ', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/toate-vietile-pe-care-nu-le-am-trait-300x462.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (6, 6, 1, 'PACIENTA TĂCUTĂ ', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/pacienta-tacuta-large.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (7, 7, 2, 'CIRCE ', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/circe-300x406.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (8, 8, 3, 'UNDE AI DISPĂRUT, BERNADETTE?', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/unde-ai-disparut-bernadette.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (9, 9, 4, 'BRISBANE', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/brisbane-1-300x462.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (10, 10, 5, 'OAMENI NORMALI ', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/oameni-normali-335x430.png', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (11, 11, 1, 'FABRICA DE PĂPUȘI ', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/fabrica-de-papusi-300x442.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (12, 12, 2, 'PE PĂMÂNT SUNTEM STRĂLUCITORI O CLIPĂ', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/pe-pamant-suntem-stralucitori-o-clipa-300x455.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (13, 13, 3, 'ACOLO UNDE CÂNTĂ RACII ', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/acolo-unde-canta-racii.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (14, 14, 4, 'SCURTĂ ISTORIE A ȘAPTE CRIME ', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/scurta-istorie-a-7-crime.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (15, 15, 5, 'ÎNSEMNĂRI DE PE O INSULĂ MICĂ', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/insemnari-pe-o-insula-mica-300x444.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (16, 16, 1, 'BUNICA MI-A ZIS SĂ-ȚI SPUN CĂ-I PARE RĂU', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/bunica-mi-a-zis-300x406.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (17, 17, 2, 'DRUMURILE MĂTĂSII ', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/drumurile-matasii-300x437.png', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (18, 18, 3, 'ARTA RELAXĂRII', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/arta-relaxarii-300x459.jpeg', 7, 12.5);
INSERT INTO book (id ,author_id ,category_id ,name ,image_url ,stock ,sale_price) VALUES (19, 19, 4, 'FIRUL DE AUR', 'https://carturesti.ro/blog/wp-content/uploads/2020/06/firul-de-aur-300x444.jpeg', 7, 12.5);

