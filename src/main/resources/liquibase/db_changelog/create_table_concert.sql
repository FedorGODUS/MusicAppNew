create table concerts
(
    id bigserial primary key,
    title        varchar not null,
    performer    varchar not null,
    concert_date date,
    city_id      integer,
    foreign key  (city_id) references cities(id)
);
