--liquibase formatted sql
--changeset groot:insert-test-data splitStatements:true endDelimiter:;

INSERT INTO roles
VALUES (102, 'USER');


INSERT INTO users (id, date_of_birth, name, password, role_id)
VALUES (116, '1984-06-07', 'Viki', 'ky1r2PIl', 102),
       (117, '1998-08-25', 'Konstance', 'F3f7m9Kj', 102),
       (118, '1972-05-03', 'Cristine', 'Eh0Lk6n6', 102),
       (119, '2000-08-03', 'Fidelia', '8ojr7Vpy', 102),
       (121, '1987-11-06', 'Jessamyn', '8jxRO4bh', 102);





