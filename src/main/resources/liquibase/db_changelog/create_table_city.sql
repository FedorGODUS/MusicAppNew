create table cities
(
    id bigserial primary key,
    city_name  varchar(256),
    country_id integer,
        foreign key  (country_id) references countries(id)
);