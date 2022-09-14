create table users
(
    id bigserial primary key,
    username varchar not null unique,
    password varchar,
    city_id integer,
    subscription_id integer,
    author integer,
    role integer,
    foreign key  (city_id) references cities(id),
    foreign key  (subscription_id) references subscriptions(id),
    foreign key  (role) references role(id)

);