create database leerlingen_database;
use leerlingen_database;
create table Leerlinggegevens(leerlingen_id INT NOT NULL AUTO_INCREMENT,
Achternaam varchar(50), Voorvoegsel varchar(50), Voorletters varchar(50), Voornamen varchar(50),
 Roepnaam varchar(50), geslacht enum('man','vrouw'), Adres varchar(100), Huisnummer varchar(15), Woonplaats varchar(50), Postcode varchar(50),
 Telefoon varchar(20), Geboorteplaats varchar(50), Geboortedatum date, Geboorteland varchar(50), Nationaliteiten varchar(50), BSNNummer varchar(50),
   PRIMARY KEY ( leerlingen_id ));

create table Gegevens_Basisschool(basisschool_id INT NOT NULL AUTO_INCREMENT, `leerlingen_id` int NOT NULL, naam_school varchar(50) ,Plaats varchar(50) ,Schooladvies varchar(50) ,
Contactpersoon varchar(50) ,Telefoon varchar(20) ,cito_score int, PRIMARY KEY ( basisschool_id ),
CONSTRAINT `leerling_basisschool` FOREIGN KEY (`leerlingen_id`) REFERENCES `Leerlinggegevens` (`leerlingen_id`));

create table Aanvullende_leerlinggegevens(aanvullend_id INT NOT NULL AUTO_INCREMENT, `leerlingen_id` int NOT NULL, Medische_bijzonderheden varchar(50) ,Medicijn_gebruik tinyint ,In_Nederland_sinds date ,
Godsdienst varchar(50) ,Behoefte_aan_bijzondere_zorg varchar(50) ,Zwemdiploma tinyint ,Broer_Zus_op_HLW varchar(50) ,
Plaatsingswensen varchar(50) ,Opmerkingen text, PRIMARY KEY ( aanvullend_id ),
CONSTRAINT `leerling_aanvullend` FOREIGN KEY (`leerlingen_id`) REFERENCES `Leerlinggegevens` (`leerlingen_id`));

create table Gegevens_ouder_verzorger(verzorger_id INT NOT NULL AUTO_INCREMENT, `leerlingen_id` int NOT NULL, Achternaam varchar(50) ,Voorvoegsel varchar(50) ,Voornaam varchar(50) ,Voorletters varchar(50) ,
Adres varchar(50) ,Huisnummer varchar(15),Postcode varchar(50), Woonplaats varchar(50) ,Telefoonnummer varchar(20),
Telefoonnummer_type enum('prive','werk','geheim') ,Mobielnummer varchar(20), Mobielnummer_type enum('prive', 'werk', 'geheim') ,Email varchar(50) ,
Geboorteland varchar(50) ,Geboortedatum date ,Nationaliteit varchar(50) ,Geslacht enum('man','vrouw') ,
Relatie_tot_leerling enum('vader','moeder','pleegouder','voogd') ,
Burgelijke_staat enum('gehuwd','ongehuwd','samenwonend','gescheiden','weduwe','weduwenaar') , PRIMARY KEY ( verzorger_id ),
CONSTRAINT `leerling_ouder` FOREIGN KEY (`leerlingen_id`) REFERENCES `Leerlinggegevens` (`leerlingen_id`));

create table Zij_instromers_gegevens_vorig_school(instromers_id INT NOT NULL AUTO_INCREMENT, `leerlingen_id` int NOT NULL, Naam_school varchar(50) ,Plaats varchar(50) ,
Naam_contact_persoon varchar(50) ,Telefoonnummer varchar(20), PRIMARY KEY (instromers_id),
	CONSTRAINT `leerling_instroom` FOREIGN KEY (`leerlingen_id`) REFERENCES `Leerlinggegevens` (`leerlingen_id`));