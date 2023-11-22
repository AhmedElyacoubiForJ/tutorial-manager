CREATE TABLE IF NOT EXISTS Content (
    id SERIAL PRIMARY KEY ,
    title varchar(255) NOT NULL,
    description text,
    status VARCHAR(20) NOT NULL,
    tutorial_type VARCHAR(50) NOT NULL,
    it_layer_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255)
);

--insert into Content(title,description,status, tutorial_type, it_layer_type, date_created)
--VALUES ('some','jdbc','IDEA', 'VIDEO', 'BACK_END', CURRENT_TIMESTAMP);