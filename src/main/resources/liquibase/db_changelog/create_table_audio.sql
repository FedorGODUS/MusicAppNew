create table audios
(
    id        bigserial primary key,
    title     varchar not null,
    author_id integer not null,
    audio     bytea,
    foreign key  (author_id) references authors(id)
);