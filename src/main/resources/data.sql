-- Remplir la table 'utilisateur'
INSERT INTO utilisateur(email, motdepasse, nom) VALUES('pierre.dupont@example.com', 'motdepasse1', 'Pierre Dupont');
INSERT INTO utilisateur(email, motdepasse, nom) VALUES('marie.lemoine@example.com', 'motdepasse2', 'Marie Lemoine');
INSERT INTO utilisateur(email, motdepasse, nom) VALUES('jacques.martin@example.com', 'motdepasse3', 'Jacques Martin');

-- Remplir la table 'botaniste'
INSERT INTO botaniste(utilisateur_id) VALUES(1);
INSERT INTO botaniste(utilisateur_id) VALUES(2);

-- Remplir la table 'plante'
INSERT INTO plante(utilisateur_id, nom, description, photo) VALUES(1, 'Orchidée Phalaenopsis', 'Orchidée tropicale aux fleurs élégantes.', 'https://instantfloral69270.fr/wp-content/uploads/2021/05/20210505_092155-scaled.jpg');
INSERT INTO plante(utilisateur_id, nom, description, photo) VALUES(2, 'Palmier Areca', 'Palmier d’intérieur au feuillage fin et léger.', 'https://fleursenespagne.com/wp-content/uploads/2018/06/achetre-palmier-arcea-barcelone.jpg');
INSERT INTO plante(utilisateur_id, nom, description, photo) VALUES(3, 'Monstera Deliciosa', 'Plante d’intérieur aux grandes feuilles perforées.', 'https://photos.gammvert.fr/v5/products/full/51864-philodendron-monstera-3.jpeg
');

-- Remplir la table 'message'
INSERT INTO message(destinataire_id, expediteur_id, date, contenu) VALUES(1, 2, NOW(), 'Bonjour Pierre, comment vas-tu ?');
INSERT INTO message(destinataire_id, expediteur_id, date, contenu) VALUES(2, 3, NOW(), 'Salut Marie, as-tu besoin d’aide pour ton palmier ?');
INSERT INTO message(destinataire_id, expediteur_id, date, contenu) VALUES(3, 1, NOW(), 'Hey Jacques, ton Monstera a-t-il besoin de conseils ?');

-- Remplir la table 'conseil'
INSERT INTO conseil(botaniste_id, plante_id, date, contenu) VALUES(1, 2, NOW(), 'Pour le Palmier Areca, n’oublie pas de bien l’arroser, mais sans excès.');
INSERT INTO conseil(botaniste_id, plante_id, date, contenu) VALUES(2, 3, NOW(), 'Le Monstera Deliciosa aime la lumière indirecte et l’humidité.');

-- Remplir la table 'guarde'
INSERT INTO guarde(debut_date, fin_date, plante_id, utilisateur_id) VALUES('2023-01-01', '2023-01-31', 1, 2);
INSERT INTO guarde(debut_date, fin_date, plante_id, utilisateur_id) VALUES('2023-02-01', '2023-02-28', 2, 3);
INSERT INTO guarde(debut_date, fin_date, plante_id, utilisateur_id) VALUES('2023-03-01', '2023-03-31', 3, 1);
