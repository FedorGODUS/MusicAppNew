create table tickets
(
    id bigserial primary key,
    concert_id integer,
    user_id    integer,
    price      integer not null
        constraint price_greater_than_zero
            check (price > 0),
    foreign key  (concert_id) references concerts(id),
    foreign key  (user_id) references users(id)
);