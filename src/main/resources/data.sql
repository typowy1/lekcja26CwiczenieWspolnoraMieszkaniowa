--dodajemy dane do bazy
INSERT INTO wspolnota(id, name)
VALUES (1, 'Chopina 15-17'), (2, 'Kościuszki 15');

INSERT INTO budynek(id, ulica, numer_domu, wspolnota_id)
VALUES (1, 'Chopina', '15', 1), (2, 'Chopina', '17', 1), (3, 'Kościuszki', '15', 2);